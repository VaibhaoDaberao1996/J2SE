package OppsInOne;

public class Child extends Parent {
	
	private static Child child;
	
	private Child(){
		
	}
	
	public static Child getChild() {
		if(child==null) {
		 child = new Child();
		}
		return child;
	}

	public int sum() {
		
		
		int sum=1;
		
		return ++sum;
	}
	
	public String line() {
		return "this is a second object";
	}
}
