package com.carfinder.carfinder.domain;

import java.util.List;

public interface AnswerAdapter {

    List<Answer> getAnswers();

    Answer getAnswerById(String id);

    void addAnswer(Answer answer);

    void addAnswers(List<Answer> answer);

    void updateAnswer(String id, Answer answer);

    void deleteAnswer(String id);
}
