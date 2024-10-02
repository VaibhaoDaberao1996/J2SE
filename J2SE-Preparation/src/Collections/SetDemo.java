package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
	
		HashSet hs= new HashSet();
		
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs.add("ddd");
		hs.add("eee");
		hs.add("aaa");
		
		System.out.println(hs);
		
		
		int[] a = {11,22,33,44,55,66,77,11,44,22,88};
		
		List<int[]> li= Arrays.asList(a);
			
		Set st= new HashSet(li);
		
		System.out.println(st);
	}
	
}
