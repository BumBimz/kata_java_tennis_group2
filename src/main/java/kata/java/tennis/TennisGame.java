package kata.java.tennis;

import java.util.Map;
import java.util.HashMap;

public class TennisGame {

    int playerAScore = 0;
    int playerBScore = 0;

    @SuppressWarnings("serial")
	Map<Integer, String> scoreMapping = new HashMap<Integer, String>() {
        {
            put(0, "Love");
            put(15, "Fifteen");
            put(30, "Thirty");
            put(40, "Forty");
            put(50, "Win");
        }
    };

    public TennisGame(String playerA, String playerB) {
    }

    public void playerScore(int playerAScore, int playerBScore) {
        this.playerAScore += playerAScore;
        this.playerBScore += playerBScore;
    }

    public String getScore() {
        if (this.playerAScore == 50) {
            return String.format("%s For Player A", scoreMapping.get(playerAScore));
        } else if (this.playerAScore == this.playerBScore) {
        		if( this.playerAScore == 40 ) {
        			return "Deuce";
        		}
            return scoreMapping.get(playerAScore) + " all";
        } else {
            return scoreMapping.get(playerAScore) + " " + scoreMapping.get(playerBScore);
        }
    }
}
