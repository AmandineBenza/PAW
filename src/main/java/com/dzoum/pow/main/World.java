package com.dzoum.pow.main;

import com.dzoum.pow.bonus.Shop;
import com.dzoum.pow.graphics.Screen;
import com.dzoum.pow.player.Player;
import com.dzoum.pow.scoring.ScoreUpdater;
import com.dzoum.pow.utils.Config;
import com.dzoum.pow.utils.TickCounter;

public class World {
	
	@SuppressWarnings("unused")
	private Config config;
	private Screen screen;
	private Player player;
	private TickCounter gameTimer;
	private Shop shop;
	private ScoreUpdater scoreUpdater;
	
	public World(Config config, Screen screen) {
		this.config = config;
		this.screen = screen;
		this.player = new Player();
		this.gameTimer = new TickCounter(config.getGameTimerDelay());
		this.scoreUpdater = new ScoreUpdater(config, player);
		this.shop = new Shop(config, screen, scoreUpdater);
		start();
	}
	
	public void start() {
		gameTimer.start();
		scoreUpdater.start();
	}
	
	public void update() {
		gameTimer.update();
		scoreUpdater.update();		
	}
	
	public void render() {
		player.render(screen, 5, 5);
		gameTimer.render(screen, 5, 5);
		shop.render(screen);
	}
	
}
