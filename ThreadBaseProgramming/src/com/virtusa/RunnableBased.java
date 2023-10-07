package com.virtusa;
class MyThread1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class RunnableBased {

	public static void main(String[] args) {
		MyThread1 th = new MyThread1();
		Thread t = new Thread(th);
		
		t.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}

	}

}
