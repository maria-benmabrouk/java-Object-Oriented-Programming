package project;

public class Room {
	private int idNumber;
	private int seatingCapacity;
	private Screening screeningsList[]=new Screening[100]; 
	private int screeningNumber;
	
	public Room() {
		
	}
	public Room(int idNumber,int seatingCapacity) {
		this.idNumber=idNumber;
		this.seatingCapacity=seatingCapacity;
		this.screeningNumber=0;
	}
	public void DisplayScheduledScreeningsRoomList() {
		System.out.println("------------------------------");
		System.out.println("Room Information : ");
		System.out.println("  id number : "+idNumber);
		System.out.println("  seating capacity : "+seatingCapacity);
		System.out.println("     Screening list : ");
		for(int i=0;i<screeningNumber;i++) {
			screeningsList[i].displayScreeningInformation();
		}
		System.out.println("------------------------------");
	}
	public void addScreening(Screening screening) {
		screeningsList[screeningNumber]=screening;
		screeningNumber++;
	}
	public int getIdNumber() {
		return seatingCapacity;
	}
	public void decreaseSeatingCapacity() {
		seatingCapacity--;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
}
