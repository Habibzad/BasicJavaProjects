package com.Collections;

public class Car implements Vehicle{
	private int speed;
	private double price;
	private String color;
	
	public String speed() {
		return "Max speed of this car is: " + speed+ " km/h";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	Car(int speed, double price, String color){
		setSpeed(speed);
		setPrice(price);
		setColor(color);
	}

	@Override
	public String toString() {
		return "Vehicle [price=" + price + ", color=" + color + ", speed=" + speed() + "]";
	}

	
	
	
}
