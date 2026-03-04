package com.project;

public class AttendanceReporter {
	public String display_Workshops() {
		Training training=new Training();
		//
		if (training.getTrainingNumber() == 0) return "No workshops for " + training.getTrainingName();
		//
		StringBuilder result = new StringBuilder("Workshops for the training " +
		training.getTrainingName() + " : \n");
		for (int i = 0; i <training.getWorkshopNumber(); i++) {
		result.append("- ").append(training.getWorkshop(i).display()).append("\n");
		}
		return result.toString();
	}
	public String displayStudentAbsencesDetails(Student stu) {
		AttendanceService service=new AttendanceService();
		int number1;
		int number2;
		//if (service.getTrainingNumber() == 0) return "No workshops for " + training.getTrainingName();
		StringBuilder result = new StringBuilder("the list of all workshops the student "+stu.getId()+" student was absent from : \n");
		for(int j=0;j<service.getTrainingNumber();j++) {
			number1=service.getTraining(j).getWorkshopNumber();
			for(int i=0;i<number1;i++) {
				Workshop w;
			    w=service.getTraining(j).getWorkshop(i);
			    number2=w.getNumberOfAbsentees();
			    for(int k=0;k<number2;k++) {
			    	if(w.getIdAbsent(k).equals(stu.getId())) {
						result.append("- ").append("workshop ").append(i+1+" : ").append(w.display()).append("\n");
					}	
			    }
			}
		}		
		return result.toString();
	}
	public String formatEnrolledStudents(AttendanceService service) {
		int number1;
		Training training;
		Student stu;
		int number2;
		//if (training.getTrainingNumber() == 0) return "No workshops for " + training.getTrainingName();
		number1=service.getTrainingNumber();
		StringBuilder result= new StringBuilder("the list of enrolled students : \n");
		for(int i=0;i<number1;i++) {  
			training=service.getTraining(i);
			number2=training.getStudentNumber();
			for(int j=0;j<number2;j++) {
				stu=training.getStudent(j);
				result.append("- ").append("student ").append(j+1+" : ").append(stu.getInfoStu()).append("\n");
			}
		}
		return result.toString();
	}
	public String formatWorkshops(Training training) {
		int number1;
		number1=training.getWorkshopNumber();
		if (training.getTrainingNumber() == 0) return "No workshops for " + training.getTrainingName();
		StringBuilder result = new StringBuilder("Workshops for the training " + training.getTrainingName() + " : \n");
		for(int i=0;i<number1;i++) {
			result.append("- ").append(training.getWorkshop(i).display()).append("\n");
		}
		return result.toString();
	}
	public String formatWorkshops(Training training,String str) {
		int number1;
		number1=training.getWorkshopNumber();
		if (training.getTrainingNumber() == 0) return "No workshops for " + training.getTrainingName();
		StringBuilder result = new StringBuilder("Workshops "+str+"  for the training " + training.getTrainingName() + " : \n");
		for(int i=0;i<number1;i++) {
			if(training.getWorkshop(i).getState().equals(str)) {
				result.append("- ").append(training.getWorkshop(i).display()).append("\n");
			}
		}
		return result.toString();
	}
	public String formatAbsentees(Workshop workshop) {
		int number1;
		number1=workshop.getNumberOfAbsentees();
		if (number1 == 0) return "No workshops \n " ;
		StringBuilder result = new StringBuilder("Absentees of workshop "+workshop.display()+" :\n");
		for(int i=0;i<number1;i++) {
			result.append("- ").append(workshop.getAbsente(i).getInfoStu()).append("\n");
		}
		return result.toString();
	}
	public String formatStudentAbsenceDetails(Student stu,Training training) {
		int number1=training.getWorkshopNumber();
		if (number1 == 0) return "No workshops for "+stu.getName();
		StringBuilder result = new StringBuilder("Detailed absence for "+stu.getName()+" : \n");
		for(int i=0;i<number1;i++) {
			int number2=training.getWorkshop(i).getNumberOfAbsentees();
			for(int j=0;j<number2;j++) {
				if(training.getWorkshop(i).getAbsente(j).getId().equals(stu.getId())) {
					result.append("- Missed workshop on ").append(training.getWorkshop(i).display()).append("\n");
				}
			}
		}
		return result.toString();
	}
}
