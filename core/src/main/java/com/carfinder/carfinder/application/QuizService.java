package com.carfinder.carfinder.application;

import com.carfinder.carfinder.domain.Answer;
import com.carfinder.carfinder.domain.Filter;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    private Filter filter;

    public QuizService() {
        this.filter = new Filter();
    }


    public void processAnswerSelection(Answer answer) {
        answer.score().forEach(filter::calculateFilter);
    }
}