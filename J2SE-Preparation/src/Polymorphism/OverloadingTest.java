package Polymorphism;

public class OverloadingTest {
	
	//diffrent return type overloading
	public int sum(int a , int b) {
		return a+b;
	}
	
	public double sum(double a,double b) {
		return a+b;
	}

	public static void main(String[] args) {
		int a =32;
		int b =33;
		
		double c =5.3;
		double d =6.3;
		
		OverloadingTest test = new OverloadingTest();
		
		int sumInt = test.sum(a, b);
		System.out.println(sumInt);
		
		double sumDoub = test.sum(c,d );
		System.out.println(sumDoub);
		
	}

}
