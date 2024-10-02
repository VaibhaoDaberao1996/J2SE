package Threads;

public class BookingMain {

	public static void main(String[] args) {

		BookingTrainSeat bts= new BookingTrainSeat();
		
		UserTicket ut1= new UserTicket(bts, 2);
		ut1.setName("Vaibhao");
		ut1.start();
		
		UserTicket ut2= new UserTicket(bts, 6);
		ut2.setName("Vishal");
		ut2.start();
		
		UserTicket ut3= new UserTicket(bts, 5);
		ut3.setName("Shubham");
		ut3.start();
	}

}
