package com.rk.java.generic;

public class Subclass extends ParentClass {
	
	public void show() throws RuntimeException{
		System.out.println("subclass");
		
	}
	public static void main(String[] args) {
		ParentClass subclass = new Subclass();
		subclass.show();
	}

}
