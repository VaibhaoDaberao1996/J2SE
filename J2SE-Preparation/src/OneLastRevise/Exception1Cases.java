package OneLastRevise;

public class Exception1Cases {
	
	static {
		try {
		throw new ClassCastException();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		int a = 10;
		try {
			int b = a/0;
			System.out.println(b);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//we can throw a exception in finally block but not a good practisce
			System.out.println("Exception is occurs");
			throw new NullPointerException();
			
		}
	}

}
