package com.practice.jdk8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Rk");
		map.put(2, "gelly");
		map.put(3, "alpha");

		Map<Integer, String> finalMap = map.entrySet().stream().filter(x -> x.getValue().startsWith("g"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(finalMap);

	}

}
