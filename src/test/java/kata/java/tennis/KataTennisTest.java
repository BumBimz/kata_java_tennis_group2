package kata.java.tennis;

import static org.junit.Assert.*;

import org.junit.Test;

public class KataTennisTest {

	TennisGame tennisGame = new TennisGame("Player A", "Player B");
	
	@Test
	public void newGameShouldReturnLoveAll() throws Exception {
		String score = tennisGame.getScore();
		assertEquals("Love all", score);
	}

	@Test
	public void playerAWinShouldReturnFifteenLove() throws Exception {
        tennisGame.playerScore(15, 0);
		String score = tennisGame.getScore();
		assertEquals("Fifteen Love", score);
	}
	
	@Test
	public void bothPlayerDrawWithFifteenShouldReturnFifteenAll() throws Exception {
		tennisGame.playerScore(15, 0);
		tennisGame.playerScore(0, 15);
		String score = tennisGame.getScore();
		assertEquals("Fifteen all", score);
	}
}
