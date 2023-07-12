package com.carfinder.carfinder.application;

import com.carfinder.carfinder.domain.Answer;
import com.carfinder.carfinder.domain.Filter;
import com.carfinder.carfinder.domain.Question;
import com.carfinder.carfinder.domain.Quiz;
import com.carfinder.carfinder.infrastructure.external.adapters.AdsRetrieverAdapter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuizService {

    private Quiz quiz;

    private final QuestionService questionService;

    private final AnswerService answerService;

    private final AdsRetrieverAdapter adsRetrieverAdapter;

    public QuizService(QuestionService questionService, AnswerService answerService, AdsRetrieverAdapter adsRetrieverAdapter) {
        this.questionService = questionService;
        this.answerService = answerService;
        this.adsRetrieverAdapter = adsRetrieverAdapter;
        this.quiz = new Quiz();
    }


    public void processAnswerSelection(Answer answer) {
        answer.score().forEach(i -> quiz.calculateFilter(i));
    }

    public List<Filter> getHigherFilters() {
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

    public String getCarAds(){
        Map<String,Integer> queryParams = new HashMap<String, Integer>();
        for(Filter filter : getHigherFilters()){
            queryParams.put(filter.externalIdentificator, filter.externalValue);
        }
        return adsRetrieverAdapter.callAPI(queryParams);
    }
}