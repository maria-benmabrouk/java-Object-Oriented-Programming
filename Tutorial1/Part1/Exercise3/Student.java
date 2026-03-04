

public class Student
{
    private String name,surname;
    private int idNumber;
    static int NumberStudents;
    private double mod1,mod2,mod3; 
    public Student(String n,String sn){
        this.name=n;
        this.surname=sn;
        NumberStudents++;
        this.idNumber=NumberStudents;
    }
    
    public Student(String n,String sn,double mod1,double mod2,double mod3){
        this.name=n;
        this.surname=sn;
        NumberStudents++;
        this.idNumber=NumberStudents;
        this.mod1=mod1;
        this.mod2=mod2;
        this.mod3=mod3;
    }
    
    public void setAverages(double mod1,double mod2,double mod3){
        this.mod1=mod1;
        this.mod2=mod2;
        this.mod3=mod3;
    }
    
    public void AveragesSorted(double avrg[]){
        this.mod1=avrg[0];
        this.mod2=avrg[1];
        this.mod3=avrg[2];
        
    }
    
    public double calculateAverage(){
        return (mod1+mod2+mod3)/3 ;
    }
    
    public void display(){
        System.out.println("name: "+name);
        System.out.println("surname: "+surname);
        System.out.println("idNumber: "+idNumber);
        System.out.println("mod1: "+mod1);
        System.out.println("mod2: "+mod2);
        System.out.println("mod3: "+mod3);
        System.out.println("The average of this student :"+calculateAverage());

    }
    
    
}