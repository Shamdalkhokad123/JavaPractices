package org.virtusa;

public class MyThread implements Runnable {

	@Override
	public void run() {
		Singleton son = Singleton.getInstance();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(son.hashCode());

	}

}
