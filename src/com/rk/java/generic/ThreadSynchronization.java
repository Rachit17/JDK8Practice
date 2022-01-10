package com.rk.java.generic;

public class ThreadSynchronization implements Runnable {
	
	public static void main(String[] args) {
		ThreadSynchronization ts = new ThreadSynchronization();
		ThreadSynchronization ts1 = new ThreadSynchronization();
		Thread t2 =new Thread(ts, "thread2");
		 t2.start();
		Thread t1 =new Thread(ts, "thread1");
		 t1.start();
		 Thread t3 =new Thread(ts1, "thread3");
		 t3.start();
		 
		
	}
	

	@Override
	public synchronized void run() {
		System.out.println("Hello synchronization..."+Thread.currentThread().getName());
		try {
			Thread.sleep(2000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
