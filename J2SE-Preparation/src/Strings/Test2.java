package Strings;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="vaibhao";
		
		String b="vishal";
		
		String d ="vishal";
		
		String c="     my name is saturo gojo";
		
		String e = new String("mahi");
		
		String f = new String("mahi");
		
		String[] emails = {"vaibhao@gmail.com","vishal@gmail.com","shubham"};
		
		System.out.println(a.length());
		System.out.println(a.charAt(0));
		System.out.println(a.concat(b));
		System.out.println(a+b);
		System.out.println(c.trim());
		System.out.println(b.equals(d));
		System.out.println(b==d);
		System.out.println(e.equals(f));
		System.out.println(e==f);
		
		


		for(int i=0;i<emails.length;i++) {
			if(emails[i].contains("@gmail.com")) {
				System.out.print(emails[i]+"| ");
			}
		}


	}

}
