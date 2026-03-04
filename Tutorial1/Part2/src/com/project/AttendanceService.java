package com.project;


public class AttendanceService {
	private Training trainingList[]=new Training[10];
	private int trainingNumber=0;
	private int number;
	private int number1;
	private int number2;
	private int number3;
	private int number4;
	private int number5;
	//private Training findTrainingNumber=new Training();
	
	public AttendanceService() {
	}
	public void addTraining(Training training) {
		trainingList[trainingNumber]=training;
		trainingNumber++;
	}
	public int getTrainingNumber() {
		return trainingNumber;
	}
	public Training getTraining(int i) {
		return trainingList[i];
	}
	public void recordAbsences(Workshop workshop,Student[] absenteesW) {
		workshop.setState("conducted");
		for(int i=0;i<absenteesW.length;i++) {
			workshop.addAbsente(absenteesW[i]);
		}
	}
	public void displayEnrolledStudents() {
		for(int i=0;i<trainingNumber;i++) {
			number=trainingList[i].getStudentNumber();
			for(int j=0;j<number;j++) {
				Student stu;
				stu=trainingList[i].getStudent(j);
				stu.getStudentInfo();
			}
		}
	}
	public void displayWorkshops(Training training) {
		 number2=training.getWorkshopNumber();
		for(int i=0;i<number2;i++) {
			Workshop worksh;
			worksh=training.getWorkshop(i);
			worksh.getWorkshopInfo();
		}
	}
	public void displayWorkshops(Training training,String str) {
		System.out.println("======================================");
		number2=training.getWorkshopNumber();
		for(int i=0;i<number2;i++) {
			Workshop worksh;
			worksh=training.getWorkshop(i);
			if(worksh.getState().equals(str)) {
				worksh.getWorkshopInfo();
			}
		}
	}
	public void displayAbsentees(Workshop workshop) {
		System.out.println("======================================");
		number1=workshop.getNumberOfAbsentees();
		for(int i=0;i<number1;i++) {
			Student stu;
			stu=workshop.getAbsente(i);
			stu.getStudentInfo();
		}
	}
	public void displayStudentWasAbsentInEachWorkshop() {
		System.out.println("======================================");
		System.out.println("the list of absentees in each workshop");
		for(int i=0;i<trainingNumber;i++) {
			//Workshop w;
		    //w=trainingList[i].getWorkshop(j);
			number3=trainingList[i].getWorkshopNumber();
			for(int j=1;j<number3;j++) {
				Workshop w;
			    w=trainingList[i].getWorkshop(j-1);
			    number4=w.getNumberOfAbsentees();
			    System.out.println("workshop=>"+(j));
			    for(int k=0;k<number4;k++) {
			    	w.getAbsenteInfo(k);
			    }
			}		
		}
	}
	public void displayWorkshopsEachStudentWasAbsent() {
		System.out.println("======================================");
		System.out.println("the list of all workshops each student was absent from ");
		for(int i=0;i<trainingNumber;i++) {
			number3=trainingList[i].getStudentNumber();
			for(int j=0;j<number3;j++) {
				System.out.println("list of  workshops student "+(j+1)+" was absent from");
				Student stu;
				stu=trainingList[i].getStudent(j);
				number5=trainingList[i].getWorkshopNumber();
				for(int m=0;m<number5;m++) {
					Workshop w;
				    w=trainingList[i].getWorkshop(m);
				    number4=w.getNumberOfAbsentees();
					for(int k=0;k<number4;k++) {
						if(w.getIdAbsent(k).equals(stu.getId())) {
							//System.out.println("--------------------");
							w.getWorkshopInfo();
							stu.getStudentInfo();
						}
					}
				}				
			}
		}		
	}
	public String displayStudentAbsencesDetails(Student stu) {
		StringBuilder result = new StringBuilder("the list of all workshops the student "+stu.getId()+" student was absent from : \n");
		for(int j=0;j<trainingNumber;j++) {
			number5=trainingList[j].getWorkshopNumber();
			for(int i=0;i<number5;i++) {
				Workshop w;
			    w=trainingList[j].getWorkshop(i);
			    number4=w.getNumberOfAbsentees();
			    for(int k=0;k<number4;k++) {
			    	if(w.getIdAbsent(k).equals(stu.getId())) {
						result.append("- ").append("workshop ").append(i+1+" : ").append(w.display()).append("\n");
					}	
			    }
			}
		}		
		return result.toString();
	}	
}