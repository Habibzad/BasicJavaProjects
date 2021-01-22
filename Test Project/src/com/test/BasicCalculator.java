package com.test;
import java.util.*;

public class BasicCalculator {
	public static void main(String[] Args) {
		int result;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int num1 = input.nextInt();

			System.out.println("Select an operator: + , - , *, /");
			String operator = input.next();

			System.out.println("Enter another number");
			int num2 = input.nextInt();

			if (operator.equals("+")) {
				result = num1 + num2;
				System.out.println(num1 + " plus " + num2 + " is: " + result);
			}

			if (operator.equals("-")) {
				result = num1 - num2;
				System.out.println(num1 + " minus " + num2 + " is: " + result);
			}

			if (operator.equals("*")) {
				result = num1 * num2;
				System.out.println(num1 + " multiplied by " + num2 + " is: " + result);
			}

			try {
				if (operator.equals("/")) {
					result = num1 / num2;
					System.out.println(num1 + " divided by " + num2 + " is: " + result);
				}
			}

			catch (Exception e) {
				System.out.println("Cannot be divided by 0");
			}
		}
	}
}

