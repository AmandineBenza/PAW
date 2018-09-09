package com.dzoum.pow.utils;

import com.dzoum.pow.graphics.Screen;

public class TickCounter {
	
	private int ticks;
	private int bound;
	private boolean running;
	
	public TickCounter(int bound) {
		this.ticks = 0;
		this.bound = bound;
		this.running = false;
	}
	
	public void update() { // 1 sec => 60 updates
		if (this.running) {
			this.ticks += 1;		
			checkState();
		}
	}
	
	public void start() {
		if(!running) {
			running = true;
		}
	}
	
	private void checkState() {	
		if (ticks >= bound) {
			running = false;
		}
	}
	
	public boolean isRunning() {
		return running; 
	}
	
	public void reset() {
		this.ticks = 0;
		this.running = false;
	}
	
	public void render(Screen screen, int x, int y) {
		
	}
	
}
