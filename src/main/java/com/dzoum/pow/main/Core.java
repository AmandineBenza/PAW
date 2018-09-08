package com.dzoum.pow.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import com.dzoum.pow.graphics.Window;
import com.dzoum.pow.utils.Config;

public class Core extends JPanel implements Runnable, KeyListener {

	private static final long serialVersionUID = -5524815598464412250L;
	
	// configuration
	private Config config; 
	
	// game thread
	private Thread thread;
	private boolean running;
	
	// graphics
	private Window window;
	private BufferedImage screen;
	private Graphics2D g;
	
	public Core (Config config) {
		super();
		this.config = config;
		this.running = false;
		this.window = new Window(this, this.config);
		this.init();
	}
	
	private void init() {
		setPreferredSize(new Dimension(config.getGameWidth() * config.getGameScale(), config.getGameHeight() * config.getGameScale()));
		setFocusable(true);
		requestFocus();
		this.screen = new BufferedImage(config.getGameWidth(), config.getGameHeight(), config.getImageType());
		this.g = (Graphics2D) this.screen.getGraphics();
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		long lastTime = System.nanoTime();
		double unprocessed = 0;
		double nsPerTick = 1000000000.0 / 60;
		int frames = 0;
		
		@SuppressWarnings("unused")
		int ticks = 0;
		long lastTimer1 = System.currentTimeMillis();
		
		while (running) {
			long now = System.nanoTime();
			unprocessed += (now - lastTime) / nsPerTick;
			lastTime = now;
			boolean shouldRender = true;
			
			while (unprocessed >= 1) {
				ticks++;
				update();
				unprocessed -= 1;
				shouldRender = true;
			}

			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (shouldRender) {
				frames++;
				render();
				renderToScreen();
			}

			if (System.currentTimeMillis() - lastTimer1 > 1000) {
				window.setTitle(frames + " fps");
				lastTimer1 += 1000;
				frames = 0;
				ticks = 0;
			}
		}
	}
	
	public void update() {

	}
	
	public void render() {
		renderWhiteScreen();
	}
	
	public void start() {
		if(running) {
			return;
		}
		
		running = true;
		window.start();
	}
	
	public void stop() {
		if(!running) {
			return;
		}
		
		window = null;
		running = false; 
	}
	
	private void renderWhiteScreen(){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, config.getGameWidth(), config.getGameHeight());
	}
	
	public void renderToScreen(){
		Graphics g2 = getGraphics();
		g2.drawImage(screen, 0, 0, config.getGameWidth() * config.getGameScale(), config.getGameHeight() * config.getGameScale(), null);
		g2.dispose();
	}
	
	@Override
	public void addNotify() {
		super.addNotify();
		if(thread == null) {
			thread = new Thread(this);
			addKeyListener(this);
			thread.start();
		}
	}
	
}
