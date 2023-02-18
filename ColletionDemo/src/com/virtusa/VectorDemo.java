package com.virtusa;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) 
	{
		Vector<Integer> vt = new Vector<>();
		
		for(int i=0;i<4;i++)
		{
			vt.add(i);
		}
		
		Enumeration<Integer> en = vt.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}
	
}