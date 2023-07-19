package com.carfinder.carfinder.application;

import com.carfinder.carfinder.domain.*;
import com.carfinder.carfinder.infrastructure.external.adapters.AdsRetrieverAdapter;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuizService {

    private Quiz quiz;

    private final QuestionService questionService;

    private final AnswerService answerService;

    private final AdsRetrieverAdapter adsRetrieverAdapter;

    private final HttpSession httpSession;

    public enum OrderType {
        DEFAULT,
        PRICE_ASC,
        PRICE_DESC
    }

    public QuizService(QuestionService questionService, AnswerService answerService, AdsRetrieverAdapter adsRetrieverAdapter, HttpSession httpSession) {
        this.questionService = questionService;
        this.answerService = answerService;
        this.adsRetrieverAdapter = adsRetrieverAdapter;
        this.httpSession = httpSession;
        this.quiz = new Quiz();
    }


    public void processAnswerSelection(Answer answer) {
        answer.score().forEach(i -> calculateFilter(i));
    }

    public void processAnswerSelection(List<String> answers) {
        answers.stream()
                .map(answerId -> answerService.getAnswerById(answerId))
                .forEach(this::processAnswerSelection);
    }

    public List<Question> retrieveFiveQuestions() {
        return questionService.retrieveFiveQuestions();
    }

    public List<Ad> getCarAds(OrderType orderType){
        Map<String,Integer> queryParams = new HashMap<String, Integer>();
        for(Filter filter : getHigherFilters()){
            queryParams.put(filter.externalIdentificator, filter.externalValue);
        }
        List<Ad> ads = adsRetrieverAdapter.callAPI(queryParams);
        switch(orderType) {
            case PRICE_ASC:
                ads.sort((ad1, ad2) -> Float.compare(ad1.price(), ad2.price()));
                break;
            case PRICE_DESC:
                ads.sort((ad1, ad2) -> Float.compare(ad2.price(), ad1.price()));
                break;
            default:
                break;
        }
        return ads;
    }

    public void calculateFilter(Filter filter) {
        Set<Filter> filters = (Set<Filter>) httpSession.getAttribute("filters");
        if (filters == null) {
            filters = new HashSet<Filter>();
        }
        boolean found = false;
        for (Filter existingFilter : filters) {
            if (filter.internalIdentificator.equals(existingFilter.internalIdentificator)) {
                existingFilter.value += filter.value;
                found = true;
                break;
            }
        }
        if (!found) {
            filters.add(filter);
        }
        httpSession.setAttribute("filters", filters);
    }

    public List<Filter> getHigherFilters() {
        Set<Filter> filters = (Set<Filter>) httpSession.getAttribute("filters");
        if (filters == null) {
            filters = new HashSet<Filter>();
        }
        List<Filter> higherFilters = new ArrayList<Filter>();
        int maxBrandIdValue = 0;
        Filter maxBrandIdFilter = null;
        for (Filter filter : filters) {
            switch (filter.externalIdentificator) {
                case "brand_id":
                    if (filter.value > maxBrandIdValue) {
                        maxBrandIdValue = filter.value;
                        maxBrandIdFilter = filter;
                    }
                    break;
                case "vehicle_type_ids", "emission_sticker_ids", "gearbox_ids", "min_kms", "min_cv":
                    if (filter.value > 40) {
                        higherFilters.add(filter);
                    }
                    break;
            }
        }
        if (maxBrandIdValue > 0) {
            higherFilters.add(maxBrandIdFilter);
        }
        return higherFilters;
    }
}