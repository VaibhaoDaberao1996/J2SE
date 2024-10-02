package Threads;

public class BookingTrainSeat {

	int total_seats=26;
	
	synchronized void book (int seats, String name) {
		
		if(total_seats>=seats) {
			System.out.println(name+" booked "+seats+" seats succesfully");
			total_seats=total_seats-seats;
			System.out.println("Total seats left : "+total_seats);
		} else {
			System.err.println(name+" Sorry!... seats not booked");
			System.out.println("Seats Left : "+total_seats);
		}
	}
}
