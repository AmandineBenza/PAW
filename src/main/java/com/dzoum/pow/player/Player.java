package com.dzoum.pow.player;

import com.dzoum.pow.scoring.Score;

public class Player {
	
	private Score score;
	
	public Player() {	
		score = new Score();	
	}
	
	public void increaseScore(long val) {
		score.increase(val);	
	}
	
	public void decreaseScore(long val) {
		score.decrease(val);
	}

}
