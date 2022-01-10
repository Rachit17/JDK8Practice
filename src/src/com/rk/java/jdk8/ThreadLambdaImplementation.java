package src.com.rk.java.jdk8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLambdaImplementation {
	
	public static void main(String[] args) {
		System.out.println("Starting main thread "+Thread.currentThread().getName());
		
		Runnable runnable1 = ()->System.out.println("Starting new thread.."+Thread.currentThread().getName());
		Thread thread1 = new Thread(runnable1);
		System.out.println("Initiating thread...");
		
		
		try {
			thread1.start();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Runnable runnable2 = ()->System.out.println("Starting new thread2.."+Thread.currentThread().getName());
		Thread thread2 = new Thread(runnable2);
		System.out.println("Initiating thread2...");
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		service.submit(runnable2);
		
		
		try {
			thread2.start();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			thread2.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
