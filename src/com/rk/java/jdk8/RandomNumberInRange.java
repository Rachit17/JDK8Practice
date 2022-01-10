package com.rk.java.jdk8;

import java.util.Random;

/**
 * @author Rachit Kakkar
 * 
 *         This class generates the random numbers between 32 and 39, 32
 *         inclusive and 39 exclusive.
 *
 */
public class RandomNumberInRange {

	public static void main(String[] args) {

		new Random().ints(10, 32, 39).forEach(System.out::println);
	}

}
