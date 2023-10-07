package com.virtusa;
class MailThread extends Thread
{
	public void run()
	{
		System.out.println("Child Thread");
	}
}
public class ThreadRelatedMethod {

	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isDaemon());
		
		MailThread mt = new MailThread();
		mt.start();
		mt.setPriority(7);
		for(int i=0;i<4;i++)
		{
			System.out.println("Main Thread");
		}
		System.out.println("name: "+mt.getName());
		mt.setName("Shamdal");
		
		System.out.println(mt.getName());
		System.out.println("Latest Priority : "+mt.getPriority());

	}

}
