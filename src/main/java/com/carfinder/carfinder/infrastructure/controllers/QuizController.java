package com.carfinder.carfinder.infrastructure.controllers;

import com.carfinder.carfinder.application.AnswerService;
import com.carfinder.carfinder.application.QuizService;
import com.carfinder.carfinder.domain.Ad;
import com.carfinder.carfinder.domain.Answer;
import com.carfinder.carfinder.domain.Filter;
import com.carfinder.carfinder.domain.Question;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
@CrossOrigin(origins = "http://localhost:5173/")
public class QuizController {

    private final AnswerService answerService;
    private final QuizService quizService;

    public QuizController(AnswerService answerService, QuizService quizService) {
        this.answerService = answerService;
        this.quizService = quizService;
    }

    @PostMapping("/answer/{answerId}")
    public void userAnswerSelection(@PathVariable String answerId) {
        quizService.processAnswerSelection(answerService.getAnswerById(answerId));
    }

    @PostMapping("/answer/bulk")
    public ResponseEntity<Void> userAnswersSelection(@RequestBody List<String> answers) {
        quizService.processAnswerSelection(answers);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/result")
    public ResponseEntity<List<Ad>> retrieveAdsResult() {
        return ResponseEntity.ok(quizService.getCarAds(QuizService.OrderType.DEFAULT));
    }

    @GetMapping("/round")
    public ResponseEntity<List<Question>> getQuizQuestions() {
        List<Question> questions = quizService.retrieveFiveQuestions();
        return questions != null ? ResponseEntity.ok(questions) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping("/higher")
    public ResponseEntity<List<Filter>> getHigherFilters() {
        List<Filter> filters = quizService.getHigherFilters();
        return filters != null ? ResponseEntity.ok(filters) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping("/reestablish")
    public ResponseEntity<Void> reestablishFilters() {
        quizService.reestablishQuiz();
        return ResponseEntity.ok().build();
    }
}