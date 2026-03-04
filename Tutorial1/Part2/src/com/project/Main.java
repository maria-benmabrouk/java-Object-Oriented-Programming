package com.project;


public class Main {
public static void main(String[] args) {
// Create an attendance service object
AttendanceService service = new AttendanceService();
AttendanceReporter reporter = new AttendanceReporter(); // New class for reporting
// Create a training
Training training = new Training("Or11", "Oracle");
service.addTraining(training);
// Create students
Student s1 = new Student("Ali", "Ahmed", "S001");
Student s2 = new Student("Sara", "Belaid", "S002");
Student s3 = new Student("Omar", "Kacem", "S003");
training.addStudent(s1);
training.addStudent(s2);
training.addStudent(s3);
Workshop w1 = new Workshop("16/02/2025", "14:30"); 
Workshop w2 = new Workshop("17/02/2025", "10:00");
Workshop w3 = new Workshop("19/02/2025", "16:00");
Workshop w4 = new Workshop("25/02/2025", "10:00");
training.addWorkshop(w1);
training.addWorkshop(w2);
training.addWorkshop(w3);
training.addWorkshop(w4);
Student[] absenteesW1 = {s1, s2};
Student[] absenteesW2 = {s3};
Student[] absenteesW3 = {s1};
//The service records the workshop absentees and updates its status
service.recordAbsences(w1, absenteesW1);
service.recordAbsences(w2, absenteesW2);
service.recordAbsences(w3, absenteesW3);
// Display the asked information
service.displayEnrolledStudents();
service.displayWorkshops(training);
service.displayWorkshops(training,"conducted");
service.displayAbsentees(w1);
service.displayStudentWasAbsentInEachWorkshop();
service.displayWorkshopsEachStudentWasAbsent();
System.out.println(training.display_Workshops());
//Q2: displaying details about a student’s absences
System.out.println(service.displayStudentAbsencesDetails(s1));
//4. Reporting: Format via reporter, display via Main
System.out.println(reporter.formatEnrolledStudents(service));
System.out.println(reporter.formatWorkshops(training));
System.out.println(reporter.formatWorkshops(training,"conducted"));
System.out.println(reporter.formatAbsentees(w1));
System.out.println(reporter.formatStudentAbsenceDetails(s1, training));
}
}