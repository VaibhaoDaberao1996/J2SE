package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeCollectionProgram {
	
	public List<Employee> getList(){
		
	List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1,"vaibhao","male",28,29000.9,"Devolopement","active"));
		empList.add(new Employee(2,"vishal","male",29,29000.9,"Testing","deactive"));
		empList.add(new Employee(3,"shubham","male",30,29000.9,"Chemical","active"));
		empList.add(new Employee(4,"vinay","male",30,29000.9,"Civil","active"));
		empList.add(new Employee(5,"ankit","male",30,29000.9,"Devolopement","deactive"));
		empList.add(new Employee(6,"sunny","male",30,80000.9,"Devolopement","active"));
		empList.add(new Employee(7,"sanjana","female",22,90000.9,"Devolopement","active"));
		empList.add(new Employee(8,"vaishnavi","female",22,40000.9,"Devolopement","deactive"));
		empList.add(new Employee(9,"samiksha","female",20,50000.9,"Devolopement","active"));
		empList.add(new Employee(10,"sakshi","female",22,89000.9,"Devolopement","deactive"));
		empList.add(new Employee(11,"revti","female",22,69000.9,"Devolopement","active"));
		empList.add(new Employee(12,"simran","female",21,49000.9,"Devolopement","deactive"));
		empList.add(new Employee(13,"rupesh","male",31,39000.9,"Devolopement","active"));

		return empList;
	}

	public static void main(String[] args) {
		
		EmployeeCollectionProgram ecp = new EmployeeCollectionProgram();
		
		
		//maxSalary Employee
		  Employee empMax = ecp.getList().stream().max((o1,o2) ->
		  Double.compare(o1.getSalary() ,o2.getSalary())).get();
		  System.out.println(empMax);
		  
		  //group employee by department
		  Map<String, List<Employee>> collect =ecp.getList().
				  		stream().collect(Collectors.groupingBy(e -> e.getDepartment_name()));
		  System.out.println(collect);
		 
		  //maxSalary Civil
		  Employee maxSalaryCivil = collect.get("Civil").stream().max((o1,o2) ->
		  Double.compare(o1.getSalary(), o2.getSalary())).get();
		  System.out.println(maxSalaryCivil);
		 
		  
		
			/*
			 * List<Integer> array = Arrays.asList(23,56,75,89,76,3,56,22,15,78);
			 * 
			 * List<Integer> resultlist =
			 * array.stream().sorted(Comparator.reverseOrder()).toList();
			 * 
			 * List<Integer> result2 = array.stream().sorted().filter(i->i%2==0).toList();
			 * 
			 * int sumEven = result2.stream().mapToInt(Integer::intValue).sum();
			 * System.out.println(sumEven);
			 */
		  
		  
	}

}
