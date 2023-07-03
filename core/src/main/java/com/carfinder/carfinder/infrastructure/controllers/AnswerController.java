package com.carfinder.carfinder.infrastructure.controllers;

import com.carfinder.carfinder.application.AnswerService;
import com.carfinder.carfinder.domain.Answer;
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

    @GetMapping
    public ResponseEntity<List<Answer>> getAnswers() {
        List<Answer> answers = answerService.getAnswers();
        return answers != null ? ResponseEntity.ok(answers) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Answer> getAnswer(@PathVariable String id) {
        Answer answer = answerService.getAnswerById(id);
        return answer != null ? ResponseEntity.ok(answer) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping
    public ResponseEntity<String> addAnswer(@RequestBody Answer answer) {
        return answerService.addAnswer(answer) ?
                ResponseEntity.ok("Answer added successfully") :
                ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failed to add the answer");
    }

    @PostMapping("/bulk")
    public ResponseEntity<String> addAnswers(@RequestBody List<Answer> answers) {
        return answerService.addAnswers(answers) ?
                ResponseEntity.ok("Answers added successfully") :
                ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failed to add the answers");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateAnswer(@PathVariable String id, @RequestBody Answer answer) {
        return answerService.updateAnswer(id, answer) ?
                ResponseEntity.ok("Answer updated successfully") :
                ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failed to update the answer");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAnswer(@PathVariable String id) {
        return answerService.deleteAnswer(id) ? ResponseEntity.ok("Answer deleted successfully") :
                ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failed to delete answer");
    }

    @DeleteMapping("/bulk")
    public ResponseEntity<String> deleteAllAnswers() {
        return answerService.deleteAllAnswers() ? ResponseEntity.ok("Answers deleted successfully") :
                ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failed to delete answers");
    }
}
