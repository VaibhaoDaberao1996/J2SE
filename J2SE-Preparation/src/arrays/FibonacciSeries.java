package arrays;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Fibonacci Series below upto 10");
		
		int firstNum =0;
		
		int secondNum =1;
		
		System.out.print(firstNum);
		
		for(int i =1;i<=10;i++) {
			
			int nextNum = firstNum + secondNum;
		
			System.out.print(" "+nextNum);
			
			secondNum = firstNum;
			firstNum = nextNum;
			
			
		}
	}

}
