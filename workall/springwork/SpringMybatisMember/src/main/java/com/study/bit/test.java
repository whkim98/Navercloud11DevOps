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
        int season = 2023;  // 원하는 시즌 ID
        int matchday = 1;   // 원하는 경기일
        String url = String.format(URL_TEMPLATE, season, matchday);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("X-Auth-Token", API_KEY)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();

            // 응답 데이터 출력
            System.out.println("API Response: " + responseBody);

            ObjectMapper mapper = new ObjectMapper();
            JsonNode jsonNode = mapper.readTree(responseBody);

            JsonNode matches = jsonNode.get("matches");
            if (matches != null) {
                for (JsonNode match : matches) {
                    String homeTeam = match.get("homeTeam").get("name").asText();
                    String awayTeam = match.get("awayTeam").get("name").asText();

                    if (homeTeam.equals("Manchester City") || awayTeam.equals("Manchester City")) {
                        System.out.println("Match: " + homeTeam + " vs " + awayTeam);

                        JsonNode score = match.get("score");
                        if (score != null && score.has("fullTime")) {
                            // 경기 정보 출력
                            JsonNode events = match.get("events");
                            if (events != null && events.isArray()) {
                                for (JsonNode event : events) {
                                    if (event.has("type") && event.get("type").asText().equals("GOAL")) {
                                        int minute = event.get("minute").asInt();
                                        String scorer = event.get("player").get("name").asText();
                                        System.out.println(minute + "' - " + scorer);
                                    }
                                }
                            } else {
                                System.out.println("No goals information available.");
                            }
                        } else {
                            System.out.println("No score information available.");
                        }
                    }
                }
            } else {
                System.out.println("No matches found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
