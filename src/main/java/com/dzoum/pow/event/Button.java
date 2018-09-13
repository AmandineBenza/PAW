package com.dzoum.pow.event;

import java.awt.image.BufferedImage;

import com.dzoum.pow.bonus.Shop;
import com.dzoum.pow.graphics.Screen;

public abstract class Button {
	
	protected int x;
	protected int y;
	protected BufferedImage texture;
	
	public Button(int x, int y, BufferedImage texture) {
		this.x = x;
		this.y = y;
		this.texture = texture;
	}
	
	public abstract void interact(Shop shop);
	public abstract void render(Screen screen);
}
