package main;

import java.awt.image.BufferedImage;

import utils.Config;

public class Application {
	
	public static void main(String[] args) {
		
		new Core(new Config(320, 240, 2, BufferedImage.TYPE_INT_ARGB, "Pow")).start();
		
	}

}
