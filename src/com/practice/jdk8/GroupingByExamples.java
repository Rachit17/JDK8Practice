package com.practice.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.practice.jdk8.model.Employee;

public class GroupingByExamples {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "radhey", 10.0);
		Employee employee3 = new Employee(3, "ghanshyam", 30.0);
		Employee employee2 = new Employee(2, "ashutosh", 20.0);
		Employee employee4 = new Employee(2, "ashutosh", 30.0);
		Employee employee5 = new Employee(2, "ghanshyam", 20.0);
		Employee employee6 = new Employee(1, "raghav", 10.0);

		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);

		System.out.println("Group by name.........");
		employees.stream().collect(Collectors.groupingBy(Employee::getEmpName, Collectors.counting()))
				.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println("Group by salary.........");
		employees.stream().collect(Collectors.groupingBy(Employee::getEmpSalary, Collectors.counting()))
				.forEach((k, v) -> System.out.println(k + " " + v));

		System.out.println("Collectors.summingDouble......");
		employees.stream()
				.collect(Collectors.groupingBy(Employee::getEmpName, Collectors.summingDouble(Employee::getEmpSalary)))
				.forEach((k, v) -> System.out.println(k + " " + v));
	}

}
