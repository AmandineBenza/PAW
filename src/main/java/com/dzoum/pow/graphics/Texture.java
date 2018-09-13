package com.dzoum.pow.graphics;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.dzoum.pow.utils.Utils;

public class Texture {
	
	public final static BufferedImage CAT_FACE_12x13 = Texture.getSubTexture(Utils.texturePath("catFace12x13.png"), 0, 0, 12, 13);
	public final static BufferedImage CAT_PAW_23x19 = Texture.getSubTexture(Utils.texturePath("catPaw23x19.png"), 0, 0, 23, 19);

	public static BufferedImage getSubTexture(String filePath, int xp, int yp, int width, int height) {
		BufferedImage tileImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		try {
			tileImage = ImageIO.read(new FileInputStream(filePath));
			tileImage = tileImage.getSubimage(xp, yp, width, height);

			int w = tileImage.getWidth();
			int h = tileImage.getHeight();

			for (int x = 0; x < w; x++) {
				for (int y = 0; y < h; y++) {
					int argb = tileImage.getRGB(x, y);
					// removes the MAGENTA color from the texture
					if (argb == Color.MAGENTA.getRGB()) {
						tileImage.setRGB(x, y, 0);
					}
				}
			}
			return tileImage;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}

