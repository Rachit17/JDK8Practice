package src.com.rk.java.jdk8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToList {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Radhey");
		map.put(2, "Angad");
		map.put(3, "Raghav");
		map.put(4, "Ammy");

		// Keys conversion to list
		map.keySet().stream().collect(Collectors.toList()).forEach(System.out::println);

		// Values conversion to list with sorting
		map.values().stream().collect(Collectors.toList()).stream().sorted().forEach(System.out::println);

	}

}
