package com.challenges;

public class Loop {

public static void main(String[] args) {
		//Call loop(n);
		loop(3);
	}
	
	public static void loop(int num) {
		int buffer = 1;
		for (int i = 1; i<=10; i++) {
			buffer= num * i;
			System.out.println(num + " x " + i + " = "+ buffer);
		}
	}
}

//Outputs

// 3 x 1 = 3
// 3 x 2 = 6
// 3 x 3 = 9
// 3 x 4 = 12
// 3 x 5 = 15
// 3 x 6 = 18
// 3 x 7 = 21
// 3 x 8 = 24
// 3 x 9 = 27
// 3 x 10 = 30