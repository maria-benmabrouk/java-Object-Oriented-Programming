package project;

public class Cinema { 
	private String name;
	private String address;
	private Room roomsList[]=new Room[20];
	private Custumer customersList[]=new Custumer[100];
	private int roomNumber;
	private int custumerNumber;
	public Cinema(String name,String address) {
		this.name=name;
		this.address=address;
		
	}
	public void AddCustomer(Custumer custumer) {
		customersList[custumerNumber]=custumer;
		custumerNumber++;
	}
    public void AddRoom(Room room) {
    	roomsList[roomNumber]=room;
    	roomNumber++;
	}	
    public boolean checkCustomerNumberExists(int costomerNum) {
    	for(int i=0;i<custumerNumber;i++) {
    		if(customersList[i].getCustumerNumber()==costomerNum) {
    			return true;
    		}
    	}
    	return false;
    }
}
