package Threads;

public class RunA implements Runnable{

	@Override
	public void run() {
		System.out.println("I am in RunA Thread");
		System.out.println("1 :"+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		
	}

}
