package com.carfinder.carfinder.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Filter {

    public String internalIdentificator;

    public int value;

    public String externalIdentificator;

    public int externalValue;

    public Map<String, Integer> filters;

    public Filter(String internalIdentificator, int value, String externalIdentificator, int externalValue) {
        this.filters = new HashMap<>();
        this.internalIdentificator = internalIdentificator;
        this.value = value;
        this.externalIdentificator = externalIdentificator;
        this.externalValue = externalValue;
    }

    public Filter() {
        this.filters = new HashMap<>();
    }

    public void calculateFilter(Filter filter) {
        if (filters.containsKey(filter.internalIdentificator)) {
            int currentValue = filters.get(filter.internalIdentificator);
            filters.put(filter.internalIdentificator, currentValue + filter.value);
        } else {
            filters.put(filter.internalIdentificator, filter.value);
        }
    }

    public List<String> getHigherFilters() {
        return filters
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 40)
                .map(Map.Entry::getKey)
                .toList();
    }
}