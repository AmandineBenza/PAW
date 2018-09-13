package com.dzoum.pow.main;

import java.awt.image.BufferedImage;

import com.dzoum.pow.utils.Config;

public class Application {
	
	public static void main(String[] args) {
		
		new Core(new Config(160, 120, 4, BufferedImage.TYPE_INT_RGB, 3600, 60, "Pow")).start();
		
	}

}
