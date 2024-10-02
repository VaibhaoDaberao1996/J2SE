package Strings;

import java.util.jar.Attributes.Name;

public class ReverseString {

	public static void main(String[] args) {
		
		String name="My name is gabimaru the hollow";

//		Apporach 1
		/*
		 * String reverse="";
		 * 
		 * char[] charArray = name.toCharArray();
		 * 
		 * for(int i =charArray.length-1;i>=0;i--) {
		 * 
		 * reverse = reverse +charArray[i]; }
		 * 
		 * System.out.println(reverse);
		 */
	//}
	
//		Apporach 2
		
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println("");
		
		
//		Apporach 3
		StringBuffer stb= new StringBuffer(name);
		StringBuffer reverse = stb.reverse();
		System.out.println(reverse);
	}
}
