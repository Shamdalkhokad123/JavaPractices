package com.virtusa;

import java.util.TreeSet;

public class TrreSetDemo {

	public static void main(String[] args) 
	{
		System.out.println("Example of TreeSet Demo");
		
		TreeSet<Integer> tr= new TreeSet<>();
		tr.add(100);
		
		tr.add(200);
		tr.add(300);
		
		tr.add(50);
		
		System.out.println(tr);
		
		System.out.println("Example of String With TreeSet");
		
		TreeSet<String> tr1 = new TreeSet<>(new StringCompare());
		tr1.add("Shamdal");
		tr1.add("Kushal");
		tr1.add("Anil");
		tr1.add("Shital");
		
		System.out.println(tr1);
		
		System.out.println("Folllowing are useful to understand the customized class");

		TreeSet<Employee> emp = new TreeSet<>(new NewComparator());
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
