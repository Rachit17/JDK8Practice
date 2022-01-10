package com.rk.java.jdk8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.rk.java.model.Employee;



public class SortList {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");

		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		
        //Natural sort
		sortedList.forEach(System.out::println);
		
		//Object(Employee) Sort
		Employee employee1 = new Employee(1, "radhey", 10.0);
		Employee employee3 = new Employee(3, "ghanshyam", 30.0);
		Employee employee2 = new Employee(2, "ashutosh", 20.0);
		
		Arrays.asList(employee1,employee2,employee3).stream().sorted(Comparator.comparing(Employee::getEmpName)).forEach(System.out::println);

	}

}
