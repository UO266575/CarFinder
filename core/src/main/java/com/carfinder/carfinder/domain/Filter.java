package com.carfinder.carfinder.domain;

import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

public class Filter {

    public Map<String, Integer> filters;

    public Filter() {
        this.filters = new HashMap<>();
    }

    public void calculateFilter(String key, Integer value) {
        if (filters.containsKey(key)) {
            int currentValue = filters.get(key);
            filters.put(key, currentValue + value);
        } else {
            filters.put(key, value);
        }
    }
}
