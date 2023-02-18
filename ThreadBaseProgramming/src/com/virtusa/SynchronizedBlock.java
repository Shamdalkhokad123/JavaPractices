package com.virtusa;
class MyThread2 extends Thread
{
	int total = 0;
	public void run()
	{
		System.out.println("wait method calling to you");
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello");
				total = total +100;
			}
			this.notify();
		}
		
	}
}
public class SynchronizedBlock
{

	public static void main(String[] args) throws InterruptedException 
	{
		MyThread2 m2 = new MyThread2();
		m2.start();
		synchronized(m2)
		{
			System.out.println("Main Thread Called");
			System.out.println("Itis try to called wait() method");
			m2.wait();
			System.out.println("after Notification get call ");
			System.out.println("Total = "+m2.total);
			
		}

	}

}
