package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractise1 {

	public static void main(String[] args) {
		
		EmployeeCollectionProgram ecp = new EmployeeCollectionProgram();
		
		//replace v by w
		List<String> list1 = Arrays.asList("vaibhao","vishal","vinay");
		
		List<String> result1 = list1.stream().map(i->i.replace('v','w')).toList();
		
		System.out.println(result1);
		
		//get employee by deactivate and group by status
		Map<String, List<Employee>> result2 = ecp.getList().stream().filter(i->i.getStatus()=="deactive").collect(Collectors.groupingBy(e->e.getStatus()));
		
		System.out.println(result2);
		
		
	}

}
