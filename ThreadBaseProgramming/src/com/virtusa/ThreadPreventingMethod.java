package com.virtusa;
class Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			
			System.out.println("Child Thread "+i);
			//Thread.yield();
		}
	}
}
public class ThreadPreventingMethod 
{

	public static void main(String[] args) 
	{
		Demo d = new Demo();
		d.setPriority(7);
		d.start();
		Thread.yield();
		for(int i=0;i<4;i++)
		{
			System.out.println("Main Thread "+i);
		}

	}

}
