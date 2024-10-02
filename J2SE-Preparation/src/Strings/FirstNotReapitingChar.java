package Strings;

public class FirstNotReapitingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="akafmkdf";
		
		for(int i=0;i<str.length();i++) {
			int count = 0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)!=str.charAt(j)) {
					continue;
				}else {
					count++;
				}
			}
			if(count==1) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}

}
