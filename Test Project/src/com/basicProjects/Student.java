package com.basicProjects;

public class Student {
	private int age;
	
	Student(int age){
		setAge(age);
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
		if(age>=10 && age<=20 ) {
			this.age = age;
		}
		else {
			System.out.println("Invalid age");
		}
		
	}
}
