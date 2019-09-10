package com.practice.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.practice.jdk8.model.Employee;

public class ConvertListToMap {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "radhey", 10.0);
		Employee employee3 = new Employee(3, "ghanshyam", 30.0);
		Employee employee2 = new Employee(2, "ashutosh", 20.0);

		List<Employee> employees = new ArrayList<>();

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);

		// Map with key as ID, value as name

		employees.stream().collect(Collectors.toMap(Employee::getEmpId, Employee::getEmpName))
				.forEach((k, v) -> System.out.println(k + " " + v));

		// If list contains duplicate value then do the following
		employees.stream()
				.collect(Collectors.toMap(Employee::getEmpId, Employee::getEmpName, (oldValue, newValue) -> oldValue))
				.forEach((k, v) -> System.out.println(k + " " + v));

	}

}
