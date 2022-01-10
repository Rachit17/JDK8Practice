package com.rk.java.jdk8;

import java.util.Arrays;

/**
 * @author Rachit Kakkar This class checks if array contains specific value for
 *         both Integer and String Array.
 */
public class CheckValueInArray {

	public static void main(String[] args) {

		int[] intArray = { 1, 3, 10, 5, 6 };
		String[] stringArray = { "hi", "hello", "you", "me" };

		boolean if3Exists = Arrays.stream(intArray).anyMatch(x -> x == 3);

		boolean ifHelloExists = Arrays.stream(stringArray).anyMatch("Hello"::equalsIgnoreCase);

		System.out.println(if3Exists);
		System.out.println(ifHelloExists);

	}

}
