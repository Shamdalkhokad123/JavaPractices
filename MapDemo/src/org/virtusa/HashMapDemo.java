package org.virtusa;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args)
	{
		genericHashMap();
		genericMethod();
		
		linkedMethod();
		
		weakHashMap();
		
		treemapDemo();
		
		Hashtable hs = new Hashtable();
		hs.put(1000, "Kushal");
		hs.put(20000, "Subhan");
		hs.put(1, "Anjali");
		
		System.out.println(hs);
		}

	private static void treemapDemo() {
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(1000, "Shamdal");
		tm.put(2000, "Bhawna");
		tm.put(1500, "Subhan");
		tm.put(1100, "Kushal");
		
		System.out.println(tm.keySet());
		System.out.println(tm.values());
		System.out.println(tm.entrySet());
	}

	private static void weakHashMap() {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		IdentityHashMap hm = new IdentityHashMap();
		hm.put(i2, "Shamdal");
		hm.put(i1, "Kushal");
		
		System.out.println(hm);
	}

	private static void linkedMethod() {
		LinkedHashMap<String,Integer> hm1 = new LinkedHashMap<String,Integer>();
		hm1.put("A", 65);
		hm1.put("B", 66);
		hm1.put("C", 67);
		hm1.put("z", 92);
		
		System.out.println();
		
		System.out.println(hm1);
	}

	private static void genericMethod() {
		HashMap<String,Integer> hm1 = new HashMap<String,Integer>();
		hm1.put("A", 65);
		hm1.put("B", 66);
		hm1.put("C", 67);
		
		System.out.println(hm1);
	}

	private static void genericHashMap() {
		HashMap hm = new HashMap();
		hm.put("Shamdal", 100);
		hm.put(100, "Radha");
		hm.put(200, 500);
		hm.put("Komal", "Rahul");
		
		hm.forEach((k,v)->System.out.println(k+"     "+v));
	}

}