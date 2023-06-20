package com.carfinder.carfinder.infrastructure.repositories;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.GetResponse;
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
        return null;
    }

    @Override
    public Question getQuestionById(String id) {
        try {
            GetResponse<Question> response = elasticsearchClient.get( g -> g
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
            elasticsearchClient.index( i -> i
                    .index("questions")
                    .id(question.id())
                    .document(question));
        } catch (IOException e) {
            throw new RepositoryException("Error adding question:", e);
        }
    }

    @Override
    public void updateQuestion(Long id, Question question) {

    }

    @Override
    public void deleteQuestion(Long id) {

    }
}