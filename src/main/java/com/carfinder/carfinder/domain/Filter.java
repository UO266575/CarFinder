package com.carfinder.carfinder.domain;

import java.util.*;

public class Filter {

    public String internalIdentificator;

    public int value;

    public String externalIdentificator;

    public int externalValue;

    public Filter() {
    }

    public Filter(String internalIdentificator, int value, String externalIdentificator, int externalValue) {
        this.internalIdentificator = internalIdentificator;
        this.value = value;
        this.externalIdentificator = externalIdentificator;
        this.externalValue = externalValue;
    }
}