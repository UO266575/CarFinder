package com.carfinder.carfinder.infrastructure.controllers;

import com.carfinder.carfinder.application.AnswerService;
import com.carfinder.carfinder.application.QuestionService;
import com.carfinder.carfinder.domain.Answer;
import com.carfinder.carfinder.domain.Question;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("answer")
public class AnswerController {

    private final AnswerService answerService;

    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

//    @GetMapping
//    public ResponseEntity<List<Answer>> getAnswers() {
//        List<Answer> answers = answerService.getAnswerById();
//        return answers != null ? ResponseEntity.ok(answers) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Answer> getAnswer(@PathVariable String id) {
        Answer answer = answerService.getAnswerById(id);
        return answer != null ? ResponseEntity.ok(answer) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
