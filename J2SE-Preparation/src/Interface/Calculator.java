package Interface;

class Calculate{

	public int multiply(int...numbers) {
		int mul=1;
		for(int number : numbers) {
			mul *= number;
		}
		if(numbers.length==0) {
			return 0;
		}
		return mul;
	}
	
	public int sum(int...numbers) {
		int sum =0;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
		
	}
	
	public int sub(int...numbers) {
		int sub= numbers[0];
		for(int number = 1;number<numbers.length;number++) {
			sub -= numbers[number];
		}
		return sub;
	}
}
public class Calculator {

	public static void main(String[] args) {
		
		Calculate cal = new Calculate();
		
		System.out.println(cal.multiply());
		
		System.out.println(cal.sum());
		
		System.out.println(cal.sub(1,2));
	}

}
