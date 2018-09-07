package utils;

public class Config {
	
	private int gameWidth;
	private int gameHeight;
	private int gameScale;
	private int imageType;
	private String gameTitle; 
	
	public Config(int gameWidth, int gameHeight, int gameScale, int imageType, String gameTitle) {
		this.gameWidth = gameWidth;
		this.gameHeight = gameHeight;
		this.gameTitle = gameTitle;	
		this.gameScale = gameScale;
		this.imageType = imageType;
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
		
}
