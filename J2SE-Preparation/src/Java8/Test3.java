package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		
		//WAP to print the number which are greater than 30
		List<Integer> list1 = Arrays.asList(12,12,45,36,89,11,23,23);
		
		List<Integer> result1 = list1.stream().filter(e->e>30).toList();
		System.out.println(result1);
		
		
		//WAP for print String whose lenght is greater than 5
		List<String> list2 = Arrays.asList("sam","john","william","casey","maverick","max");
		
		List<String> result2 = list2.stream().filter(e->e.length()>5).toList();
		System.out.println(result2);
		
		
		//WAP to print the name who starts with m
		List<String> result3 = list2.stream().filter(e->e.startsWith("m")).toList();
		System.out.println(result3);
		
		
		//WAP to get first char of each name
		List<Character> result4 = list2.stream().map(e->e.charAt(0)).toList();
		System.out.println(result4);
		
		
		//WAP to replace char a to z 
		List<String> result5 = list2.stream().map(e->e.replace('a', 'z')).toList();
		System.out.println(result5);
		
		//WAP to sort a integer list
		List<Integer> result6 = list1.stream().sorted().toList();
		System.out.println(result6);
		
	
		//WAP to sum of all even number
		int result7 = list1.stream().filter(e->e%2==0).mapToInt(Integer::valueOf).sum();
		System.out.println(result7);
		
		//WAP to find min and max integer in list
		Integer result8a = list1.stream().min((a,b)->Integer.compare(a,b)).get();
		System.out.println(result8a);
		
		Integer result8b = list1.stream().max((a,b)->Integer.compare(a,b)).get();
		System.out.println(result8b);
		
		
		//WAP to find second higesht
		Integer limit =list1.stream().sorted(Collections.reverseOrder()).toList().get(1);
		System.out.println(limit);
		
		//WAP to remove duplicated
		List<Integer> result9 = list1.stream().distinct().toList();
		System.out.println(result9);
	}
}
