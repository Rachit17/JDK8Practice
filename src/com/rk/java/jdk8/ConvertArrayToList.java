package com.rk.java.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertArrayToList {

	public static void main(String[] args) {

		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

		// First way
		List<Integer> list = Arrays.stream(number).boxed().collect(Collectors.toList());
		System.out.println(list);

		// Second Way
		IntStream.of(number).forEach(a -> System.out.print(a + " "));

	}

}
