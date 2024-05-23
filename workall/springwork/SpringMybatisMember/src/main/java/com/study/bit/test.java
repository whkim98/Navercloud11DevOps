package com.study.bit;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class test {
    private static final String API_KEY = "0e1ee7035c024df991b91a5917050506";
    private static final String URL_TEMPLATE = "https://api.football-data.org/v4/competitions/PL/scorers";

    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL_TEMPLATE))
                    .header("X-Auth-Token", API_KEY)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();

            ObjectMapper mapper = new ObjectMapper();
            JsonNode jsonNode = mapper.readTree(responseBody);

            JsonNode scorers = jsonNode.get("scorers");
            for (JsonNode scorer : scorers) {
                String playerName = scorer.get("player").get("name").asText();
                int goals = scorer.get("goals").asInt();
                System.out.println(playerName + " - Goals: " + goals);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
