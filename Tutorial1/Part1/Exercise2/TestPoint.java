
import java.util.Scanner;

public class TestPoint
{
    public static void main (String args [] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of x :");
        int x = sc.nextInt();
        System.out.println("Please enter the value of y :");
        int y = sc.nextInt();
        Point p = new Point(x,y);
        p.display();


}

}