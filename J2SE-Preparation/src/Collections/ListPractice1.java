package Collections;

import java.util.Stack;

public class ListPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> list = new Stack<String>();
		
		list.push("aaa");
		list.push("bbb");
		list.push("ccc");
		list.push("ddd");
		
		System.out.println(list);
		
		System.out.println(list.peek());
		
		System.out.println(list.pop());
		
		System.out.println(list);
		
		System.out.println(list.peek());
	}

}
