package com.Collections;

public class Boat extends Car{
	private String name;
	
	Boat(String name, int speed, double price, String color) {
		super(speed, price, color);
		
	}

	public String speed() {
		return "Max speed of this boat is: "+getSpeed() + " knots per hour";
	}
}
