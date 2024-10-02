package Threads;

public class DeadlockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res1= new Resource();
		Resource res2 = new Resource();

		Thread1 t1= new Thread1(res1, res2);
		t1.start();
		
		Thread2 t2 = new Thread2(res1, res2);
		t2.start();
	}

}
