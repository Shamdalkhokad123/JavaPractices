package org.virtusa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafe {

	public static void main(String[] args) 
	{
		
		MyThread thread = new MyThread();
		ExecutorService executor = Executors.newFixedThreadPool(3);
		try {
			executor.execute(thread);
			executor.execute(thread);
			executor.execute(thread);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(executor !=null)
			{
				executor.shutdown();
			}
			
		}

	}

}
