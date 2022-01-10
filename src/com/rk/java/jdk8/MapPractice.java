package com.rk.java.jdk8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.rk.java.model.Employee;



public class MapPractice {
	
	public static void main(String[] args) {
		//Count of words in a list
		
		List<String> words = Arrays.asList("hello","hi","hi","hello","hello","hi","whatsup");
		
		String wordCount = 
				words.stream().
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.max(Comparator.comparing(Entry::getValue))
				.map(Entry::getKey)
				.orElse("-1");
				System.out.println(wordCount);
		
		//Iterate over a map of employee objects
				
				Employee employee1 = new Employee(1, "radhe1", 10.0);
				Employee employee2 = new Employee(2, "radhey2", 20.0);
				Employee employee3 = new Employee(3, "radhey3", 30.0);
				
				Map<Integer,Employee> map = new HashMap<Integer,Employee>();
				map.putIfAbsent(1,employee1);
				map.putIfAbsent(2,employee2);
				map.putIfAbsent(3,employee3);
				
				map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)).forEach((k,v)->System.out.println("key "+k+"value "+v));
				
				
	}

}
