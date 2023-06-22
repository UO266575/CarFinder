package com.carfinder.carfinder.application;

import com.carfinder.carfinder.domain.Question;
import com.carfinder.carfinder.domain.QuestionAdapter;
import com.carfinder.carfinder.domain.exceptions.RepositoryException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionAdapter questionAdapter;

    public QuestionService(QuestionAdapter questionAdapter) {
        this.questionAdapter = questionAdapter;
    }

    public List<Question> getQuestions() {
        List<Question> questions;
        try {
            questions = questionAdapter.getQuestions();
        } catch (RepositoryException re) {
            return null;
        }
        return questions;
    }

    public Question getQuestionById(String id) {
        Question question;
        try {
            question = questionAdapter.getQuestionById(id);
        } catch (RepositoryException re) {
            return null;
        }
        return question;
    }

    public boolean addQuestion(Question question) {
        try {
            questionAdapter.addQuestion(question);
        } catch (RepositoryException re) {
            return false;
        }
        return true;
    }

    public boolean updateQuestion(String id, Question question) {
        if (getQuestionById(id) == null) {
            return false;
        }
        try {
            questionAdapter.updateQuestion(id, question);
        } catch (RepositoryException re) {
            return false;
        }
        return true;
    }

    public boolean deleteQuestion(String id) {
        if (getQuestionById(id) == null) {
            return false;
        }
        try {
            questionAdapter.deleteQuestion(id);
        } catch (RepositoryException re) {
            return false;
        }
        return true;
    }
}
