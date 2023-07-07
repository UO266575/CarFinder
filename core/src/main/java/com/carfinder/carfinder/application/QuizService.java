package com.carfinder.carfinder.application;

import com.carfinder.carfinder.domain.Answer;
import com.carfinder.carfinder.domain.Filter;
import com.carfinder.carfinder.domain.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    private Filter filter;

    private final QuestionService questionService;

    public QuizService(QuestionService questionService) {
        this.questionService = questionService;
        this.filter = new Filter();
    }


    public void processAnswerSelection(Answer answer) {
        answer.score().forEach(filter::calculateFilter);
    }

    public List<Question> retrieveFiveQuestions() {
        return questionService.retrieveFiveQuestions();
    }
}