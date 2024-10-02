package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("101", "deepak");
		hm.put("102", "amit");
		hm.put("103", "rahul");
		hm.put("104", "deepesh");
		hm.put("105", "priya");

		System.out.println(hm);

		
		  for(Map.Entry me:hm.entrySet()) {
		     System.out.println(me.getKey()+" : "+me.getValue()); }
		 
		  String s ="101";
		  
		  System.out.println(s.hashCode());
		  
		  System.out.println(48626%16);
		 
	}

}
