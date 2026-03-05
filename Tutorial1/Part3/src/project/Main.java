package project;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int reservationNumber1=0;
		Cinema cenema1=new Cinema("hjhsjk","jsshd");
		Movie movie1=new Movie("vvhjn",2020,"hbbhj","dfghjk","hjklksxqx");
		movie1.addActor("dxcfvgbh");
		movie1.displayMovieInformation();
		Room room1=new Room(2,50);
		room1.DisplayScheduledScreeningsRoomList();
		cenema1.AddRoom(room1);
		Screening screening1=new Screening(50,"fghjjjn","aaaaaa","qqqqqq",100,movie1,room1);
		screening1.displayScreeningInformation();
		room1.addScreening(screening1);
	//	Room room2=new Room(4,100);
		Custumer custumer1=new Custumer(4,2);
		cenema1.AddCustomer(custumer1);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your customer number");
		int customerNumber=input.nextInt();
		System.out.println("Enter the screening number ");
		int screeningNumber=input.nextInt();
		if(cenema1.checkCustomerNumberExists(customerNumber)) {
			System.out.println(" customer number exists in the list of customers");
			if(screening1.seatsAvailable()) {
				System.out.println("and seats are available ");
				//
				Reservation reservation1=new Reservation(screeningNumber);
				custumer1.addReservation(reservation1);
				reservationNumber1++;
				screening1.reserveSeat();
				custumer1.getReservation((reservationNumber1)).setStatus("used");
				System.out.println("the price is : "+screening1.getTicketPrice(custumer1.getScreeningsReceiveNumber()));
				//
			}else {
				System.out.println("but seats are not available ");
			}
		}else {
			System.out.println(" customer number not exists in the list of customers");
		}
		
	}
}
