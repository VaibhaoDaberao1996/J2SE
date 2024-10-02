package OneLastRevise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collection3WAPList {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(3,67,898,12,54,32,789,345,355,456,456,3,67);
		
		//start
				long startTime = System.nanoTime();
		
		//List<Integer> desc = //nums.stream().sorted((a,b)->Integer.compare(b,a)).toList();
							// nums.stream().sorted(Comparator.reverseOrder()).toList();
		
		//List<Integer> unique = nums.stream().distinct().toList();
		
		//Map<Integer, Long> occurence =nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		List<String> whoContains5 = nums.stream().map(e->String.valueOf(e)).filter(e->e.contains("5")).toList();
									
		List<Integer> list = nums.stream().filter(e->String.valueOf(e).contains("5")).toList();
		//end
	    long endTime = System.nanoTime();
		
		//Converting to the nano sec to milli sec
		long timeDuration =(endTime - startTime)/1_000_000;
		System.out.println(timeDuration);
		
		System.out.println(whoContains5);
		
	 //--------------------------------------------------------------------------------------------------
		
		
		List<String> names = Arrays.asList("vaibhao","vishal","shubham","sanjana","vaishanavi","vishal","shubham","harshal")
							.stream().distinct().map(name->name.substring(0, 1).toUpperCase()+name.substring(1)).sorted().toList();
		System.out.println(names);

		List<Integer> nums2 = Arrays.asList(12,43,55,78,32,1234,56,345);
		
		Set<Integer> sortNums2 = new TreeSet<Integer>(nums2);
		
		System.out.println(sortNums2);

	}

}
