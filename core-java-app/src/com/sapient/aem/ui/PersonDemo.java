package com.sapient.aem.ui;

import java.time.LocalDate;
import java.util.Arrays;

import com.sapient.aem.service.Person;


public class PersonDemo {
	public static void main(String[] args) {
		Person persons[]= {
				new Person(523465785454L,"Smith",LocalDate.of(1990, 5, 15),"Pune","smith@gmail.com",9878985559L),
				new Person(323465785454L,"Clarke",LocalDate.of(1991,9, 15),"Mumbai","clarke@gmail.com",7878987989L),
				new Person(123465715450L,"Adams",LocalDate.of(1989, 12, 25),"Hyderabad","adams@gmail.com",9878987980L),
				new Person(223000785459L,"Jones",LocalDate.of(1998, 10, 10),"New Delhi","jones@gmail.com",8878987989L)
		};

		System.out.println("Before sorting..");
		showPersons(persons);
		/*
		 * When comparing objects of user-defined classes, we need implement
		 * Comparable or Comparator interfaces so that the methods of these classes
		 * are used to compare objects
		 */
		//sorting based on adharcard(key attribute)
//		Arrays.sort(persons);
		
		//sorting based on person names(non-key attribute)
		//1st argument is array name
		//2nd argument is instance of the class that implements Comparator interface
//		Arrays.sort(persons, new PersonNameComparator());
		
		//sorting based on mobile number (non-key attribute)
		//use lamda expression to implement Comparator interface
		
		//TODO
//		Comparator<Person> comparator= (p1,p2)-> p1.getMobile().compareTo(p2.getMobile());
//		Arrays.sort(persons,comparator);
		
		//same as
		
//		Arrays.sort(persons, (p1,p2)-> p1.getMobile().compareTo(p2.getMobile()));
		
		///sorting based on email using lamda expression
		Arrays.sort(persons, (p1,p2)-> p1.getEmail().compareTo(p2.getEmail()));
		
		System.out.println("After sorting..");
		showPersons(persons);
		
	
//		System.out.println("------------------");
//		String courses[]= {"Java","Javascript","C++","Oracle"};
//		Arrays.sort(courses);
//		for(String s:courses) {
//			System.out.println(s);
//		}
	
	}

	private static void showPersons(Person[] persons) {
		for(Person p: persons) {
			System.out.println(p);
		}
		
	}
}
