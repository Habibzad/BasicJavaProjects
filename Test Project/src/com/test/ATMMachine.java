// ## Requirements Statement for Example ATM program
// # The program to be designed will control a simulated automated teller machine (ATM). 
// # The user will be required to enter a valid card number and a personal identification number (PIN). 
// # If the PIN is invalid, the user will be required to re-enter the PIN before a transaction can proceed. 
// # The user will then be able to perform one transaction or check his/her balance. 
// # The program will provide the user with a success message. 


package com.test;
import java.util.*;

public class ATMMachine {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			double balance = 560.0;

			//Get the user card number and store in a variable
			//Insert your card
			System.out.println("Please enter your card number");
			int cardNumber = input.nextInt();
			
			while(cardNumber!=123456) {
				System.out.println("Invalid Card number. Please enter the correct card number");
				cardNumber = input.nextInt();
			}
			int userInputPin;
			boolean userInputIsCorrect = false;
			
			if(cardNumber==123456) {
				do {
					System.out.println("Enter your PIN");
					userInputPin = input.nextInt();
				} while(userInputPin != 123);
				userInputIsCorrect = true;
				if(userInputIsCorrect) {
					//Choose a type of transaction
					System.out.println("Enter 1 for balance, \nenter 2 for withdrawal");
					int userSelection = input.nextInt();
					if(userSelection == 1) {
						System.out.println("Here is your balance: " + balance);
					}
					else if(userSelection == 2) {
						//Enter the transaction amount
						System.out.println("Please enter amount");
						double amount = input.nextDouble();
						
						if(amount>balance) {
							System.out.println("Your balance is low. Please enter a lower amount");
						}
						else if(amount>5) {
							balance-=amount;
							System.out.println("Transaction Successful! Here is your new Balance: " + balance );
						}
						else {
							System.out.println("The minimum amount to be withdrawn is 5 dollars");
						}
					}
					else {
						System.out.println("Please select the correct option");
					}
				}
			}
		}
		catch (Exception e) {
			System.out.println("An error occured!");
		}
	}
}
