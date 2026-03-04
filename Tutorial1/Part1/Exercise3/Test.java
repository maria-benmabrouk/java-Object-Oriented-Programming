
import java.util.Scanner;

public class Test
{
    public static void main(String args[]){

        Administration table_students=new Administration();
        
        Student Student1=new Student("Maria","Benmabrouk");
        Student1.setAverages(10,15,12);
        table_students.add_new_student("Maria","Benmabrouk",Student1.calculateAverage());
        Student1.display();
        
        Student Student2=new Student("Imen","pmqlk");
        Student2.setAverages(10,14,11);
        Student2.display();
        table_students.add_new_student("Imen","pmqlk",Student2.calculateAverage());
        
        System.out.println("-------------------");
        Student Student3=new Student("iiiii","dfbnk",11,9,10);
        Student3.display();
        table_students.add_new_student("iiiii","dfbnk",Student3.calculateAverage());
        
        Student Student4=new Student("hggv","lloij",15,12,13);
        Student4.display();
        table_students.add_new_student("hggv","lloij",Student4.calculateAverage());
        System.out.println("-------------------");
        
        table_students.displaying_all_students();
        double threshold;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the threshold value ");
        threshold = sc.nextInt();
        table_students.displaying_all_students_average(threshold);
        
  }
}