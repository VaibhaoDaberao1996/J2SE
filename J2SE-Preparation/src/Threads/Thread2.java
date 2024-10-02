package Threads;

public class Thread2 extends Thread {

	Resource res1, res2;

	public Thread2(Resource res1, Resource res2) {
		
		this.res1 = res1;
		this.res2 = res2;
	}
	
	@Override
	public void run() {
		
		synchronized (res2) {
			System.out.println("Thread 2 is in res2");
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
				System.out.println(e);
			}
		}
		synchronized (res1) {
			System.out.println("Thread 2 is in res1");
		}
	}
}
