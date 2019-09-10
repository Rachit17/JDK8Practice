package com.practice.generic;

@SuppressWarnings("serial")
class Test extends Exception{
	
}

public class ExceptionPractice {
	
	public static void main(String[] args) {
		
		try {
			throw new Test();
			
		} catch (Test t) {
			System.out.println("catch............");
		}
		finally {
			System.out.println("Finally---");
		}
	}

}
