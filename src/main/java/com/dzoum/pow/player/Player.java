package com.dzoum.pow.player;

import com.dzoum.pow.graphics.Screen;
import com.dzoum.pow.scoring.Score;

public class Player {
	
	private Score globalScore;
	private Score onClickScore;
	private Score passiveScore;
	
	public Player() {	
		this.globalScore = new Score();	
		this.onClickScore = new Score(1);	
		this.passiveScore = new Score();
	}

	public Score getGlobalScore() {
		return globalScore;
	}

	public Score getOnClickScore() {
		return onClickScore;
	}

	public Score getPassiveScore() {
		return passiveScore;
	}
	
	public void render(Screen screen, int x, int y) {
		
	}

}
