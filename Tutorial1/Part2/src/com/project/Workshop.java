package com.project;

public class Workshop {
	private String date;
	private String time;
	private String state="planned";
	private Student absentees[]=new Student[30];
	private int numberOfAbsentees=0;
	
	public Workshop(String date,String time) {
		this.date=date;
		this.time=time;		
	}
	public void setState(String str) {
		state=str;
	}
	public void addAbsente(Student student) {
		absentees[numberOfAbsentees]=student;
		numberOfAbsentees++;
	}
	public void getWorkshopInfo() {
		System.out.println("-----------------------");
		System.out.println(date);
		System.out.println(time);
		System.out.println(state);
		System.out.println("-----------------------");
	}
	public String getState() {
		return state;
	}
	public Student getAbsente(int i) {
		return absentees[i];
	}
	public int getNumberOfAbsentees() {
		return numberOfAbsentees;
	}
	public void getAbsenteInfo(int i) {
		absentees[i].getStudentInfo();
	} 
	public String getIdAbsent(int index) {
		return absentees[index].getId();
	}
	public String display() {
		return " "+date+" "+time+" ";
	}
}