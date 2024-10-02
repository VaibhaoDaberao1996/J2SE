package Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		String a ="hello";
		String b ="java";
		
		System.out.println(a.length()+b.length());
		
		System.out.println(a.compareTo(b)>0?"yes":"no");
	
		System.out.println(a.toUpperCase().charAt(0)+a.substring(1)+" "+
						   b.toUpperCase().charAt(0)+b.substring(1));
		
		
		
		List<String> list = Arrays.asList("A","BB","AAAAA","BBB","AAA","BBBB");
		
		List<String> list2 = list.stream().sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).toList();
		
		System.out.println(list2);
		
		
	}

}
