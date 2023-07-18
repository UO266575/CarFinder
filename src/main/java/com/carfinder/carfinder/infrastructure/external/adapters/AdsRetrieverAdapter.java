package com.carfinder.carfinder.infrastructure.external.adapters;

import com.carfinder.carfinder.domain.Ad;

import java.util.List;
import java.util.Map;

public interface AdsRetrieverAdapter {

    public List<Ad> callAPI(Map<String, Integer> queryParams);
}
