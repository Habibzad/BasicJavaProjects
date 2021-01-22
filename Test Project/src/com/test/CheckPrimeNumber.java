package com.test;
import java.util.*;

public class CheckPrimeNumber {
	
	public static void main(String[] args) {
		
		try (Scanner userInput = new Scanner(System.in)) {
			System.out.println("Please enter a number");
			int num = userInput.nextInt();
			boolean prime = false;
			
			for (int i = 2; i <= num / 2; ++i) {
			  
			  if (num % i == 0) {
			    prime = true;
			    break;
			  }
			}

			if (!prime)
			  System.out.println(num + " is a prime number.");
			else
			  System.out.println(num + " is NOT a prime number.");
		}

	}
}
