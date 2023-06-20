package com.carfinder.carfinder.domain;

import java.util.List;

public interface AnswerAdapter {
    List<Answer> getAnswers();

    Answer getAnswerById(Long id);

    void addAnswer(Answer answer);
    void updateAnswer(Long id, Answer answer);

    void deleteAnswer(Long id);
}
