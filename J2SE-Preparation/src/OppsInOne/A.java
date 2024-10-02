package OppsInOne;

public class A {

	int num;
	String title;
	
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}


	public A(int num,String title) {
		
		this.num = num;
		this.title = title;
	}
	
	public String run() {
		return "A is running";
	}


	@Override
	public String toString() {
		return "A [num=" + num + ", title=" + title + "]";
	}
	
	
}
