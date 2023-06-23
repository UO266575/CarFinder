package com.carfinder.carfinder.infrastructure.controllers;

import com.carfinder.carfinder.application.AnswerService;
import com.carfinder.carfinder.application.QuizService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quiz")
public class QuizController {

    private final AnswerService answerService;
    private final QuizService quizService;

    public QuizController(AnswerService answerService, QuizService quizService) {
        this.answerService = answerService;
        this.quizService = quizService;
    }

    @PostMapping("/answer/{answerId}")
    public void userAnswerSelection(@PathVariable String answerId){
        quizService.processAnswerSelection(answerService.getAnswerById(answerId));
    }
}
