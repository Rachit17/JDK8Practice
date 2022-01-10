package com.rk.java.jdk8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.rk.java.model.Person;


public class PersonComparatorExample {
	
	public static void main(String[] args) {
		sortPeopleByNameAndAge();
	}

	    public static void sortPeopleByNameAndAge() {
	        List<Person> people = Arrays.asList(
	                new Person("Foo", 23),
	                new Person("Jane", 19),
	                new Person("Foo1", 21)
	        );
	        people.stream().sorted(
	        		Comparator.comparing(Person ::getName)
	        		.thenComparing(Person::getAge)).
	        forEach(System.out::println);
	    }

	}


