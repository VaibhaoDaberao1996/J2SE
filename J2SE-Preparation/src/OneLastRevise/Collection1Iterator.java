package OneLastRevise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Collection1Iterator {

	public static void main(String[] args) {
		
//		List<Integer> list1 = List.of(12,34,67,90,23,56,21,53,null); Throw null pointer Exception
		
		List<Integer> list1 = Arrays.asList(12,34,67,90,23,56,21,53,null);
		System.out.println(list1);
		
		
		
		Collections.reverse(list1);
		
		System.out.println(list1);
		
		
	
		ArrayList<String> lnklist = new ArrayList<String>();
		lnklist.add("vaibhao");
		lnklist.add("shubham");
		lnklist.add("rupesh");
		lnklist.add("harshal");
		lnklist.add(1, "akshay");
		lnklist.add("vaibhao");
		System.out.println(lnklist);
		
		ListIterator<String> itr = lnklist.listIterator();	
		Set<String> set = new LinkedHashSet<String>();
		List<String> list = new ArrayList<String>();
		
		for(int i=lnklist.size()-1;i>=0;i--) {
		  
			set.add(lnklist.get(i));
		}
		
		while(itr.hasNext()) {
			list.add(itr.next());
		}
		System.out.println(set);
		System.err.println(list);
	}

}
