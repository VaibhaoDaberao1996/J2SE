package Strings;

public class StringUppercase {

	public static void main(String[] args) {
		
		String name = "grapic user interfaace";

		String new_name =name.toUpperCase().charAt(0)+name.substring(1);
		
		for(int i=0;i<new_name.length();i++) {
			if(new_name.charAt(i)==' ') {
			new_name =new_name.substring(0, i)+" "+ new_name.toUpperCase().charAt(i+1)+new_name.substring(i+2);
			}
		}
		
		System.out.println(new_name);
	}
}
