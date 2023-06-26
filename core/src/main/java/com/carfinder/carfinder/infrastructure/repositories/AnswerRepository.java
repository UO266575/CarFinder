package com.carfinder.carfinder.infrastructure.repositories;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders;
import co.elastic.clients.elasticsearch.core.GetResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import com.carfinder.carfinder.domain.Answer;
import com.carfinder.carfinder.domain.AnswerAdapter;
import com.carfinder.carfinder.domain.exceptions.RepositoryException;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

@Repository
public class AnswerRepository implements AnswerAdapter {

    private final ElasticsearchClient elasticsearchClient;

    public AnswerRepository(ElasticsearchClient elasticsearchClient) {
        this.elasticsearchClient = elasticsearchClient;
    }

    @Override
    public List<Answer> getAnswers() {
        try {
            return elasticsearchClient.search(s -> s
                            .index("answers")
                            .query(QueryBuilders.matchAll(q -> q))
                            .size(1000), Answer.class)
                    .hits().hits().stream().map(Hit::source).toList();
        } catch (IOException e) {
            throw new RepositoryException("Error getting all answers:", e);
        }
    }

    @Override
    public Answer getAnswerById(String id) {
        try {
            GetResponse<Answer> response = elasticsearchClient.get(g -> g
                    .index("answers")
                    .id(id), Answer.class);
            return response.source();
        } catch (IOException e) {
            throw new RepositoryException("Error getting answer by id: " + id, e);
        }
    }

    @Override
    public void addAnswer(Answer answer) {
        try {
            elasticsearchClient.index(i -> i
                    .index("answers")
                    .id(answer.id())
                    .document(answer));
        } catch (IOException e) {
            throw new RepositoryException("Error adding answer:", e);
        }
    }

    @Override
    public void addAnswers(List<Answer> answers) {
        try {
            for (Answer answer : answers) {
                elasticsearchClient.index(i -> i
                        .index("answers")
                        .id(answer.id())
                        .document(answer));
            }
        } catch (IOException e) {
            throw new RepositoryException("Error adding answer:", e);
        }
    }

    @Override
    public void updateAnswer(String id, Answer answer) {
        try {
            elasticsearchClient.index(i -> i
                    .index("answers")
                    .id(id)
                    .document(answer));
        } catch (IOException e) {
            throw new RepositoryException("Error updating answer:", e);
        }
    }

    @Override
    public void deleteAnswer(String id) {
        try {
            elasticsearchClient.delete(d -> d
                    .index("answers")
                    .id(id));
        } catch (IOException e) {
            throw new RepositoryException("Error deleting answer:", e);
        }
    }
}
