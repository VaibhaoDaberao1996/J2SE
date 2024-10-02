package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class StreamPractice3 {

	public static void main(String[] args) {
		
		EmployeeCollectionProgram empList = new EmployeeCollectionProgram();
		
		List<Integer> list1 =Arrays.asList(101,202,303,111,212,313,1,11,10);
		
		//get elements starts with 1
		List<Integer> list = list1.stream().filter(e -> String.valueOf(e).startsWith("1")).toList();;
		
		System.out.println(list);
		
		//get first and second highest element
		List<Integer> list2 = list1.stream().sorted(Collections.reverseOrder()).limit(2).toList();
		
		System.out.println(list2);
		
		
		//sort employee by salary in reversed order
		List<Employee> list3 = empList.getList().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
		System.out.println(list3);
		
		
		/*
		 * int firstMax = 0; int secondMax =0;
		 * 
		 * for(int i =0; i<list1.size();i++) { if (firstMax< list1.get(i)){
		 * 
		 * firstMax = list1.get(i); secondMax = firstMax;
		 * 
		 * } }
		 */
             
	}

}
