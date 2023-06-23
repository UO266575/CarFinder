package com.carfinder.carfinder.application;

import com.carfinder.carfinder.domain.Answer;
import com.carfinder.carfinder.domain.AnswerAdapter;
import com.carfinder.carfinder.domain.exceptions.RepositoryException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    private final AnswerAdapter answerAdapter;

    public AnswerService(AnswerAdapter answerAdapter) {
        this.answerAdapter = answerAdapter;
    }


    public void addAnswers(List<Answer> answers) {
        answerAdapter.addAnswers(answers);
    }

    public Answer getAnswerById(String id) {
        Answer answer;
        try {
            answer = answerAdapter.getAnswerById(id);
        } catch (RepositoryException re) {
            return null;
        }
        return answer;
    }
}
