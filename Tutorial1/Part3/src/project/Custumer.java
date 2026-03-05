package project;

public class Custumer {
	private int customerNumber; 
	private boolean discount;
	private int attendedNumber;
	private  Reservation reservationList[]=new Reservation[100];
	private int reservationNumber;
	private int ScreeningsReceiveNumber;
	
	public Custumer(int customerNumber,int attendedNumber) {
		this.customerNumber=customerNumber;
		this.attendedNumber=attendedNumber;
		//this.reservationNumber=reservationNumber;
		//reservationNumber=0;
	}
	public void addReservation(Reservation reservation) {
		reservationList[reservationNumber]=reservation;
		reservationNumber++;
	}
	public int getCustumerNumber() {
		return customerNumber;
	}
	public Reservation getReservation(int i) {
		return reservationList[i];
	}
	public int getScreeningsReceiveNumber() {
		ScreeningsReceiveNumber=0;
		for(int i=0;i<reservationNumber;i++) {
			if(reservationList[i].getStatus().equals("used")) {
				ScreeningsReceiveNumber++;
			}
		}
		return ScreeningsReceiveNumber;
	}
}
