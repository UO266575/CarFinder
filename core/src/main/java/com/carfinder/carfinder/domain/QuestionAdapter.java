package com.carfinder.carfinder.domain;

import java.util.List;

public interface QuestionAdapter {
    List<Question> getQuestions();

    Question getQuestionById(Long id);

    void addQuestion(Question question);
    void updateQuestion(Long id, Question question);

    void deleteQuestion(Long id);
}
