package com.practice.jdk8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.practice.jdk8.model.Employee;

/**
 * @author rackakka 
 * This class is used to sort map of Employee Objects, once by
 *         using salary and then by name .
 */
public class SortMapEmployeeObject {

	public static void main(String[] args) {

		Employee employee1 = new Employee(1, "radhey", 10.0);
		Employee employee3 = new Employee(3, "ghanshyam", 30.0);
		Employee employee2 = new Employee(2, "ashutosh", 20.0);

		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		map.put(1, employee1);
		map.put(2, employee2);
		map.put(3, employee3);

		sortMapBySalary(map);
		sortMapByName(map);

	}

	private static void sortMapBySalary(Map<Integer, Employee> map) {
		LinkedHashMap<Integer, Employee> compareBySalary = map.entrySet().stream()
				.sorted((e1, e2) -> Double.compare(e1.getValue().getEmpSalary(), e2.getValue().getEmpSalary()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("Comparing BY Salary " + compareBySalary);
	}
	
	private static void sortMapByName(Map<Integer, Employee> map) {
		LinkedHashMap<Integer, Employee> compareByName = map.entrySet().stream()
				.sorted((e1, e2) -> e1.getValue().getEmpName().compareTo(e2.getValue().getEmpName()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("Comparing BY Name " + compareByName);
	}

}
