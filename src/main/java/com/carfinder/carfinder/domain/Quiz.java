package com.carfinder.carfinder.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Quiz {

    public Set<Filter> filters;

    public Quiz() {
        this.filters = new HashSet<Filter>();
    }


}
