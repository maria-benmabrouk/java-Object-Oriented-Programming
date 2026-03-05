package project;

public class Reservation {
	private String statue;
	private int screeningNumber;
//	private int ReservationNumber;
	public Reservation() {
		
	}
	public Reservation(int screeningNumber) {
		this.screeningNumber=screeningNumber;
	}
	public void setScreeningNumber(int screeningNumber) {
		this.screeningNumber=screeningNumber;
	}
	public void setStatus(String statue) {
		this.statue=statue;
	}
	public String getStatus() {
		return statue;
	}
	public int getScreeningNumber() {
		return screeningNumber;
	}
}
