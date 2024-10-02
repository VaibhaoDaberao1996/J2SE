package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hs = new HashMap();
		
		hs.put(1,"Cody");
		hs.put(2,"Rohdes");
		hs.put(3,"Roman");
		hs.put(4,"Seth");
		
		Set set = hs.entrySet();
		
		Iterator itr = set.iterator();
		
		HashMap hm = new HashMap ();
		
		while(itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			
			if(entry.getKey().equals(2)) {
				System.out.println(entry.setValue("Rock"));
				hm.put(entry.getKey(), entry.getValue());
			} else {
				
				hm.put(entry.getKey(), entry.getValue());
			}
			
		}
		System.out.println(hm);
		
		String a = "nitin";
		String b = "natlie";
		
		String a1=new String("nitin");
		
		String b1=new String("john");
		
		System.out.println(a==b);
		System.out.println(a1==b1);
		System.out.println(a1.equals(b1));

		
	}

}
