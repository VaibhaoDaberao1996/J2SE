package Strings;

import java.util.Arrays;

public class AnagramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="pqrs";
		String str2="rsqp";
		
		char[] s1=str1.toCharArray();
		char[] s2=str2.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		if(Arrays.equals(s1, s2)) {
			System.out.println("This two string are anagram");
		}else {
			System.out.println("This two string are not anagram");
		}
		
	System.out.println(str2.substring(0,2)+str2.toUpperCase().charAt(2)+str2.substring(3));	
	}

}
