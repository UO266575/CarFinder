package com.carfinder.carfinder.infrastructure.repositories;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders;
import co.elastic.clients.elasticsearch.core.GetResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import com.carfinder.carfinder.domain.Question;
import com.carfinder.carfinder.domain.QuestionAdapter;
import com.carfinder.carfinder.domain.exceptions.RepositoryException;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

@Repository
public class QuestionRepository implements QuestionAdapter {

    private final ElasticsearchClient elasticsearchClient;

    public QuestionRepository(ElasticsearchClient elasticsearchClient) {
        this.elasticsearchClient = elasticsearchClient;
    }

    @Override
    public List<Question> getQuestions() {
        try {
            return elasticsearchClient.search(s -> s
                            .index("questions")
                            .query(QueryBuilders.matchAll(q -> q))
                            .size(1000), Question.class)
                    .hits().hits().stream().map(Hit::source).toList();
        } catch (IOException e) {
            throw new RepositoryException("Error getting all questions:", e);
        }
    }

    @Override
    public Question getQuestionById(String id) {
        try {
            GetResponse<Question> response = elasticsearchClient.get(g -> g
                    .index("questions")
                    .id(id), Question.class);
            return response.source();
        } catch (IOException e) {
            throw new RepositoryException("Error getting question by id: " + id, e);
        }
    }

    @Override
    public void addQuestion(Question question) {
        try {
            elasticsearchClient.index(i -> i
                    .index("questions")
                    .id(question.id())
                    .document(question));
        } catch (IOException e) {
            throw new RepositoryException("Error adding question:", e);
        }
    }

    @Override
    public void updateQuestion(String id, Question question) {
        try {
            elasticsearchClient.index(i -> i
                    .index("questions")
                    .id(id)
                    .document(question));
        } catch (IOException e) {
            throw new RepositoryException("Error updating question:", e);
        }
    }

    @Override
    public void deleteQuestion(String id) {
        try {
            elasticsearchClient.delete(d -> d
                    .index("questions")
                    .id(id));
        } catch (IOException e) {
            throw new RepositoryException("Error deleting question:", e);
        }
    }

    @Override
    public void deleteAllQuestions() {
        try {
            elasticsearchClient.deleteByQuery(d -> d
                    .index("questions")
                    .query(QueryBuilders.matchAll(q -> q)));
        } catch (IOException e) {
            throw new RepositoryException("Error deleting all questions:", e);
        }
    }
}
