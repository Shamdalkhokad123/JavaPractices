package com.virtusa;
class Sleep extends Thread
{
	public void run()
	{
		for(int i=0;i<8;i++)
		{
			
			System.out.println("Child Thread"+i);
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class SleepDemo {

	public static void main(String[] args) throws InterruptedException
	{
		Sleep s = new Sleep();
		s.start();
		s.join();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread "+i);
		}

	}

}
