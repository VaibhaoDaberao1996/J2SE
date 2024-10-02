package Threads;

public class RunB implements Runnable{

	@Override
	public void run() {

		System.out.println("I am in RunB Thread");
		System.out.println("2 :"+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
	}

	
}
