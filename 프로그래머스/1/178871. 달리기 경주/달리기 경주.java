import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> runPlayer = new LinkedHashMap<>();
    	
    	for (String player : players) {
    		runPlayer.put(player, runPlayer.size());
		}
    	
    	for (String play : callings) {
			int rank =runPlayer.get(play);
    		String player = players[rank];
    		String frontPlayer = players[rank-1];
    		
    		players[rank-1] =player;
    		players[rank] = frontPlayer;
    		
    		
    		runPlayer.put(player, rank-1);
    		runPlayer.put(frontPlayer, rank);
		}
    	return players;
    }
}