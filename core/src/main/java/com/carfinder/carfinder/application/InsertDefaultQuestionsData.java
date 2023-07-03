package com.carfinder.carfinder.application;

import com.carfinder.carfinder.domain.Answer;
import com.carfinder.carfinder.domain.Question;

import java.util.List;
import java.util.Map;

public class InsertDefaultQuestionsData {

    public static void insertData(){
        Answer q5_answer1 = new Answer("q5_answer1", "Activo y aventurero.", Map.of(
                "bodyStyleConvertible", 20,
                "bodyStyleCoupe", 20,
                "bodyStyleSedan", -10,
                "bodyStyleFamily", -10,
                "bodyStyleMPV", -10,
                "bodyStyleVan", -10,
                "bodyStyleTruck", -10
        ));

        Answer q5_answer2 = new Answer("q5_answer2", "Elegante y sofisticado.", Map.of(
                "bodyStyleConvertible", 20,
                "bodyStyleCoupe", 20,
                "bodyStyleFamily", -10,
                "bodyStyleMPV", -10,
                "bodyStyleVan", -10,
                "bodyStyleTruck", -10
        ));

        Answer q5_answer3 = new Answer("q5_answer3", "Práctico y funcional.", Map.of(
                "bodyStyleSedan", 20,
                "bodyStyleFamily", 20,
                "bodyStyleMPV", 20,
                "bodyStyleConvertible", -10,
                "bodyStyleTruck", -10
        ));

        Answer q5_answer4 = new Answer("q5_answer4", "Deportivo y dinámico.", Map.of(
                "bodyStyleConvertible", 20,
                "bodyStyleCoupe", 20,
                "bodyStyleSedan", -10,
                "bodyStyleFamily", -10,
                "bodyStyleMPV", -10,
                "bodyStyleVan", -10,
                "bodyStyleTruck", -10
        ));

        Question q5 = new Question("5", 2, "¿Qué adjetivo definiría mejor su estilo de vida?",
                List.of(q5_answer1, q5_answer2, q5_answer3, q5_answer4));
    }
}
