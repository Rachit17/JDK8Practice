package src.com.rk.java.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import src.com.rk.java.model.Employee;


public class JoinStrings {

	public static void main(String[] args) {

		// Join Strings with comma

		String r = "Radhey";
		String g = "Ghanshyam";

		System.out.println(Arrays.asList(r, g).stream().collect(Collectors.joining("|")));

		// Join Object Strings

		List<Employee> list = Arrays.asList(new Employee(1, "Radhey", 30.0), new Employee(2, "Ushkena", 20.0),
				new Employee(3, "Aman", 10.0));

		// {Employee Objects Join}
		System.out.println(list.stream().map(x -> x.getEmpName()).collect(Collectors.joining(", ", "{", "}")));

	}

}
