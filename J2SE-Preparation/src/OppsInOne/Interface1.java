package OppsInOne;

public interface Interface1 {


	public void sound();
	
	public void dispaly() throws Exception;
	
	public static void walk() {
		System.out.println("I am walking");
	}
	
	default void sleep() {
		System.out.println("I am sleeping in interface");
	}
}
