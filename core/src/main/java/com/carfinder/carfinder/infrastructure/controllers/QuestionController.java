package com.carfinder.carfinder.infrastructure.controllers;

import com.carfinder.carfinder.application.QuestionService;
import com.carfinder.carfinder.domain.Question;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public ResponseEntity<List<Question>> getQuestions() {
        List<Question> questions = questionService.getQuestions();
        return questions != null ? ResponseEntity.ok(questions) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> getQuestion(@PathVariable String id) {
        Question question = questionService.getQuestionById(id);
        return question != null ? ResponseEntity.ok(question) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question) ?
                ResponseEntity.ok("Question added successfully") :
                ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failed to add the question");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateQuestion(@PathVariable String id, @RequestBody Question question) {
        return questionService.updateQuestion(id, question) ?
                ResponseEntity.ok("Question updated successfully") :
                ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failed to update the question");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteQuestion(@PathVariable String id) {
        return questionService.deleteQuestion(id) ? ResponseEntity.ok("Question deleted successfully") :
                ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failed to delete question");
    }
}
