package com.carfinder.carfinder.application;

import com.carfinder.carfinder.domain.Question;
import com.carfinder.carfinder.domain.QuestionAdapter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionAdapter questionAdapter;

    public QuestionService(QuestionAdapter questionAdapter) {
        this.questionAdapter = questionAdapter;
    }

    public List<Question> getQuestions(){
        return questionAdapter.getQuestions();
    }

    public Question getQuestionById(String id){
        return questionAdapter.getQuestionById(id);
    }

    public  void addQuestion(Question question){
        questionAdapter.addQuestion(question);
    }
}
