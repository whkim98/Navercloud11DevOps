package com.test.football;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class test {
    private static final String API_KEY = "0e1ee7035c024df991b91a5917050506";  // 실제 API 키로 교체하세요.
    private static final String URL_TEMPLATE = "http://api.football-data.org/v4/competitions/2003/matches?matchday=1";

    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL_TEMPLATE))
                    .header("X-Unfold-Goals", "true")
                    .header("X-Auth-Token", API_KEY)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();

            // Print the entire JSON response
            System.out.println("JSON 응답 전체: ");
            System.out.println(responseBody);

            ObjectMapper mapper = new ObjectMapper();
            JsonNode jsonNode = mapper.readTree(responseBody);

            // Pretty print the JSON tree for better readability
            String prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
            System.out.println("Pretty JSON 응답: ");
            System.out.println(prettyJson);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
