package com.practice.jdk8;

import java.util.ArrayList;
import java.util.List;

public class MappingExamples {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("why");

		System.out.println("Converting each element to upper case....");
		list.stream().map(x -> x.toUpperCase()).forEach(System.out::println);

		List<Character> characters = new ArrayList<>();
		characters.add('a');
		characters.add('b');
		characters.add('c');

	}

}
