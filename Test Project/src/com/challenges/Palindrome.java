package com.challenges;

public class Palindrome {
	
	public static boolean isPalindrome(int num) {
		String numValue = String.valueOf(num);
		return numValue.equals(new StringBuilder(numValue).reverse().toString());
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(123454321));
	}

}
