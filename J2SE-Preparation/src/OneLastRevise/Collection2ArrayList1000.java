package OneLastRevise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Collection2ArrayList1000 {

	public static void main(String[] args) {
		
		List<Integer> list1000 = new ArrayList<Integer>();
		Random randomNum = new Random();
		
		for(int i=0;i<=1000;i++) {
			list1000.add(randomNum.nextInt(1000));
		}
		
		//start
		long startTime = System.nanoTime();
		
		list1000.stream().sorted();
		
		Collections.sort(list1000);
		
		//end
		long endTime = System.nanoTime();
		
		//Converting to the nano sec to milli sec
		long timeDuration =(endTime - startTime)/1_000_000;
		System.out.println(timeDuration);
	}

}
