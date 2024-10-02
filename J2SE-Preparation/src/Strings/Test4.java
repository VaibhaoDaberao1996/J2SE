package Strings;

import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		
		String word ="Banana";
		
		String result = 
			word
				.chars()
				.mapToObj(c->(char)c)
				.map(e->{
					if(Character.isUpperCase(e)) {
						return Character.toLowerCase(e);
					}else {									
						return Character.toUpperCase(e);
					}
				})//converting the object return the value(object)
				.map(String::valueOf)  //collecting the object and converting to string
				.distinct()
				.collect(Collectors.joining());
		
		System.out.println(result);
	}

}
