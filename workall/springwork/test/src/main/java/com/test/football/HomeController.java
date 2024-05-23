package com.test.football;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private static final String API_KEY = "0e1ee7035c024df991b91a5917050506";
    private static final String URL_TEMPLATE = "https://api.football-data.org/v4/competitions/PL/standings?season=%d";

    @GetMapping("/")
    public String home(Model model) {
        int season = 2023;  // 원하는 시즌 ID
        String url = String.format(URL_TEMPLATE, season);

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

            List<TeamInfo> teamInfoList = new ArrayList<>();
            JsonNode standingsNode = jsonNode.get("standings").get(0).get("table");
            for (JsonNode teamNode : standingsNode) {
                String teamName = teamNode.get("team").get("name").asText();
                int playedGames = teamNode.get("playedGames").asInt();
                int wins = teamNode.get("won").asInt();
                int losses = teamNode.get("lost").asInt();
                int draws = teamNode.get("draw").asInt();
                int goalsFor = teamNode.get("goalsFor").asInt();
                int goalsAgainst = teamNode.get("goalsAgainst").asInt();

                TeamInfo teamInfo = new TeamInfo(teamName, playedGames, wins, losses, draws, goalsFor, goalsAgainst);
                teamInfoList.add(teamInfo);
            }

            model.addAttribute("teamInfoList", teamInfoList);
            model.addAttribute("season", season);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "home";
    }
}
