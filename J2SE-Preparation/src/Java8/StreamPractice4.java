package Java8;

import java.util.HashMap;
import java.util.Map;

class User{
	String name;

	public User(String name) {
		super();
		this.name = name;
	}
	
}

public class StreamPractice4 {

	/**
	 * This show that how hashmap is overide 
	 * a first index value over the last
	 * index 
	 * Cause -Due to same key and equal method
	 * 
	 * 
	 */
	
	static {
		System.out.println("The program is ready to run");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 =new User("Vaibhao");
		User user2 =new User("Vaibhao");
		User user3 =new User("Vaibhao");
		
		Map<User,String> emp = new HashMap<User, String>();
		emp.put(user1, "vaibhao");
		emp.put(user2, "vishal");
		emp.put(user3, "mahendra");
		
		for(Map.Entry<User,String> entry :emp.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	
	}

}
