package com.rk.java.jdk8;

public class ExceptionPractice2 {
	
	public static void main(String[] args) {
		
		try {
			execute();
			System.out.println("success");
			
		} catch (Exception e) {
			System.out.println("catch............");
		}
	}
	
	public static void execute() {
		try {
			throw new IllegalArgumentException();
		} catch (Exception e) {
			throw new NullPointerException();
		}
		finally {
			throw new IndexOutOfBoundsException();
		}
	}

}
