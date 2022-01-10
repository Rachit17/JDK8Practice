package src.com.rk.java.generic;

import java.util.HashSet;
import java.util.Set;

import src.com.rk.java.model.Employee;





public class HashSetCheck {
	
	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<>();
		
		employees.add(new Employee(1, "R", 30.0));
		employees.add(new Employee(1, "R", 30.0));
		
		System.out.println(employees.size());
		employees.remove(new Employee(1, "R", 30.0));
		System.out.println(employees.size());
		
	}

}
