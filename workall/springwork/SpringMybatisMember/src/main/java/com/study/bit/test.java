package com.study.bit;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class test {
    private static final String API_KEY = "0e1ee7035c024df991b91a5917050506";
    private static final String URL_TEMPLATE = "https://api.football-data.org/v4/competitions/PL/matches?season=%d&matchday=%d";

    public static void main(String[] args) {
        int season = 2022;  // 원하는 시즌 ID
        int matchday = 1;  // 원하는 경기일
        String url = String.format(URL_TEMPLATE, season, matchday);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("X-Auth-Token", API_KEY)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();

            ObjectMapper mapper = new ObjectMapper();
            JsonNode jsonNode = mapper.readTree(responseBody);

            System.out.println(jsonNode.toPrettyString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
