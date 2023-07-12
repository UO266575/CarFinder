package com.carfinder.carfinder.domain;

import java.util.List;

public record Question(String id, int type, String text, List<Answer> answers) {
}
