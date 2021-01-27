package com.Collections;
import java.util.ArrayList;


//Create a Vehicle interface 
//that is implemented by car class 
//which is extended by boat class. 
//Then, create objects of these classes, add these objects in an arrayList and print them in the console.

public class Main {

	public static void main(String[] args) {
		Vehicle toyota = new Car(240, 20000.00, "black");
		Vehicle boat = new Boat("Marina", 20, 16000, "white");

		ArrayList <Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(toyota);
		vehicleList.add(boat);
		
		System.out.println(vehicleList);
	}

}


//Outputs:
//[Vehicle [price=20000.0, color=black, speed=Max speed of this car is: 240 km/h], Vehicle [price=16000.0, color=white, speed=Max speed of this boat is: 20 knots per hour]]