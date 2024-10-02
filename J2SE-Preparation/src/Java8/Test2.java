package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {

	/**
	 * Largest Anangram group
	 */
	public static void main(String[] args) {
		
		String words = "tan nat ant tea ate ntee neet teen eten";
		
		String[] wordArray = words.split(" ");
		
		Map<String,List<String>> anagramGroup = new HashMap<String,List<String>>();
		
		for(String word : wordArray) {
			
			char[] chars = word.toCharArray();
			
			Arrays.sort(chars);
			
			String sortedWord = new String(chars);
			
				if(!anagramGroup.containsKey(sortedWord)){
					anagramGroup.put(sortedWord, new ArrayList<String>());
				}else {
					anagramGroup.get(sortedWord).add(word);
				}
		}
		System.out.println(anagramGroup);
	
		List<String> largestGroup = new ArrayList<>();
        for (List<String> group : anagramGroup.values()) {
            if (group.size() > largestGroup.size()) {
                largestGroup = group;
            }
        }
        System.out.println(largestGroup);
	}
}