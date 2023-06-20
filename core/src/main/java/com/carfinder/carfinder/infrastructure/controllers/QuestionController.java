package com.carfinder.carfinder.infrastructure.controllers;

import com.carfinder.carfinder.application.QuestionService;
import com.carfinder.carfinder.domain.Question;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> getQuestion(@PathVariable String id){
        Question question = questionService.getQuestionById(id);
        return question != null ? ResponseEntity.ok(question) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        questionService.addQuestion(question);
        return ResponseEntity.ok("Question created successfully");
    }
}
