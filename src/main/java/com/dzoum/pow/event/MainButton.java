package com.dzoum.pow.event;

import com.dzoum.pow.bonus.Shop;
import com.dzoum.pow.graphics.Screen;
import com.dzoum.pow.graphics.Texture;
import com.dzoum.pow.utils.AABB;

public class MainButton extends Button {

	private AABB box;
	
	public MainButton(int x, int y) {
		super(x, y, Texture.CAT_FACE_12x13);
		this.box = new AABB(x, y, texture.getWidth(), texture.getHeight());
	}
	
	@Override
	public void interact(Shop shop) {
		shop.buyCatFace();
	}

	@Override
	public void render(Screen screen) {
		screen.render(texture, x, y);
	}

	public AABB getBox() {
		return box;
	}
	
}
