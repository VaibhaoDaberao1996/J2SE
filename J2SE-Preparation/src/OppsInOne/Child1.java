package OppsInOne;

public class Child1 extends Parent1 implements Interface1{

	// Method from Interface 1
	// Below method is implemented
	@Override
	public void sound() {
		System.out.println("I am shouting");
	}

	//below method is override 
	@Override
	public void sleep() { // TODO Auto-generated method stub
		Interface1.super.sleep();
	}
	
	@Override
	public void dispaly() {
	
		System.out.println("I am in dispaly");
	
	}
	
	//---------------------------------------------------------------------//
	
	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "Im in child";
	}


}
