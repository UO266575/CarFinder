package com.carfinder.carfinder.application;

import com.carfinder.carfinder.domain.Question;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class InsertDefaultQuestions {

    private final QuestionService questionService;

    private final AnswerService answerService;

    public InsertDefaultQuestions(QuestionService questionService, AnswerService answerService) {
        this.questionService = questionService;
        this.answerService = answerService;
    }

    public void insertQuestions(){
        List<Question> questions = deserialize();
        for (Question question: questions) {
            answerService.addAnswers(question.answers());
            questionService.addQuestion(question);
        }
    }

    public static List<Question> deserialize() {
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("src/main/resources/data/default_questions.json");
        List<Question> questions = null;
        try {
            questions = objectMapper.readValue(jsonFile, new TypeReference<List<Question>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return questions;
    }
}
