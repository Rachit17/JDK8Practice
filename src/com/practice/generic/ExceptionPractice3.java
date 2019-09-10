package com.practice.generic;

import javax.management.RuntimeErrorException;

public class ExceptionPractice3 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("A");
			badMethod();
			
			
		} catch (Exception e) {
			System.out.println("B");
		}
		finally {
			System.out.println("C");
		}
		System.out.println("D");
	}
	
	public static void badMethod() {
		
		throw new RuntimeErrorException(null, "Runtime exception..");
		
	}

}
