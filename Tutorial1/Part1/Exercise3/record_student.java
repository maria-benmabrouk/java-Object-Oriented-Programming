
public class record_student
{
    private String name,surname;
    private double average; 
    
    public void set(String name,String surname,double average){
          this.name=name;
          this.surname=surname;
          this.average=average;
    }
    
    public double returnAverage(){
          return average;
    }
    
    public void displayRecord(){
        System.out.println("---------------------------");
        System.out.println("name: "+name);
        System.out.println("surname: "+surname);
        System.out.println("mod1: "+average);
    
    } 
}