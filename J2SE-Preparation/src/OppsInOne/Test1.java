package OppsInOne;

public abstract class Test1 implements Action {
 
	@Override
	public void walk() {
		
		System.out.println("Am walking");
		
	}
	
	@Override
	public void run() {
		System.out.println("i am running");		
	}
}
