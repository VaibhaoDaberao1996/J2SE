package Interface;

public interface UserService {
	
	public void createUser() ;
	
	public static void updateUSer() {
		System.out.println("user is updated ");
	}
	
	default void deleteUser() {
		System.out.println("user is deleted");
	}
	
}
