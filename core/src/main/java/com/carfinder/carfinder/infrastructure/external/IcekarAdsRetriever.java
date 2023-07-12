package com.carfinder.carfinder.infrastructure.external;

import com.carfinder.carfinder.infrastructure.external.adapters.AdsRetrieverAdapter;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class IcekarAdsRetriever implements AdsRetrieverAdapter {

    @Override
    public String callAPI(Map<String, Integer> queryParams) {
        HttpClient httpClient = HttpClients.createDefault();

        StringBuilder urlBuilder = new StringBuilder("https://car-finder-service.icekar.es/cars/search?");
        for (Map.Entry<String, Integer> entry : queryParams.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            urlBuilder.append(key).append("=").append(value).append("&");
        }

        String urlWithParams = urlBuilder.toString();
        urlWithParams = urlWithParams.substring(0, urlWithParams.length() - 1);

        HttpGet httpGet = new HttpGet(urlWithParams);

        try {
            HttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            String responseBody = EntityUtils.toString(entity);

            return responseBody;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Error";
    }
}
