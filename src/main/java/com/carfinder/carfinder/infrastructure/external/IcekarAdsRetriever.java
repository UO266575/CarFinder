package com.carfinder.carfinder.infrastructure.external;

import com.carfinder.carfinder.domain.Ad;
import com.carfinder.carfinder.infrastructure.external.adapters.AdsRetrieverAdapter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class IcekarAdsRetriever implements AdsRetrieverAdapter {

    @Override
    public List<Ad> callAPI(Map<String, Integer> queryParams) {
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

            return createAdsList(responseBody);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<Ad> createAdsList(String responseBody) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(responseBody);

        List<Ad> ads = new ArrayList<>();
        for (JsonNode node : jsonNode) {
            String id = node.get("id").asText();
            String title = node.get("title").asText();
            float price = node.get("price").floatValue();
            String image;
            if (node.get("images").get(0) != null) {
                image = node.get("images").get(0).asText();
            } else {
                image = "default-image.png";
            }

            String link = node.get("links").get(0).get("link").asText();

            Ad ad = new Ad(id, title, price, image, link);
            ads.add(ad);
        }

        return ads;
    }

//    private List<Ad> createAdsList(String responseBody) throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        JsonNode root = objectMapper.readTree(responseBody);
//
//        String id = root.get("id").asText();
//        String title = root.get("title").asText();
//        float price = root.get("price").floatValue();
//
//        JsonNode imagesNode = root.get("images");
//        String image;
//        if (imagesNode.isArray() && imagesNode.size() > 0) {
//            image = imagesNode.get(0).asText();
//        } else {
//            image = "default-image.jpg";
//        }
//
//        String link = root.get("links").get(0).get("link").asText();
//
//        Ad ad = new Ad(id, title, price, image, link);
//
//        List<Ad> ads = new ArrayList<>();
//        ads.add(ad);
//
//        return ads;
//    }
}
