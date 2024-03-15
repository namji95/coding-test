import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        int numOfPlayers = players.length;
        Map<String, Integer> ranking = new HashMap<>();
        for (int i = 0; i < numOfPlayers; i++) {
            ranking.put(players[i], i);
        }
        
        // 경주 진행
        for (String player : callings) {
            // 1) player의 이름에 해당하는 value를 저장합니다.
            int playerRanking = ranking.get(player);

            // 2) player보다 앞에 있는 사람을 받견학고, value를 변경합니다.
            String frontPlayer = players[playerRanking - 1];

            ranking.replace(frontPlayer, playerRanking);
            players[playerRanking] = frontPlayer;

            // 3) player의 랭킹을 앞으로 변경합니다.
            ranking.replace(player, playerRanking - 1);
            players[playerRanking - 1] = player;
        }
        return players;
    }
}