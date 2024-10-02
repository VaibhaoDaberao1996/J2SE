package OneLastRevise;

public class WAP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5436;
		
		//count the number
		System.out.println(String.valueOf(number).length());
		
		//reverse a number
		StringBuilder stringNumber = new StringBuilder(String.valueOf(number));
		stringNumber.reverse();
		
		int reverseNum =Integer.parseInt(stringNumber.toString()); 
		System.out.println(reverseNum);
		

}
}