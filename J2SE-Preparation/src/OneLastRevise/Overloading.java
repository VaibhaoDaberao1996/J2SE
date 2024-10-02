package OneLastRevise;

public class Overloading {

	/**
	 *Method having 
	 *same name 
	 *same class
	 *Diff param
	 */
	public int add(int a,int b) {
		return a + b;
	}

	public double add(double a,double b) {
		String num =String.valueOf(a+b);
		return Double.parseDouble(num);
	}
	
	public int sub(int a ,int b) {
		return a - b;
	}
	
	public void multiply(int a,int b) {
		int c =a - b;
	}
	
	public void multiply(int a,int b ,int c) {
		int d= a-b-c;
	}
	
}
