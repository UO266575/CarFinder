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

    public List<Answer> getAnswers() {
        List<Answer> answers;
        try {
            answers = answerAdapter.getAnswers();
        } catch (RepositoryException re) {
            return null;
        }
        return answers;
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

    public boolean addAnswer(Answer answer) {
        try {
            answerAdapter.addAnswer(answer);
        } catch (RepositoryException re) {
            return false;
        }
        return true;
    }

    public boolean addAnswers(List<Answer> answers) {
        try {
            answerAdapter.addAnswers(answers);
        } catch (RepositoryException re) {
            return false;
        }
        return true;
    }

    public boolean updateAnswer(String id, Answer question) {
        if (getAnswerById(id) == null) {
            return false;
        }
        try {
            answerAdapter.updateAnswer(id, question);
        } catch (RepositoryException re) {
            return false;
        }
        return true;
    }

    public boolean deleteAnswer(String id) {
        if (getAnswerById(id) == null) {
            return false;
        }
        try {
            answerAdapter.deleteAnswer(id);
        } catch (RepositoryException re) {
            return false;
        }
        return true;
    }
}
