package com.carfinder.carfinder.application;

import com.carfinder.carfinder.domain.Answer;
import com.carfinder.carfinder.domain.Filter;
import com.carfinder.carfinder.domain.Question;
import com.carfinder.carfinder.domain.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    private Quiz quiz;

    private final QuestionService questionService;

    private final AnswerService answerService;

    public QuizService(QuestionService questionService, AnswerService answerService) {
        this.questionService = questionService;
        this.answerService = answerService;
        this.quiz = new Quiz();
    }


    public void processAnswerSelection(Answer answer) {
        answer.score().forEach( i -> quiz.calculateFilter(i));
    }

    public List<Filter> getHigherFilters(){
        return quiz.getHigherFilters();
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