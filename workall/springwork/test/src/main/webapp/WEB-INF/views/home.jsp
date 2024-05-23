<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Football Team Standings</title>
</head>
<body>
    <h1>Football Team Standings</h1>

    <table border="1">
        <thead>
            <tr>
                <th>Team</th>
                <th>Played Games</th>
                <th>Wins</th>
                <th>Losses</th>
                <th>Draws</th>
                <th>Goals For</th>
                <th>Goals Against</th>
                <th>Goal Difference</th>
                <th>Points</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${teamInfoList}" var="teamInfo">
                <tr>
                    <td>${teamInfo.teamName}</td>
                    <td>${teamInfo.playedGames}</td>
                    <td>${teamInfo.wins}</td>
                    <td>${teamInfo.losses}</td>
                    <td>${teamInfo.draws}</td>
                    <td>${teamInfo.goalsFor}</td>
                    <td>${teamInfo.goalsAgainst}</td>
                    <td>${teamInfo.goalDifference}</td>
                    <td>${teamInfo.points}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>