package com.dzoum.pow.bonus;

import com.dzoum.pow.graphics.Screen;
import com.dzoum.pow.scoring.ScoreUpdater;
import com.dzoum.pow.utils.Config;

public class Shop {
	
	@SuppressWarnings("unused")
	private Config config;
	@SuppressWarnings("unused")
	private Screen screen;
	private ScoreUpdater scoreUpdater;
	
	public Shop(Config config, Screen screen, ScoreUpdater scoreUpdater) {
		this.config = config;
		this.screen = screen;
		this.scoreUpdater = scoreUpdater;
	}
	
	private void buyClickBonus(int clickBonusValue) {
		scoreUpdater.addOnClick(clickBonusValue);	
	}
	
	private void buyPassiveBonus(int passiveBonusValue) {
		scoreUpdater.addOnPassive(passiveBonusValue);	
	}
	
	public void buyCatPaw() {
		buyClickBonus(10);
	}
	
	public void buyCatAgility() {
		buyPassiveBonus(2);
	}
	
	public void render(Screen screen) {
		
	}
	
	

}
