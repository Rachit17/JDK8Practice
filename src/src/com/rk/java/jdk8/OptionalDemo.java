package src.com.rk.java.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import src.com.rk.java.model.Employee;




public class OptionalDemo {
	
	public static void main(String[] args) {
		 // creating a string array 
        List<Employee> employee = new ArrayList<>(); 
  
        employee.add(new Employee(1, "Ankit", 12.0));
        employee.add(new Employee(2, "Basera", 15.0));
        employee.add(new Employee(3, "Karlo", 18.0));
  
        // It returns a non-empty Optional 
        Optional<List<Employee>> value = Optional.ofNullable(employee); 
        

        // It returns true if value is present, 
        // otherwise false 
        System.out.println(value.isPresent()); 
  
        // It returns value of an Optional. 
        // If value is not present, it returns Optional.empty. 
               
        System.out.println(employee.stream().filter(x->x.getEmpId()==5).findAny());
  
    } 

}
