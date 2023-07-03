package com.carfinder.carfinder.domain;

import java.util.List;

public interface QuestionAdapter {
    List<Question> getQuestions();

    Question getQuestionById(String id);

    void addQuestion(Question question);

    void updateQuestion(String id, Question question);

    void deleteQuestion(String id);

    void deleteAllQuestions();
}
