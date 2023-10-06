package com.tnsif.daysix.hasarelationship;

public class Executor {
	
	public static void main(String args[]) {
		
		department d = new department(10,"IT",12);
		department d1 = new department(20,"Account",5);
		department d2 = new department(30,"HR",4);
		
		employee e = new employee(101,"nikita",6700,d);
		
		System.out.println(e);
		
		employee e1 = new employee(102,"abhi",30000,d1);
		
		System.out.println(e1);
		
		employee e2 = new employee(104,"arohi",40000,d2);
		
		System.out.println(e2);
		
		System.out.println(e2);
	}

}