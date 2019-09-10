package com.practice.jdk8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.practice.jdk8.model.Employee;

/**
 * @author rackakka
 * This class shows how to iterate over map containing employee objects
 * using JDK8 APIs.
 */
public class IterateMap {

	public static void main(String[] args) {

		Employee employee1 = new Employee(1, "radhe1", 10.0);
		Employee employee2 = new Employee(2, "radhey2", 20.0);
		Employee employee3 = new Employee(3, "radhey3", 30.0);

		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		map.putIfAbsent(1, employee1);
		map.putIfAbsent(2, employee2);
		map.putIfAbsent(3, employee3);

		map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
				.forEach((k, v) -> System.out.println("key " + k + "value " + v));

	}

}
