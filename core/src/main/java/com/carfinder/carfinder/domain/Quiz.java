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

    public void calculateFilter(Filter filter) {
        boolean found = false;
        for (Filter existingFilter : filters) {
            if (filter.internalIdentificator.equals(existingFilter.internalIdentificator)) {
                existingFilter.value += filter.value;
                found = true;
                break;
            }
        }
        if (!found) {
            filters.add(filter);
        }
    }

    public List<Filter> getHigherFilters() {
        List<Filter> higherFilters = new ArrayList<Filter>();
        int maxBrandIdValue = 0;
        Filter maxBrandIdFilter = null;
        for (Filter filter : filters) {
            switch (filter.externalIdentificator) {
                case "brand_id":
                    if (filter.value > maxBrandIdValue) {
                        maxBrandIdValue = filter.value;
                        maxBrandIdFilter = filter;
                    }
                    break;
                case "vehicle_type_ids", "emission_sticker_ids", "gearbox_ids", "min_kms", "min_cv":
                    if (filter.value > 40) {
                        higherFilters.add(filter);
                    }
                    break;
            }
        }
        if (maxBrandIdValue > 0) {
            higherFilters.add(maxBrandIdFilter);
        }
        return higherFilters;
    }
}
