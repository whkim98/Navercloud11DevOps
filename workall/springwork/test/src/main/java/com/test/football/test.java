package com.test.football;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class test {
    private static final String API_KEY = "0e1ee7035c024df991b91a5917050506";
    private static final String MATCH_URL = "https://api.football-data.org/v4/matches/330299";

    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(MATCH_URL))
                    .header("X-Auth-Token", API_KEY)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();

            ObjectMapper mapper = new ObjectMapper();
            JsonNode matchData = mapper.readTree(responseBody);

            // Extracting and printing match information
            System.out.println("Match Information:");
            System.out.println("Date: " + matchData.get("utcDate").asText());
            System.out.println("Venue: " + matchData.get("venue").asText());
            System.out.println("Status: " + matchData.get("status").asText());

            // Extracting and printing home team information
            JsonNode homeTeam = matchData.get("homeTeam");
            System.out.println("\nHome Team:");
            System.out.println("Name: " + homeTeam.get("name").asText());

            // Extracting and printing away team information
            JsonNode awayTeam = matchData.get("awayTeam");
            System.out.println("\nAway Team:");
            System.out.println("Name: " + awayTeam.get("name").asText());

            // Extracting and printing score information
            JsonNode score = matchData.get("score");
            System.out.println("\nScore:");
            System.out.println("Full Time: " + score.get("fullTime").get("home").asInt() + " - " + score.get("fullTime").get("away").asInt());

            // Extracting and printing goals
            if (matchData.has("goals") && matchData.get("goals").isArray()) {
                JsonNode goals = matchData.get("goals");
                System.out.println("\nGoals:");
                for (JsonNode goal : goals) {
                    System.out.println("Minute: " + goal.get("minute").asText());
                    System.out.println("Scorer: " + goal.get("scorer").get("name").asText());
                    JsonNode assist = goal.get("assist");
                    if (assist != null && !assist.isNull()) {
                        System.out.println("Assist: " + assist.get("name").asText());
                    }
                    System.out.println("Type: " + goal.get("type").asText());
                    System.out.println("---");
                }
            } else {
                System.out.println("No goals data available.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
