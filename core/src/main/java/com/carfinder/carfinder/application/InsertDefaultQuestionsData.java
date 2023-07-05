package com.carfinder.carfinder.application;

import com.carfinder.carfinder.domain.Answer;
import com.carfinder.carfinder.domain.Filter;
import com.carfinder.carfinder.domain.Question;

import java.util.List;

public class InsertDefaultQuestionsData {

    private final QuestionService questionService;

    public InsertDefaultQuestionsData(QuestionService questionService) {
        this.questionService = questionService;
    }


    public void createAndInsertQuestions() {
        //Question 5
        Answer q5_answer1 = new Answer("q5_answer1", "Activo y aventurero.", List.of(
                    new Filter("bodyStyle4x4", 20, "icekarId", 0),
                    new Filter("bodyStylePickUp", 20, "icekarId", 0),

                    new Filter("bodyStyleVan", 10, "icekarId", 0),

                    new Filter("bodyStyleSedan", 5, "icekarId", 0),

                    new Filter("bodyStyleConvertible", -10, "icekarId", 0),
                    new Filter("bodyStyleTruck", -10, "icekarId", 0),
                    new Filter("bodyStyleCoupe", -10, "icekarId", 0),
                    new Filter("bodyStyleFamily", -10, "icekarId", 0),
                    new Filter("bodyStyleMPV", -10, "icekarId", 0)
            )
        );

        Answer q5_answer2 = new Answer("q5_answer2", "Elegante y sofisticado.", List.of(
                new Filter("bodyStyleConvertible", 20, "icekarId", 0),
                new Filter("bodyStyleCoupe", 20, "icekarId", 0),

                new Filter("bodyStyleFamily", -10, "icekarId", 0),
                new Filter("bodyStyleMPV", -10, "icekarId", 0),
                new Filter("bodyStyleVan", -10, "icekarId", 0),
                new Filter("bodyStyleTruck", -10, "icekarId", 0)
        ));

        Answer q5_answer3 = new Answer("q5_answer3", "Práctico y funcional.", List.of(
                new Filter("bodyStyleSedan", 20, "icekarId", 0),
                new Filter("bodyStyleFamily", 20, "icekarId", 0),
                new Filter("bodyStyleMPV", 20, "icekarId", 0),

                new Filter("bodyStyleConvertible", -10, "icekarId", 0),
                new Filter("bodyStyleTruck", -10, "icekarId", 0)
        ));

        Answer q5_answer4 = new Answer("q5_answer4", "Deportivo y dinámico.", List.of(
                new Filter("bodyStyleConvertible", 20, "icekarId", 0),
                new Filter("bodyStyleCoupe", 20, "icekarId", 0),

                new Filter("bodyStyleFamily", -10, "icekarId", 0),
                new Filter("bodyStyleMPV", -10, "icekarId", 0),
                new Filter("bodyStyleVan", -10, "icekarId", 0),
                new Filter("bodyStyle4x4", -10, "icekarId", 0),
                new Filter("bodyStylePickUp", -10, "icekarId", 0),
                new Filter("bodyStyleTruck", -10, "icekarId", 0)
        ));

        Question q5 = new Question("5", 2, "¿Qué adjetivo definiría mejor su estilo de vida?",
                List.of(q5_answer1, q5_answer2, q5_answer3, q5_answer4));

        //Question 6
        Answer q6_answer1 = new Answer("q6_answer1", "Confort y espacio", List.of(
                new Filter("doors5", 20, "icekarId", 0),
                new Filter("seats5", 20, "icekarId", 0),
                new Filter("bodyStyleMPV", 20, "icekarId", 0),
                new Filter("bodyStyleFamily", 20, "icekarId", 0),
                new Filter("bodyStyleConvertible", -10, "icekarId", 0),
                new Filter("bodyStyleCoupe", -10, "icekarId", 0)
        ));

        Answer q6_answer2 = new Answer("q6_answer2", "Velocidad y potencia", List.of(
                new Filter("cv200", 20, "icekarId", 0)
        ));

        Answer q6_answer3 = new Answer("q6_answer3", "Sensación de libertad", List.of(
                new Filter("bodyStyleConvertible", 20, "icekarId", 0),
                new Filter("bodyStyleVan", 5, "icekarId", 0),
                new Filter("bodyStyleTruck", -50, "icekarId", 0)
        ));

        Answer q6_answer4 = new Answer("q6_answer4", "Eficiencia y ahorro", List.of(
                new Filter("label0", 50, "icekarId", 0),
                new Filter("labelEco", 50, "icekarId", 0),
                new Filter("labelB", -10, "icekarId", 0),
                new Filter("labelC", -50, "icekarId", 0)
        ));

        Question q6 = new Question("6", 2, "¿Cómo te gusta disfrutar del viaje?",
                List.of(q6_answer1, q6_answer2, q6_answer3, q6_answer4));

        //Question 7
        Answer q7_answer1 = new Answer("q7_answer1", "Ciudad y tráfico urbano", List.of(
                new Filter("transmissionAuto", 40, "icekarId", 0),
                new Filter("bodyStyleSedan", 40, "icekarId", 0),
                new Filter("bodyStyleVan", -40, "icekarId", 0),
                new Filter("bodyStyleTruck", -90, "icekarId", 0)
        ));

        Answer q7_answer2 = new Answer("q7_answer2", "Carreteras y largos trayectos", List.of(
                new Filter("transmissionManual", 40, "icekarId", 0),
                new Filter("transmissionSemi", 40, "icekarId", 0),
                new Filter("bodyStyleTruck", -30, "icekarId", 0)
        ));

        Answer q7_answer3 = new Answer("q7_answer3", "Terrenos irregulares y todo terreno", List.of(
                new Filter("bodyStyle4x4", 40, "icekarId", 0),
                new Filter("bodyStylePickUp", 40, "icekarId", 0),
                new Filter("bodyStyleConvertible", -40, "icekarId", 0),
                new Filter("bodyStyleCoupe", -40, "icekarId", 0),
                new Filter("bodyStyleTruck", -40, "icekarId", 0)
        ));

        Question q7 = new Question("7", 3, "¿Cuál es tu entorno de conducción habitual?",
                List.of(q7_answer1, q7_answer2, q7_answer3));

        //Question 8
        Answer q8_answer1 = new Answer("q8_answer1", "Trabajo y desplazamientos diarios", List.of(
                new Filter("bodyStyleSedan", 20, "icekarId", 0),
                new Filter("bodyStyleMPV", 10, "icekarId", 0),
                new Filter("bodyStyleFamily", 10, "icekarId", 0),
                new Filter("bodyStyleVan", -20, "icekarId", 0),
                new Filter("bodyStyleConvertible", -20, "icekarId", 0),
                new Filter("bodyStyleTruck", -100, "icekarId", 0)
        ));

        Answer q8_answer2 = new Answer("q8_answer2", "Viajes en familia o con amigos", List.of(
                new Filter("doors5", 20, "icekarId", 0),
                new Filter("seats5", 20, "icekarId", 0),
                new Filter("bodyStyleFamily", 20, "icekarId", 0),
                new Filter("bodyStyleMPV", 20, "icekarId", 0),
                new Filter("bodyStyleSedan", 10, "icekarId", 0),
                new Filter("bodyStyleVan", 10, "icekarId", 0),
                new Filter("bodyStyleCoupe", -10, "icekarId", 0),
                new Filter("bodyStyleConvertible", -10, "icekarId", 0),
                new Filter("bodyStyleTruck", -10, "icekarId", 0)
        ));

        Answer q8_answer3 = new Answer("q8_answer3", "Transporte de mercancías o carga", List.of(
                new Filter("bodyStyleVan", 90, "icekarId", 0),
                new Filter("bodyStylePickUp", 90, "icekarId", 0),
                new Filter("bodyStyleTruck", 90, "icekarId", 0),
                new Filter("bodyStyleFamily", 10, "icekarId", 0),
                new Filter("bodyStyleMPV", 10, "icekarId", 0),
                new Filter("bodyStyle4x4", 10, "icekarId", 0),
                new Filter("bodyStyleConvertible", -90, "icekarId", 0),
                new Filter("bodyStyleCoupe", -90, "icekarId", 0),
                new Filter("bodyStyleSedan", -90, "icekarId", 0)
        ));

        Question q8 = new Question("8", 3, "¿Qué tipo de actividad sueles realizar con tu coche?",
                List.of(q8_answer1, q8_answer2, q8_answer3));

        //Question 9
        Answer q9_answer1 = new Answer("q9_answer1", "Autopistas, autovías, carreteras convencionales y " +
                "vías para automóviles", List.of());

        Answer q9_answer2 = new Answer("q9_answer2", "Terrenos irregulares o todoterreno", List.of(
                new Filter("bodyStyle4x4", 40, "icekarId", 0),
                new Filter("bodyStylePickUp", 40, "icekarId", 0),
                new Filter("bodyStyleConvertible", -40, "icekarId", 0),
                new Filter("bodyStyleCoupe", -40, "icekarId", 0),
                new Filter("bodyStyleTruck", -40, "icekarId", 0)
        ));

        Answer q9_answer3 = new Answer("q9_answer3", "Principalmente en ciudad", List.of(
                new Filter("transmissionAuto", 40, "icekarId", 0),
                new Filter("bodyStyleSedan", 40, "icekarId", 0),
                new Filter("bodyStyleVan", -40, "icekarId", 0),
                new Filter("bodyStyleTruck", -90, "icekarId", 0)
        ));

        Question q9 = new Question("9", 3, "¿Qué tipo de terreno sueles recorrer con mayor frecuencia?",
                List.of(q9_answer1, q9_answer2, q9_answer3));

        //Question 10
        Answer q10_answer1 = new Answer("q10_answer1", "Cómoda y relajada", List.of(
                new Filter("transmissionAuto", 40, "icekarId", 0)
        ));

        Answer q10_answer2 = new Answer("q10_answer2", "Más interactiva y deportiva", List.of(
                new Filter("transmissionManual", 40, "icekarId", 0),
                new Filter("transmissionSemi", 40, "icekarId", 0),
                new Filter("cv200", 40, "icekarId", 0)
        ));

        Question q10 = new Question("10", 4, "¿Qué tipo de experiencia de conducción te gusta?",
                List.of(q10_answer1, q10_answer2));

        //Question 11
        Answer q11_answer1 = new Answer("q11_answer1", "Viajar o hacer road trips.", List.of(
                new Filter("bodyStyleVan", 20, "icekarId", 0),
                new Filter("bodyStyleMPV", 20, "icekarId", 0),
                new Filter("bodyStyleFamily", 20, "icekarId", 0),
                new Filter("bodyStyleSedan", 10, "icekarId", 0),
                new Filter("bodyStyleTruck", -50, "icekarId", 0)
        ));

        Answer q11_answer2 = new Answer("q11_answer2", "Practicar deportes al aire libre.", List.of(
                new Filter("bodyStylePickUp", 20, "icekarId", 0),
                new Filter("bodyStyleVan", 20, "icekarId", 0),
                new Filter("bodyStyleSedan", 10, "icekarId", 0),
                new Filter("bodyStyleTruck", -50, "icekarId", 0)
        ));

        Answer q11_answer3 = new Answer("q11_answer3", "Salir a eventos sociales o reuniones.", List.of(
                new Filter("bodyStyleSedan", 20, "icekarId", 0),
                new Filter("bodyStyleCoupe", 20, "icekarId", 0),
                new Filter("bodyStyleTruck", -20, "icekarId", 0),
                new Filter("bodyStyleVan", -20, "icekarId", 0),
                new Filter("bodyStylePickUp", -20, "icekarId", 0)
        ));

        Answer q11_answer4 = new Answer("q11_answer4", "Cargar equipaje o mercancía.", List.of(
                new Filter("bodyStyleVan", 90, "icekarId", 0),
                new Filter("bodyStylePickUp", 90, "icekarId", 0),
                new Filter("bodyStyleTruck", 90, "icekarId", 0),
                new Filter("bodyStyleFamily", 10, "icekarId", 0),
                new Filter("bodyStyleMPV", 10, "icekarId", 0),
                new Filter("bodyStyle4x4", 10, "icekarId", 0),
                new Filter("bodyStyleSedan", -90, "icekarId", 0),
                new Filter("bodyStyleCoupe", -90, "icekarId", 0),
                new Filter("bodyStyleConvertible", -90, "icekarId", 0)
        ));

        Question q11 = new Question("11", 3, "¿Qué tipo de actividades realizas con mayor frecuencia " +
                "en tu tiempo libre?", List.of(q11_answer1, q11_answer2, q11_answer3, q11_answer4));

        //Question 12
        Answer q12_answer1 = new Answer("q12_answer1", "Estilo clásico y elegante", List.of(
                new Filter("bodyStyleConvertible", 20, "icekarId", 0),
                new Filter("bodyStyleCoupe", 20, "icekarId", 0),
                new Filter("bodyStyleSedan", 10, "icekarId", 0),
                new Filter("bodyStyleFamily", -10, "icekarId", 0),
                new Filter("bodyStyleMPV", -10, "icekarId", 0),
                new Filter("bodyStyleVan", -20, "icekarId", 0),
                new Filter("bodyStyleTruck", -50, "icekarId", 0)
        ));

        Answer q12_answer2 = new Answer("q12_answer2", "Diseño deportivo y llamativo", List.of(
                new Filter("bodyStyleConvertible", 20, "icekarId", 0),
                new Filter("bodyStyleCoupe", 20, "icekarId", 0),
                new Filter("bodyStyleFamily", -10, "icekarId", 0),
                new Filter("bodyStyleMPV", -10, "icekarId", 0),
                new Filter("bodyStyleVan", -10, "icekarId", 0),
                new Filter("bodyStyleTruck", -10, "icekarId", 0),
                new Filter("bodyStyle4x4", -10, "icekarId", 0),
                new Filter("bodyStylePickUp", -90, "icekarId", 0)
        ));

        Answer q12_answer3 = new Answer("q12_answer3", "Estilo versátil y funcional", List.of(
                new Filter("bodyStyleSedan", 30, "icekarId", 0),
                new Filter("bodyStyleFamily", 20, "icekarId", 0),
                new Filter("bodyStyleMPV", 20, "icekarId", 0),
                new Filter("bodyStyleConvertible", -10, "icekarId", 0),
                new Filter("bodyStyleTruck", -10, "icekarId", 0)
        ));

        Question q12 = new Question("12", 3, "¿Cuál es tu preferencia en cuanto al diseño exterior del " +
                "vehículo?", List.of(q12_answer1, q12_answer2, q12_answer3));

        //Question 13
        Answer q13_answer1 = new Answer("q13_answer1", "Me gustan los avances tecnológicos y sistemas de " +
                "asistencia avanzados", List.of(
                new Filter("brandAudi", -20, "icekarId", 0),
                new Filter("brandBMW", 40, "icekarId", 0),
                new Filter("brandTesla", 40, "icekarId", 0),
                new Filter("brandCitroen", -20, "icekarId", 0),
                new Filter("brandHyundai", -20, "icekarId", 0)
        ));

        Answer q13_answer2 = new Answer("q13_answer2", "Busco un equilibrio entre tecnología y funcionalidad",
                List.of(
                        new Filter("brandToyota", 30, "icekarId", 0),
                        new Filter("brandHonda", 30, "icekarId", 0),
                        new Filter("brandCFord", 30, "icekarId", 0),
                        new Filter("brandAudi", -40, "icekarId", 0),
                        new Filter("brandTesla", -40, "icekarId", 0)
                ));

        Answer q13_answer3 = new Answer("q13_answer3", "No es una prioridad para mí", List.of());

        Question q13 = new Question("13", 5, "¿Cuál es tu nivel de experiencia y preferencia en cuanto " +
                "a la tecnología del vehículo?", List.of(q13_answer1, q13_answer2, q13_answer3));

        //Question 14
        Answer q14_answer1 = new Answer("q14_answer1", "Confortable y relajada", List.of(
                new Filter("transmissionAuto", 40, "icekarId", 0),
                new Filter("transmissionSemi", -30, "icekarId", 0),
                new Filter("transmissionManual", -30, "icekarId", 0)
        ));

        Answer q14_answer2 = new Answer("q14_answer2", "Más deportiva y dinámica", List.of(
                new Filter("transmissionSemi", 20, "icekarId", 0),
                new Filter("transmissionManual", 20, "icekarId", 0),
                new Filter("transmissionAuto", -10, "icekarId", 0)
        ));

        Question q14 = new Question("14", 4, "¿Qué tipo de conducción prefieres?",
                List.of(q14_answer1, q14_answer2));

        //Question 15
        Answer q15_answer1 = new Answer("q15_answer1", "Alta prioridad en seguridad y sistemas de " +
                "asistencia avanzados", List.of(
                new Filter("brandVolvo", 30, "icekarId", 0),
                new Filter("brandMercedes", 30, "icekarId", 0),
                new Filter("brandSubaru", 30, "icekarId", 0),
                new Filter("brandCitroen", -20, "icekarId", 0),
                new Filter("brandHonda", -20, "icekarId", 0)
        ));

        Answer q15_answer2 = new Answer("q15_answer2", "Importante, pero sin requerir sistemas avanzados",
                List.of(
                        new Filter("brandToyota", 30, "icekarId", 0),
                        new Filter("brandHonda", 30, "icekarId", 0),
                        new Filter("brandMazda", 30, "icekarId", 0),
                        new Filter("brandVolvo", -30, "icekarId", 0),
                        new Filter("brandMercedes", -30, "icekarId", 0),
                        new Filter("brandSubaru", -30, "icekarId", 0)
                ));

        Answer q15_answer3 = new Answer("q15_answer3", "No es una preocupación principal", List.of());

        Question q15 = new Question("15", 5, "¿Cuál es tu nivel de importancia en cuanto a la seguridad" +
                " del vehículo?", List.of(q15_answer1, q15_answer2, q15_answer3));

        //Question 16
        Answer q16_answer1 = new Answer("q16_answer1", "Espacios reducidos o estacionamiento en la calle",
                List.of(
                        new Filter("bodyStyleSedan", 10, "icekarId", 0),
                        new Filter("bodyStyleCoupe", 10, "icekarId", 0),
                        new Filter("bodyStyleConvertible", 10, "icekarId", 0),
                        new Filter("bodyStyleFamily", -10, "icekarId", 0),
                        new Filter("bodyStyleMPV", -10, "icekarId", 0),
                        new Filter("bodyStyle4x4", -10, "icekarId", 0),
                        new Filter("bodyStyleTruck", -40, "icekarId", 0),
                        new Filter("bodyStylePickUp", -40, "icekarId", 0),
                        new Filter("bodyStyleVan", -40, "icekarId", 0)
                ));

        Answer q16_answer2 = new Answer("q16_answer2", "Garaje o estacionamiento amplio", List.of());

        Question q16 = new Question("16", 3, "¿Qué tipo de estacionamiento sueles utilizar con mayor " +
                "frecuencia?",
                List.of(q16_answer1, q16_answer2));

        // Question 17
        Answer q17_answer1 = new Answer("q17_answer1", "Conducción suave y cómoda con énfasis en el confort",
                List.of(
                        new Filter("brandMercedes", 20, "icekarId", 0),
                        new Filter("brandVolvo", 20, "icekarId", 0),
                        new Filter("brandAudi", 20, "icekarId", 0),
                        new Filter("brandLexus", 20, "icekarId", 0),
                        new Filter("brandToyota", -10, "icekarId", 0),
                        new Filter("brandRenault", -10, "icekarId", 0)
                ));

        Answer q17_answer2 = new Answer("q17_answer2", "Conducción dinámica y deportiva con un enfoque en el " +
                "rendimiento", List.of(
                new Filter("brandPorsche", 50, "icekarId", 0),
                new Filter("brandAlfaRomeo", 50, "icekarId", 0),
                new Filter("brandBMW", 50, "icekarId", 0),
                new Filter("brandToyota", -30, "icekarId", 0),
                new Filter("brandRenault", -30, "icekarId", 0)
        ));

        Answer q17_answer3 = new Answer("q17_answer3", "No tengo preferencia específica en la experiencia de " +
                "conducción", List.of());

        Question q17 = new Question("17", 5, "¿Qué tipo de experiencia de conducción prefieres?",
                List.of(q17_answer1, q17_answer2, q17_answer3));

        //Question 18
        Answer q18_answer1 = new Answer("q18_answer1", "Busco un vehículo de lujo premium con acabados de alta " +
                "calidad", List.of(
                new Filter("brandMercedes", 40, "icekarId", 0),
                new Filter("brandBMW", 40, "icekarId", 0),
                new Filter("brandLexus", 40, "icekarId", 0),
                new Filter("brandAudi", 40, "icekarId", 0),
                new Filter("brandAlfaRomeo", 40, "icekarId", 0),
                new Filter("brandToyota", -30, "icekarId", 0),
                new Filter("brandVolvo", -30, "icekarId", 0)
        ));

        Answer q18_answer2 = new Answer("q18_answer2", "Prefiero un vehículo de gama media con características " +
                "cómodas y elegantes", List.of(
                new Filter("brandVolkswagen", 30, "icekarId", 0),
                new Filter("brandFord", 30, "icekarId", 0),
                new Filter("brandHyundai", 30, "icekarId", 0),
                new Filter("brandMercedes", -40, "icekarId", 0),
                new Filter("brandBMW", -40, "icekarId", 0)
        ));

        Question q18 = new Question("18", 5, "¿Qué nivel de lujo y prestigio deseas en tu vehículo?",
                List.of(q18_answer1, q18_answer2));

        //Question 19
        Answer q19_answer1 = new Answer("q19_answer1", "Alta eficiencia energética y opciones de vehículos " +
                "eléctricos/híbridos", List.of(
                new Filter("brandToyota", 30, "icekarId", 0),
                new Filter("brandTesla", 30, "icekarId", 0),
                new Filter("brandNissan", 30, "icekarId", 0),
                new Filter("brandVolkswagen", -20, "icekarId", 0),
                new Filter("brandBMW", -20, "icekarId", 0),
                new Filter("brandLexus", -20, "icekarId", 0)
        ));

        Answer q19_answer2 = new Answer("q19_answer2", "Busco un equilibrio entre rendimiento y eficiencia",
                List.of(
                        new Filter("brandHonda", 20, "icekarId", 0),
                        new Filter("brandVolkswagen", 20, "icekarId", 0),
                        new Filter("brandFord", 20, "icekarId", 0)
                ));

        Answer q19_answer3 = new Answer("q19_answer3", "No es una preocupación principal", List.of());

        Question q19 = new Question("19", 5, "¿Cuál es tu preferencia en términos de consumo de combustible?",
                List.of(q19_answer1, q19_answer2, q19_answer3));

        //Question 20
        Answer q20_answer1 = new Answer("q20_answer1", "Soy un conductor novato y prefiero un coche fácil de " +
                "manejar", List.of(
                new Filter("bodyStyleSedan", 20, "icekarId", 0),
                new Filter("transmissionAuto", 20, "icekarId", 0),
                new Filter("brandBMW", -10, "icekarId", 0),
                new Filter("cv200", -10, "icekarId", 0),
                new Filter("bodyStyle4x4", -10, "icekarId", 0),
                new Filter("bodyStylePickUp", -10, "icekarId", 0),
                new Filter("bodyStyleTruck", -10, "icekarId", 0),
                new Filter("bodyStyleVan", -10, "icekarId", 0)
        ));

        Answer q20_answer2 = new Answer("q20_answer2", "Tengo experiencia pero prefiero una conducción cómoda" +
                " y relajada", List.of(
                new Filter("bodyStyleSedan", 20, "icekarId", 0),
                new Filter("transmissionAuto", 20, "icekarId", 0),
                new Filter("transmissionSemi", 20, "icekarId", 0),
                new Filter("transmissionManual", -20, "icekarId", 0)
        ));

        Answer q20_answer3 = new Answer("q20_answer3", "Soy un conductor experimentado", List.of(
                new Filter("bodyStyleCoupe", 30, "icekarId", 0),
                new Filter("bodyStyle4x4", 30, "icekarId", 0),
                new Filter("transmissionManual", 30, "icekarId", 0),
                new Filter("cv200", 30, "icekarId", 0),
                new Filter("transmissionAuto", -20, "icekarId", 0),
                new Filter("transmissionSemi", -20, "icekarId", 0)
        ));

        Answer q20_answer4 = new Answer("q20_answer4", "No tengo preferencia en cuanto a experiencia de conducción",
                List.of());

        Question q20 = new Question("20", 5, "¿Cuál es tu nivel de experiencia y confianza al volante?",
                List.of(q20_answer1, q20_answer2, q20_answer3, q20_answer4));

        //Question 21
        Answer q21_answer1 = new Answer("q21_answer1", "Prefiero un vehículo usado anteriormente por otra persona.",
                List.of(new Filter("km1000", 100, "icekarId", 0)));

        Answer q21_answer2 = new Answer("q21_answer2", "Prefiero un vehículo que no tenga uso." +
                "persona.", List.of(
                        new Filter("km1000", -100, "icekarId", 0)));

        Answer q21_answer3 = new Answer("q21_answer3", "No tiene importancia para mí.", List.of());

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
