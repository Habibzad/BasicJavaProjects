package com.basicProjects;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(loneTeen(13,13));
	}
	
	static boolean loneTeen(int a, int b) {
		boolean aTeen = (a >= 13 && a <= 19);
		boolean bTeen = (b >= 13 && b <= 19);
		  
		return (aTeen && !bTeen) || (!aTeen && bTeen);
	}

}
