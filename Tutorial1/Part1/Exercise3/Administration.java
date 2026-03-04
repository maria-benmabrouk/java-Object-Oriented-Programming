

public class Administration
{
    
    private record_student[] students = new record_student[500];
    static int studentNumber=0; 
    public void add_new_student(String name,String surname,double average){
        students[studentNumber]=new record_student();
        students[studentNumber].set(name,surname,average);
        studentNumber++;
    }
    
    public void displaying_all_students(){
        System.out.println("displaying the list of all students");
        int i;
        for(i=0;i<studentNumber;i++){
            students[i].displayRecord();
        }
    }
    
    public void displaying_all_students_average(double threshold){
        System.out.println("displaying the list of all students whose average is above a threshold ");
        int i;
        for(i=0;i<studentNumber;i++){
            if(students[i].returnAverage()>threshold){
            students[i].displayRecord();
           }
        }
    }
}