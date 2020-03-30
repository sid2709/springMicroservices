package com.in228minutes.microservices.limitsservice.bean;

public class LimitConfiguration {

	private int minimum;
	private int maximum;

	
	
	public LimitConfiguration() {
		//super();
	}

	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

}
