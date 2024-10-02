package Strings;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		
		String str= "v@ai$bh%a@o";
		
		String plainString = str.replaceAll("[^a-zA-Z0-9]", "");
	    System.out.println(plainString);
	
        String str2 = " W e sh a ll o ur c om  e ";
		
		String spaceRemove = str2.replaceAll("\\s", "");
		System.out.println(spaceRemove);

	
	}
	
	
}
