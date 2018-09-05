package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import utils.Config;

public class Core extends JPanel implements Runnable, KeyListener {

	private static final long serialVersionUID = -5524815598464412250L;
	private Config config; 
	
	// game thread
	private Thread thread;
	private boolean running;
	
	
	public Core (Config config) {
		this.config = config;
		this.running = false;
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

	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public void update() {
		
	}
	
	public void render() {
		
	}
	
	public void start() {
		if(running) {
			return;
		}	
		running = true; 
	}
	
	public void stop() {
		if(!running) {
			return;
		}	
		running = false; 
	}
		
	
}
