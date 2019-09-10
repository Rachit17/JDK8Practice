package com.practice.jdk8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Rachit Kakkar This class is used to calculate the frequency of
 *         characters in a string using JDK8 APIS.
 */
public class CharFrequency {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of test cases : ");

		int testCases = scanner.nextInt();

		for (int i = 0; i < testCases; i++) {
			System.out.println("Enter input String : ");

			String input = scanner.next();

			// Use tree map for natural sorting and linked hash map, for
			// insertion-order sorting

			Map<Character, Integer> freqs = new HashMap<>();
			for (Character c : input.toCharArray()) {
				freqs.merge(c, 1, Integer::sum);
			}
			System.out.println("Frequencies:\n" + freqs);

		}
		scanner.close();

	}

}
