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

    private final AnswerService answerService;

    public QuizService(QuestionService questionService, AnswerService answerService) {
        this.questionService = questionService;
        this.answerService = answerService;
        this.filter = new Filter();
    }


    public void processAnswerSelection(Answer answer) {
        answer.score().forEach(filter::calculateFilter);
    }

    public void processAnswerSelection(List<String> answers) {
        answers.stream()
                .map(answerId -> answerService.getAnswerById(answerId))
                .forEach(this::processAnswerSelection);
    }

    public List<Question> retrieveFiveQuestions() {
        return questionService.retrieveFiveQuestions();
    }
}