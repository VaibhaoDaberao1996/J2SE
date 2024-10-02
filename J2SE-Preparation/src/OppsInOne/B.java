package OppsInOne;

public class B extends A {

	public B(int num,String title){
		
		super.num = num;
		super.title=title;
	}
	
	@Override
	public String run() {
		return "B is running";
	}
}
