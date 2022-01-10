package com.rk.java.jdk8;

public class ConvertStringToCharArray {

	public static void main(String[] args) {

		String input = "hello 234";

		input.chars().mapToObj(x -> (char) x).forEach(x -> System.out.print(x + " "));
	}

}
