package com.virtusa;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInput {

	public static void main(String[] args) {
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:/demo2.txt"));
			int ch;
			while((ch = bis.read())!=-1)
			{
				System.out.print((char)ch);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
