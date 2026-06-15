
import java.util.Scanner;
public class ShapeMain {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          // ── TASK 1
         int n = sc.nextInt(); //number os shapes
           // ── TASK 2
          Shape[] shapes = new Shape[n];
          // ── TASK 3
          for (int i = 0; i < n; i++) {
              String type   = sc.next();
              String color  = sc.next();
              boolean filled = sc.nextBoolean();
              if (type.equals("RECTANGLE")) {
                  double width  = sc.nextDouble();
                  double length = sc.nextDouble(); ;
                  shapes[i] = new Rectangle(color,filled,length,width);

              } else if (type.equals("CIRCLE")) {
                  double radius = sc.nextDouble() ;
                  shapes[i] = new Circle(color,filled,radius);
              }
          }
          // ── TASK 4
          for (int i = 0; i < n; i++) {
              System.out.println(shapes[i]);
              System.out.println();
          }

          // ── TASK 5:
          System.out.println("--- Downcast Check ---");
           for (int i = 0; i < n; i++) {
              Shape s = shapes[i];
                if (s instanceof Rectangle) {
                 Rectangle r = (Rectangle) s;
                 System.out.println("Rectangle width=" + r.getWidth() + " length=" + r.getLength());

              } else if (s instanceof Circle) {
                  Circle c = (Circle) s;
                 System.out.println("Circle radius=" + c.getRadius());
              }
          }
          // ── TASK 6:
          //Answer: the compiler give compile-time error if I write: Shape s = new Shape("Red", true);
          //  Since Shape is an abstract class therefore it can't be instantiated.
        sc.close();
    }
}
