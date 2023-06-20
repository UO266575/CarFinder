package com.carfinder.carfinder.infrastructure.repositories;

import com.carfinder.carfinder.domain.Answer;
import com.carfinder.carfinder.domain.AnswerAdapter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnswerRepository implements AnswerAdapter {
    @Override
    public List<Answer> getAnswers() {
        return null;
    }

    @Override
    public Answer getAnswerById(Long id) {
        return null;
    }

    @Override
    public void addAnswer(Answer answer) {

    }

    @Override
    public void updateAnswer(Long id, Answer answer) {

    }

    @Override
    public void deleteAnswer(Long id) {

    }
}
