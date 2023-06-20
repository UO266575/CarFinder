package com.carfinder.carfinder.infrastructure.repositories;

import com.carfinder.carfinder.domain.Question;
import com.carfinder.carfinder.domain.QuestionAdapter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionRepository implements QuestionAdapter {
    @Override
    public List<Question> getQuestions() {
        return null;
    }

    @Override
    public Question getQuestionById(Long id) {
        return null;
    }

    @Override
    public void addQuestion(Question question) {

    }

    @Override
    public void updateQuestion(Long id, Question question) {

    }

    @Override
    public void deleteQuestion(Long id) {

    }
}
