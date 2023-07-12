package com.carfinder.carfinder.infrastructure.external.adapters;

import java.util.Map;

public interface AdsRetrieverAdapter {

    public String callAPI(Map<String, Integer> queryParams);
}
