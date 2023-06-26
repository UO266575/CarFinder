package com.carfinder.carfinder;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.carfinder.carfinder.application.QuestionService;
import com.carfinder.carfinder.domain.Question;
import com.carfinder.carfinder.infrastructure.repositories.QuestionRepository;
import com.carfinder.carfinder.domain.exceptions.RepositoryException;

public class QuestionRepositoryTests {

    @Mock
    private QuestionRepository repository;

    @InjectMocks
    private QuestionService service;

    @BeforeEach
    void setUp() {
        service = new QuestionService(repository);
    }


    @Test
    @DisplayName("Test getQuestions")
    public void getQuestionsTest()
    {
        List<Question> list = Collections.emptyList();
        
        Mockito.when(service.getQuestions()).then(list);

        List<Question> l = service.getQuestions();

        assertEquals(list, l);
    }

    @Test
    @DisplayName("Test getQuestionById")
    public void getQuestionByIdTest()
    {
        Question q1 = null;

        Mockito.when(service.getQuestionById("4")).thenReturn(q1);

        Question q2 = service.getQuestionById("4");

        assertEquals(q1, q2);
    }

    @Test
    @DisplayName("Test addQuestion")
    public void addQuestionTest()
    {
        Question q = new Question("4", "test", "¿Que tipo de carnet tienes?", new ArrayList<>());

        Mockito.when(service.getQuestionById("4")).thenReturn(q);

        Question res = service.getQuestionById("4");

        assertEquals(q, res);
    }

    @Test
    @DisplayName("Test updateQuestion")
    public void updateQuestionTest()
    {
        Question q = new Question("4", "test", "¿Que tipo de carnet tienes?", new ArrayList<>());

        Mockito.when(service.getQuestionById("4")).thenThrow(new RepositoryException("Error getting question by id: " + 4, new IOException()));

        service.updateQuestion(q);
    }

    @Test
    @DisplayName("Test deleteQuestion")
    public void deleteQuestionTest()
    {
        Mockito.when(service.deleteQuestion(1L).then(false));

        boolean res = service.deleteQuestion(1L);

        assertEquals(false,res);
    }
}
