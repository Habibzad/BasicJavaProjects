package com.challenges;

public class Palindrome {
	
	public static String isPalindrome(int num) {
		String numValue = String.valueOf(num);
		if(numValue.equals(new StringBuilder(numValue).reverse().toString())) {
			return "is Palindrome";
		}
		else {
			return "is not Palindrome";
		}
		 
	}
	
	public static String isPalindrome(String str) {
		String reversedStr = new StringBuffer(str).reverse().toString();
		if(str.equals(reversedStr)) {
			return "is Palindrome";
		}
		else {
			return "is not Palindrome";
		}
		 
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(123454321));
		System.out.println(isPalindrome("rotor"));
	}

}
