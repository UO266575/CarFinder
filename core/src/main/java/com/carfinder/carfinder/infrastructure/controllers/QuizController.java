package com.carfinder.carfinder.infrastructure.controllers;

import com.carfinder.carfinder.application.QuestionService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quiz")
public class QuizController {

    private final AnswerService answerService;

    public QuizController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @PostMapping("/answer/{answerId}")
    public void answer(@PathVariable String answerId){
        quizService.answer(answerService.getAnswerById());
    }
}
