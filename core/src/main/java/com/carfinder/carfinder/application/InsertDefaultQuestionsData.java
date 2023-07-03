package com.carfinder.carfinder.application;

import com.carfinder.carfinder.domain.Answer;
import com.carfinder.carfinder.domain.Question;

import java.util.List;
import java.util.Map;

public class InsertDefaultQuestionsData {

    private final QuestionService questionService;

    public InsertDefaultQuestionsData(QuestionService questionService) {
        this.questionService = questionService;
    }


    public void createAndInsertQuestions() {
        //Question 5
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

        //Question 6
        Answer q6_answer1 = new Answer("q6_answer1", "Confort y espacio", Map.of(
                "doors5", 20,
                "seats5", 20,
                "bodyStyleMPV", 20,
                "bodyStyleFamily", 20,
                "bodyStyleConvertible", -10,
                "bodyStyleCoupe", -10
        ));

        Answer q6_answer2 = new Answer("q6_answer2", "Velocidad y potencia", Map.of(
                "cv200", 20
        ));

        Answer q6_answer3 = new Answer("q6_answer3", "Sensación de libertad", Map.of(
                "bodyStyleConvertible", 20,
                "bodyStyleVan", 5,
                "bodyStyleTruck", -50
        ));

        Answer q6_answer4 = new Answer("q6_answer4", "Eficiencia y ahorro", Map.of(
                "label0", 50,
                "labelEco", 50,
                "labelB", -10,
                "labelC", -50
        ));

        Question q6 = new Question("6", 2, "¿Cómo te gusta disfrutar del viaje?",
                List.of(q6_answer1, q6_answer2, q6_answer3, q6_answer4));

        //Question 7
        Answer q7_answer1 = new Answer("q7_answer1", "Ciudad y tráfico urbano", Map.of(
                "transmissionAuto", 40,
                "bodyStyleSedan", 40,
                "bodyStyleVan", -40,
                "bodyStyleTruck", -90
        ));

        Answer q7_answer2 = new Answer("q7_answer2", "Carreteras y largos trayectos", Map.of(
                "transmissionManual", 40,
                "transmissionSemi", 40,
                "bodyStyleTruck", -30
        ));

        Answer q7_answer3 = new Answer("q7_answer3", "Terrenos irregulares y todo terreno", Map.of(
                "bodyStyle4x4", 40,
                "bodyStylePickUp", 40,
                "bodyStyleConvertible", -40,
                "bodyStyleCoupe", -40,
                "bodyStyleTruck", -40
        ));

        Question q7 = new Question("7", 3, "¿Cuál es tu entorno de conducción habitual?",
                List.of(q7_answer1, q7_answer2, q7_answer3));

        //Question 8
        Answer q8_answer1 = new Answer("q8_answer1", "Trabajo y desplazamientos diarios", Map.of(
                "bodyStyleSedan", 20,
                "bodyStyleMPV", 10,
                "bodyStyleFamily", 10,
                "bodyStyleVan", -20,
                "bodyStyleConvertible", -20,
                "bodyStyleTruck", -100
        ));

        Answer q8_answer2 = new Answer("q8_answer2", "Viajes en familia o con amigos", Map.of(
                "doors5", 20,
                "seats5", 20,
                "bodyStyleFamily", 20,
                "bodyStyleMPV", 20,
                "bodyStyleSedan", 10,
                "bodyStyleVan", 10,
                "bodyStyleCoupe", -10,
                "bodyStyleConvertible", -10,
                "bodyStyleTruck", -10
        ));

        Answer q8_answer3 = new Answer("q8_answer3", "Transporte de mercancías o carga", Map.of(
                "bodyStyleVan", 90,
                "bodyStylePickUp", 90,
                "bodyStyleTruck", 90,
                "bodyStyleFamily", 10,
                "bodyStyleMPV", 10,
                "bodyStyle4x4", 10,
                "bodyStyleConvertible", -90,
                "bodyStyleCoupe", -90,
                "bodyStyleSedan", -90
        ));

        Question q8 = new Question("8", 3, "¿Qué tipo de actividad sueles realizar con tu coche?",
                List.of(q8_answer1, q8_answer2, q8_answer3));

        //Question 9
        Answer q9_answer1 = new Answer("q9_answer1", "Autopistas, autovías, carreteras convencionales y " +
                "vías para automóviles", Map.of());

        Answer q9_answer2 = new Answer("q9_answer2", "Terrenos irregulares o todoterreno", Map.of(
                "bodyStyle4x4", 40,
                "bodyStylePickUp", 40,
                "bodyStyleConvertible", -40,
                "bodyStyleCoupe", -40,
                "bodyStyleTruck", -40
        ));

        Answer q9_answer3 = new Answer("q9_answer3", "Principalmente en ciudad", Map.of(
                "transmissionAuto", 40,
                "bodyStyleSedan", 40,
                "bodyStyleVan", -40,
                "bodyStyleTruck", -90
        ));

        Question q9 = new Question("9", 3, "¿Qué tipo de terreno sueles recorrer con mayor frecuencia?",
                List.of(q9_answer1, q9_answer2, q9_answer3));

        //Question 10
        Answer q10_answer1 = new Answer("q10_answer1", "Cómoda y relajada", Map.of(
                "transmissionAuto", 40
        ));

        Answer q10_answer2 = new Answer("q10_answer2", "Más interactiva y deportiva", Map.of(
                "transmissionManual", 40,
                "transmissionSemi", 40,
                "cv200", 40
        ));

        Question q10 = new Question("10", 4, "¿Qué tipo de experiencia de conducción te gusta?",
                List.of(q10_answer1, q10_answer2));

        //Question 11
        Answer q11_answer1 = new Answer("q11_answer1", "Viajar o hacer road trips.", Map.of(
                "bodyStyleVan", 20,
                "bodyStyleMPV", 20,
                "bodyStyleFamily", 20,
                "bodyStyleSedan", 10,
                "bodyStyleTruck", -50
        ));

        Answer q11_answer2 = new Answer("q11_answer2", "Practicar deportes al aire libre.", Map.of(
                "bodyStylePickUp", 20,
                "bodyStyleVan", 20,
                "bodyStyleSedan", 10,
                "bodyStyleTruck", -50
        ));

        Answer q11_answer3 = new Answer("q11_answer3", "Salir a eventos sociales o reuniones.", Map.of(
                "bodyStyleSedan", 20,
                "bodyStyleCoupe", 20,
                "bodyStyleTruck", -20,
                "bodyStyleVan", -20,
                "bodyStylePickUp", -20
        ));

        Answer q11_answer4 = new Answer("q11_answer4", "Cargar equipaje o mercancía.", Map.of(
                "bodyStyleVan", 90,
                "bodyStylePickUp", 90,
                "bodyStyleTruck", 90,
                "bodyStyleFamily", 10,
                "bodyStyleMPV", 10,
                "bodyStyle4x4", 10,
                "bodyStyleSedan", -90,
                "bodyStyleCoupe", -90,
                "bodyStyleConvertible", -90
        ));

        Question q11 = new Question("11", 3, "¿Qué tipo de actividades realizas con mayor frecuencia " +
                "en tu tiempo libre?", List.of(q11_answer1, q11_answer2, q11_answer3, q11_answer4));

        //Question 12
        Answer q12_answer1 = new Answer("q12_answer1", "Estilo clásico y elegante", Map.of(
                "bodyStyleConvertible", 20,
                "bodyStyleCoupe", 20,
                "bodyStyleSedan", 10,
                "bodyStyleFamily", -10,
                "bodyStyleMPV", -10,
                "bodyStyleVan", -20,
                "bodyStyleTruck", -50
        ));

        Answer q12_answer2 = new Answer("q12_answer2", "Diseño deportivo y llamativo", Map.of(
                "bodyStyleConvertible", 20,
                "bodyStyleCoupe", 20,
                "bodyStyleFamily", -10,
                "bodyStyleMPV", -10,
                "bodyStyleVan", -10,
                "bodyStyleTruck", -10,
                "bodyStyle4x4", -10,
                "bodyStylePickUp", -90
        ));

        Answer q12_answer3 = new Answer("q12_answer3", "Estilo versátil y funcional", Map.of(
                "bodyStyleSedan", 30,
                "bodyStyleFamily", 20,
                "bodyStyleMPV", 20,
                "bodyStyleConvertible", -10,
                "bodyStyleTruck", -10
        ));

        Question q12 = new Question("12", 3, "¿Cuál es tu preferencia en cuanto al diseño exterior del " +
                "vehículo?", List.of(q12_answer1, q12_answer2, q12_answer3));

        //Question 13
        Answer q13_answer1 = new Answer("q13_answer1", "Me gustan los avances tecnológicos y sistemas de " +
                "asistencia avanzados", Map.of(
                "brandAudi", -20,
                "brandBMW", 40,
                "brandTesla", 40,
                "brandCitroen", -20,
                "brandHyundai", -20
        ));

        Answer q13_answer2 = new Answer("q13_answer2", "Busco un equilibrio entre tecnología y funcionalidad",
                Map.of(
                        "brandToyota", 30,
                        "brandHonda", 30,
                        "brandCFord", 30,
                        "brandAudi", -40,
                        "brandTesla", -40
                ));

        Answer q13_answer3 = new Answer("q13_answer3", "No es una prioridad para mí", Map.of());

        Question q13 = new Question("13", 5, "¿Cuál es tu nivel de experiencia y preferencia en cuanto " +
                "a la tecnología del vehículo?", List.of(q13_answer1, q13_answer2, q13_answer3));

        //Question 14
        Answer q14_answer1 = new Answer("q14_answer1", "Confortable y relajada", Map.of(
                "transmissionAuto", 40,
                "transmissionSemi", -30,
                "transmissionManual", -30
        ));

        Answer q14_answer2 = new Answer("q14_answer2", "Más deportiva y dinámica", Map.of(
                "transmissionSemi", 20,
                "transmissionManual", 20,
                "transmissionAuto", -10
        ));

        Question q14 = new Question("14", 4, "¿Qué tipo de conducción prefieres?",
                List.of(q14_answer1, q14_answer2));

        //Question 15
        Answer q15_answer1 = new Answer("q15_answer1", "Alta prioridad en seguridad y sistemas de " +
                "asistencia avanzados", Map.of(
                "brandVolvo", 30,
                "brandMercedes", 30,
                "brandSubaru", 30,
                "brandCitroen", -20,
                "brandHonda", -20
        ));

        Answer q15_answer2 = new Answer("q15_answer2", "Importante, pero sin requerir sistemas avanzados",
                Map.of(
                        "brandToyota", 30,
                        "brandHonda", 30,
                        "brandMazda", 30,
                        "brandVolvo", -30,
                        "brandMercedes", -30,
                        "brandSubaru", -30
                ));

        Answer q15_answer3 = new Answer("q15_answer3", "No es una preocupación principal", Map.of());

        Question q15 = new Question("15", 5, "¿Cuál es tu nivel de importancia en cuanto a la seguridad" +
                " del vehículo?", List.of(q15_answer1, q15_answer2, q15_answer3));

        //Question 16
        Answer q16_answer1 = new Answer("q16_answer1", "Espacios reducidos o estacionamiento en la calle",
                Map.of(
                        "bodyStyleSedan", 10,
                        "bodyStyleCoupe", 10,
                        "bodyStyleConvertible", 10,
                        "bodyStyleFamily", -10,
                        "bodyStyleMPV", -10,
                        "bodyStyle4x4", -10,
                        "bodyStyleTruck", -40,
                        "bodyStylePickUp", -40,
                        "bodyStyleVan", -40
                ));

        Answer q16_answer2 = new Answer("q16_answer2", "Garaje o estacionamiento amplio", Map.of());

        Question q16 = new Question("16", 3, "¿Qué tipo de estacionamiento sueles utilizar con mayor " +
                "frecuencia?",
                List.of(q16_answer1, q16_answer2));

        // Question 17
        Answer q17_answer1 = new Answer("q17_answer1", "Conducción suave y cómoda con énfasis en el confort",
                Map.of(
                        "brandMercedes", 20,
                        "brandVolvo", 20,
                        "brandAudi", 20,
                        "brandLexus", 20,
                        "brandToyota", -10,
                        "brandRenault", -10
                ));

        Answer q17_answer2 = new Answer("q17_answer2", "Conducción dinámica y deportiva con un enfoque en el " +
                "rendimiento", Map.of(
                "brandPorsche", 50,
                "brandAlfaRomeo", 50,
                "brandBMW", 50,
                "brandToyota", -30,
                "brandRenault", -30
        ));

        Answer q17_answer3 = new Answer("q17_answer3", "No tengo preferencia específica en la experiencia de " +
                "conducción", Map.of());

        Question q17 = new Question("17", 5, "¿Qué tipo de experiencia de conducción prefieres?",
                List.of(q17_answer1, q17_answer2, q17_answer3));

        //Question 18
        Answer q18_answer1 = new Answer("q18_answer1", "Busco un vehículo de lujo premium con acabados de alta " +
                "calidad", Map.of(
                "brandMercedes", 40,
                "brandBMW", 40,
                "brandLexus", 40,
                "brandAudi", 40,
                "brandAlfaRomeo", 40,
                "brandToyota", -30,
                "brandVolvo", -30
        ));

        Answer q18_answer2 = new Answer("q18_answer2", "Prefiero un vehículo de gama media con características " +
                "cómodas y elegantes", Map.of(
                "brandVolkswagen", 30,
                "brandFord", 30,
                "brandHyundai", 30,
                "brandMercedes", -40,
                "brandBMW", -40
        ));

        Question q18 = new Question("18", 5, "¿Qué nivel de lujo y prestigio deseas en tu vehículo?",
                List.of(q18_answer1, q18_answer2));

        //Question 19
        Answer q19_answer1 = new Answer("q19_answer1", "Alta eficiencia energética y opciones de vehículos " +
                "eléctricos/híbridos", Map.of(
                "brandToyota", 30,
                "brandTesla", 30,
                "brandNissan", 30,
                "brandVolkswagen", -20,
                "brandBMW", -20,
                "brandLexus", -20
        ));

        Answer q19_answer2 = new Answer("q19_answer2", "Busco un equilibrio entre rendimiento y eficiencia",
                Map.of(
                        "brandHonda", 20,
                        "brandVolkswagen", 20,
                        "brandFord", 20
                ));

        Answer q19_answer3 = new Answer("q19_answer3", "No es una preocupación principal", Map.of());

        Question q19 = new Question("19", 5, "¿Cuál es tu preferencia en términos de consumo de combustible?",
                List.of(q19_answer1, q19_answer2, q19_answer3));

        //Question 20
        Answer q20_answer1 = new Answer("q20_answer1", "Soy un conductor novato y prefiero un coche fácil de " +
                "manejar", Map.of(
                "bodyStyleSedan", 20,
                "transmissionAuto", 20,
                "brandBMW", -10,
                "cv200", -10,
                "bodyStyle4x4", -10,
                "bodyStylePickUp", -10,
                "bodyStyleTruck", -10,
                "bodyStyleVan", -10
        ));

        Answer q20_answer2 = new Answer("q20_answer2", "Tengo experiencia pero prefiero una conducción cómoda y relajada", Map.of(
                "bodyStyleSedan", 20,
                "transmissionAuto", 20,
                "transmissionSemi", 20,
                "transmissionManual", -20
        ));

        Answer q20_answer3 = new Answer("q20_answer3", "Soy un conductor experimentado", Map.of(
                "bodyStyleCoupe", 30,
                "bodyStyle4x4", 30,
                "transmissionManual", 30,
                "cv200", 30,
                "transmissionAuto", -20,
                "transmissionSemi", -20
        ));

        Answer q20_answer4 = new Answer("q20_answer4", "No tengo preferencia en cuanto a experiencia de conducción",
                Map.of());

        Question q20 = new Question("20", 5, "¿Cuál es tu nivel de experiencia y confianza al volante?",
                List.of(q20_answer1, q20_answer2, q20_answer3, q20_answer4));

        //Question 21
        Answer q21_answer1 = new Answer("q21_answer1", "Prefiero un vehículo usado anteriormente por otra persona.",
                Map.of("km1000", 100));

        Answer q21_answer2 = new Answer("q21_answer2", "Prefiero un vehículo que no tenga uso." +
                "persona.", Map.of("km1000", -100));

        Answer q21_answer3 = new Answer("q21_answer3", "No tiene importancia para mí.", Map.of());

        Question q21 = new Question("21", 2, "¿Cuál es tu preferencia respecto al kilometraje del vehículo?",
                List.of(q21_answer1, q21_answer2, q21_answer3));

        questionService.addQuestion(q5);
        questionService.addQuestion(q6);
        questionService.addQuestion(q7);
        questionService.addQuestion(q8);
        questionService.addQuestion(q9);
        questionService.addQuestion(q10);
        questionService.addQuestion(q11);
        questionService.addQuestion(q12);
        questionService.addQuestion(q13);
        questionService.addQuestion(q14);
        questionService.addQuestion(q15);
        questionService.addQuestion(q16);
        questionService.addQuestion(q17);
        questionService.addQuestion(q18);
        questionService.addQuestion(q19);
        questionService.addQuestion(q20);
        questionService.addQuestion(q21);
    }

}
