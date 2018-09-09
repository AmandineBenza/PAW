package com.dzoum.pow.scoring;

import com.dzoum.pow.player.Player;
import com.dzoum.pow.utils.Config;
import com.dzoum.pow.utils.TickCounter;

public class ScoreUpdater {
	
	@SuppressWarnings("unused")
	private Config config;
	private Player player;
	private TickCounter passiveScoreUpdateTimer;
	
	public ScoreUpdater(Config config, Player player) {
		this.config = config;
		this.player = player;
		this.passiveScoreUpdateTimer = new TickCounter(config.getPassiveScoreUpdateTimerDelay());
	}
	
	public void addOnClick(int clickBonusValue) {
		player.getOnClickScore().increase(clickBonusValue);
	}
	
	public void addOnPassive(int passiveBonusValue) {
		player.getPassiveScore().increase(passiveBonusValue);
	}
	
	public void start() {
		passiveScoreUpdateTimer.start();
	}
	
	public void update() {
		if(!passiveScoreUpdateTimer.isRunning()) {
			player.getGlobalScore().increase(player.getPassiveScore().get());
			passiveScoreUpdateTimer.reset();
			passiveScoreUpdateTimer.start();
		}
		
	}

}
