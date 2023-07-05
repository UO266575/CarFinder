package com.carfinder.carfinder.domain;

import java.util.List;
import java.util.Map;

public record Answer(String id, String text, List<Filter> score) {
}
