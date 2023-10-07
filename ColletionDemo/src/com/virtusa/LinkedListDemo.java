package com.virtusa;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
arrayList();
		
		LinkedList<String> ar = new LinkedList<>();
		ar.add("Shamdal");
		ar.add("Shubhan");
		ar.add("Kushal");
		
		Collections.sort(ar,new Comparator<String>() {
			public int compare(String s1,String s2)
			{
				return s2.compareTo(s1);
			}
		});
		ar.forEach((n)->System.out.println(n));
	}

	private static void arrayList() {
		LinkedList<Integer> arr = new LinkedList<>();
		arr.add(120);
		arr.add(10);
		arr.add(1000);
	
		arr.forEach(
				(n)->System.out.println(n));
		
		System.out.println("Folllowing are useful to understand the customized class");
		
		LinkedList<Employee>  emp = new LinkedList<>();
		Employee e = new Employee(100,"Shamdal",90000);
		Employee e1 = new Employee(111,"Shivdal",10000);
		Employee e2 = new Employee(222,"Mehbub",30000);
		
		emp.add(e);
		emp.add(e1);
		emp.add(e2);
		
		Collections.sort(emp,new Comparator<Employee>(){
			public int compare(Employee e1,Employee e2)
			{
				int t1 =e1.getEmpno();
				int t2 = e2.getEmpno();
				if(t1<t2)
					return -1;
				else if(t1>t2)
					return 1;
				else 
					return 0;
			}
		}
		);
		
		emp.forEach(n-> System.out.println(n));

	}

}
