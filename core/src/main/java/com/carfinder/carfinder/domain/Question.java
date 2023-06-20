package com.carfinder.carfinder.domain;

import java.util.List;

public record Question(Long id, String type, String text, List<Answer> answers) {
}
