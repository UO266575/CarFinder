package com.carfinder.carfinder.domain;

import java.util.List;

public record Question(String id, String type, String text, List<Answer> answers) {
}
