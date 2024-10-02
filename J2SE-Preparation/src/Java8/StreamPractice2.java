package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice2 {

	public static void main(String[] args) {
		 
		String name ="vaibhav wanare";
	
		//char occurs in string by java 8
	Map<Object, Long> result = name.chars().filter(e-> e != (char)' ').mapToObj(e-> (char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(result);
	
	result.entrySet()
	.forEach(e ->
	{ if(e.getValue()>1) {
		System.out.println(e.getKey()+":"+e.getValue());
	}
	});
	
	name.chars().mapToObj(i->(char)i).forEach(e->{System.out.println(e);});
		
	}
	

}
