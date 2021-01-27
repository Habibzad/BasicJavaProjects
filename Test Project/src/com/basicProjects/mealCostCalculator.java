package com.basicProjects;
//Task
//Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), 
//and tax percent (the percentage of the meal price being added as tax) for a meal, 
//find and print the meal's total cost. Round the result to the nearest integer.
//Example
//A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. 
//Print the value  and return from the function.

public class mealCostCalculator {

	public static void main(String[] args) {
		
		totalCost(12.0,20,8);

	}
	
	static void totalCost(double meal_cost, int tip_percent, int tax_percent) {
        int total = (int)(Math.round(meal_cost+(meal_cost*tip_percent/100)+meal_cost*tax_percent/100));
        System.out.println(total);
    }

}
