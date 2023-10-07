package com.virtusa;
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class ThreadBased {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}

	}

}
