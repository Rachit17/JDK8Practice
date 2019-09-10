package com.practice.jdk8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Rachit Kakkar
 * This class is used to join int/string arrays using
 *         Stream/INTStream APIS.
 */
public class JoinArrays {

	public static void main(String[] args) {

		String[] s1 = new String[] { "a", "b", "c" };
		String[] s2 = new String[] { "d", "e", "f" };
		String[] s3 = new String[] { "g", "h", "i" };

		// join object type array
		Stream.of(s1, s2, s3).flatMap(Stream::of).forEach(x -> System.out.print(x + " "));

		System.out.println("");

		int[] int1 = new int[] { 1, 2, 3 };
		int[] int2 = new int[] { 4, 5, 6 };
		int[] int3 = new int[] { 7, 8, 9 };

		Stream.of(int1, int2, int3).flatMapToInt(IntStream::of).forEach(x -> System.out.print(x + " "));

	}

}
