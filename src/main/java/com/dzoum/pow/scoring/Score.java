package com.dzoum.pow.scoring;

public class Score {
	
	private long value;
	
	public Score() {
		this.value = 0;
	}
	
	public long get() {
		return this.value;
	}
	
	public void increase(long val) {
		this.value += val;	
	}
	
	public void decrease(long val) {
		this.value -= val;	
	}
	
}
