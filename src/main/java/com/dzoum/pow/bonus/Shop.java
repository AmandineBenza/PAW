package com.dzoum.pow.bonus;

import java.util.ArrayList;
import java.util.List;

import com.dzoum.pow.event.Button;
import com.dzoum.pow.event.MainButton;
import com.dzoum.pow.graphics.Screen;
import com.dzoum.pow.scoring.ScoreUpdater;
import com.dzoum.pow.utils.Config;

public class Shop {
	
	@SuppressWarnings("unused")
	private Config config;
	@SuppressWarnings("unused")
	private Screen screen;
	private ScoreUpdater scoreUpdater;
	
	private List<Button> clickableButtons;
	
	public Shop(Config config, Screen screen, ScoreUpdater scoreUpdater) {
		this.config = config;
		this.screen = screen;
		this.scoreUpdater = scoreUpdater;
		build();
	}
	
	private void build() {
		int x = (config.getGameWidth() / 2) - 6;
		int y = (config.getGameHeight() / 2) - 12;
		this.clickableButtons = new ArrayList<>();	
		this.clickableButtons.add(new MainButton(x, y));
	}
	
	private void buyClickBonus(int clickBonusValue) {
		scoreUpdater.addOnClick(clickBonusValue);	
	}
	
	private void buyPassiveBonus(int passiveBonusValue) {
		scoreUpdater.addOnPassive(passiveBonusValue);	
	}
	
	public void buyCatFace() {
		buyClickBonus(1);
	}
	
	public void buyCatPaw() {
		buyClickBonus(10);
	}
	
	public void buyCatAgility() {
		buyPassiveBonus(2);
	}
	
	public void render(Screen screen) {
		clickableButtons.forEach(noisette -> noisette.render(screen));
	}
	
}
