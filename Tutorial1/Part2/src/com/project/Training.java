package com.project;

public class Training {
	private String code;
	private String traningName;
	static int trainingNumber=0;
//	private int trainingNumber1=0;
	private Student studentList[]=new Student[30];
	private Workshop workshopList[]=new Workshop[10];
	private int numberOfStudents=0;
	private int workshopCount=0;
	
	public Training() {
		
	}	
	public Training(String code,String traningName) {
		this.code=code;
		this.traningName=traningName;
		trainingNumber++;
	}
	public void addStudent(Student student) {
		studentList[numberOfStudents]=student;
		numberOfStudents++;
	}
	public void addWorkshop(Workshop workshop) {
		workshopList[workshopCount]=workshop;
		workshopCount++;
	}	
	public int getStudentNumber() {
		return numberOfStudents;
	}
	public Student getStudent(int i) {
		return studentList[i];
	}
	public Workshop getWorkshop(int i) {
		return workshopList[i];
	}
	public int getWorkshopNumber() {
		return workshopCount;
	}
	public int getTrainingNumber() {
		return trainingNumber;
	}
	public String getTrainingName() {
		return traningName;
	}
	public String getTrainingCode() {
		return code;
	}
	public String display_Workshops() {
		if (workshopCount == 0) return "No workshops for " + traningName;
		StringBuilder result = new StringBuilder("Workshops for the training " +
		this.traningName + " : \n");
		for (int i = 0; i < workshopCount; i++) {
		result.append("- ").append(workshopList[i].display()).append("\n");
		}
		return result.toString();
	}
}