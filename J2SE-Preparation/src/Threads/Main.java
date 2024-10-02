package Threads;

public class Main {

	public static void main(String[] args) {
		
//		A a = new A();
//		a.start();
//		
//		B b =new B();
//		b.start();
		
		System.out.println("3 :"+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		
//		Runnable ra= new RunA();
		RunA ra = new RunA();
		RunB rb = new RunB();
		
		Thread t1 = new Thread(ra);
		Thread t2 = new Thread(rb);
		
		t1.start();
		t2.start();
		
	}

}
