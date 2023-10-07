package com.virtusa;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(23);
		hs.add(500);
		hs.add(345);

		System.out.println(hs);

		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Shamdal");
		hs1.add("Komal");
		hs1.add("Mangla");

		hs1.forEach(n -> System.out.println(n));

		System.out.println("Folllowing are useful to understand the customized class");

		HashSet<Employee> emp = new HashSet<>();
		Employee e = new Employee(100, "Shamdal", 90000);
		Employee e1 = new Employee(111, "Shivdal", 10000);
		Employee e2 = new Employee(222, "Mehbub", 30000);

		emp.add(e);
		emp.add(e1);
		emp.add(e2);
		
		for(Employee e4:emp)
			System.out.println(e4);

	}

}
