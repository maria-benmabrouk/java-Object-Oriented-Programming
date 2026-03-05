package project;

public class Screening {
	private int idNumber ;
	private String date;
	private String startTime;
	private String endTime;
	private double ticketPrice;
//	private int ticketPriceWithDiscount;
	private Movie movie=new Movie();
	private Room room=new Room();
	
    public Screening(int idNumber,String date,String startTime,String endTime,double ticketPrice,Movie movie,Room room) {
    	this.idNumber=idNumber;
    	this.date=date;
    	this.startTime=startTime;
    	this.endTime=endTime;
    	this.ticketPrice=ticketPrice;
    	this.movie=movie;
    	this.room=room;
    }
    public int getIdNumber() {
    	return idNumber;
    }
    public void displayScreeningInformation() {
    	System.out.println("------------------------------");
		System.out.println("Screening Information : ");
		System.out.println(" id number : "+idNumber);
		System.out.println(" date : "+date);
		System.out.println(" start time : "+startTime);
		System.out.println(" end time : "+endTime);
		System.out.println(" ticket price : "+ticketPrice);
		System.out.println(" Movie Information : ");
		movie.displayMovieInformation();
		System.out.println("------------------------------");
    }
    public boolean seatsAvailable() {
    	if(room.getSeatingCapacity()>0) {
    		return true;
    	}
    	return false;
    }
    public void reserveSeat() {
		room.decreaseSeatingCapacity();
	}
    public double getTicketPrice(int costumerScreeningsReceiveNumber) {
    	if(costumerScreeningsReceiveNumber<25) {
    		return ticketPrice;
    	}
    	return (0.95*ticketPrice);
    }

}
