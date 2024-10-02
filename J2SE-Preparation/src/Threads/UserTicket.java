package Threads;

public class UserTicket extends Thread{

	BookingTrainSeat bts;
	int seats;
	
	public UserTicket(BookingTrainSeat bts, int seats) {
		
		this.bts = bts;
		this.seats = seats;
	}
	
	@Override
	public void run() {
		bts.book(seats, getName());
	}
	 
}
