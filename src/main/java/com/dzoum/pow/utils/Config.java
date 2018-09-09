package com.dzoum.pow.utils;

public class Config {
	
	private int gameWidth;
	private int gameHeight;
	private int gameScale;
	private int imageType;
	private int gameTimerDelay;
	private int passiveScoreUpdateTimerDelay;
	private String gameTitle; 
	
	public Config(int gameWidth, int gameHeight, int gameScale, int imageType, int gameTimerDelay, int passiveScoreUpdateTimerDelay, String gameTitle) {
		this.gameWidth = gameWidth;
		this.gameHeight = gameHeight;
		this.gameTitle = gameTitle;	
		this.gameScale = gameScale;
		this.imageType = imageType;
		this.gameTimerDelay = gameTimerDelay;
		this.passiveScoreUpdateTimerDelay = passiveScoreUpdateTimerDelay;
	}

	public int getGameWidth() {
		return gameWidth;
	}

	public void setGameWidth(int gameWidth) {
		this.gameWidth = gameWidth;
	}

	public int getGameHeight() {
		return gameHeight;
	}

	public void setGameHeight(int gameHeight) {
		this.gameHeight = gameHeight;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}
	
	public int getGameScale() {
		return gameScale;
	}
	
	public void setGameScale(int gameScale) {
		this.gameScale = gameScale;
	}

	public int getImageType() {
		return imageType;
	}

	public void setImageType(int imageType) {
		this.imageType = imageType;
	}

	public int getGameTimerDelay() {
		return gameTimerDelay;
	}

	public void setGameTimerDelay(int gameTimerDelay) {
		this.gameTimerDelay = gameTimerDelay;
	}
	
	public int getPassiveScoreUpdateTimerDelay() {
		return this.passiveScoreUpdateTimerDelay;
	}
	
	public void setPassiveScoreUpdateTimerDelay(int passiveScoreUpdateTimerDelay) {
		this.passiveScoreUpdateTimerDelay = passiveScoreUpdateTimerDelay;
	}
		
}
