
public class Point {
            private int x;
            private int y;
            public Point(int absc, int ord){
                  x = absc;
                  y = ord;
        }
        
           public void move (int dx, int dy){
                  x = x + dx;
                  y = y + dy;
        }
        
           public void display(){
                  System.out.println("My coordinates are x = "+x+" and y ="+y);
        }
}// End of the Point class