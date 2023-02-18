package com.virtusa;
class Display
{
	public synchronized void wish(String str)
	{
		for(int i=0;i<4;i++)
		{

			System.out.println("Good Morning "+str);
			
			try {

				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
class MySync extends Thread
{
	Display d;
	String name;
	MySync(Display d,String name)
	{
		this.d =d;
		this.name = name;
	}
	
	public void run()
	{
		d.wish(name);
	}
}
public class Synchronization {

	public static void main(String[] args) 
	{
		Display d = new Display();
		MySync m =  new MySync(d,"Shamdal");
		MySync m1 = new MySync(d,"Kushal");
		
		m.start();
		m1.start();

	}

}
