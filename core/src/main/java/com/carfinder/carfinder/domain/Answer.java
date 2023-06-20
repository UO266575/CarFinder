package com.carfinder.carfinder.domain;

import java.util.Map;

public record Answer(String text, Map<String, Integer> score) {
}
