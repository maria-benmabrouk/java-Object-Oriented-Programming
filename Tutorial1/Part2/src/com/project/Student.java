package com.project;

public class Student {
	private String firstName;
	private String lastName;
	private String studentId;
//	static int numberOfStudents=0;
	public Student(){
		
	}
	public Student(String firstName,String lastName,String studentId) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.studentId=studentId;
//		numberOfStudents++;
	}
	public void getStudentInfo() {
		System.out.println("-----------------------");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(studentId);
		System.out.println("-----------------------");
	}
	public String getId() {
		return studentId;
	}
	public String getInfoStu() {
		return firstName+" "+lastName+" "+studentId;
	}
	public String getName() {
		return firstName;
	}
}