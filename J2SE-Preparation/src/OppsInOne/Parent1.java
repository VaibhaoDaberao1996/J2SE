package OppsInOne;

public class Parent1 {

	public String message()throws NullPointerException{
		try {
			/* throw new NullPointerException(); */
		}catch(ArrayIndexOutOfBoundsException a){
			a.getMessage();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			/* System.out.println("finally block works"); */ 
		}
		return "Exception";
	}
	
	
}
