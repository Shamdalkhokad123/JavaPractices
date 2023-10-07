package com.virtusa;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class Sequence {

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis = new FileInputStream("D:/demo1.txt");
			FileInputStream fis1 = new FileInputStream("D:/demo2.txt");
			
			SequenceInputStream sis = new SequenceInputStream(fis,fis1);
			
			int ch;
			
			while((ch=sis.read())!=-1)
			{
				System.out.print((char)ch);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
