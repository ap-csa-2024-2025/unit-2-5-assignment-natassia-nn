import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    //Problem 1
    Circle circ1 = new Circle(10.1);
    System.out.println(circ1.toString());
    Circle circ2 = new Circle(14.0);
    System.out.println(circ2.toString());
    Circle circ3 = new Circle(20.5);
    System.out.println(circ3.toString());

    //Problem 2
    System.out.println("Type a number for length and width:");
    double n1 = sc.nextDouble();
    System.out.println("Type a length:");
    double n2 = sc.nextDouble();
    System.out.println("Type a width:");
    double n3 = sc.nextDouble();
    Rectangle rect1 = new Rectangle(n1);
    Rectangle rect2 = new Rectangle(n2, n3);
    System.out.println(rect1.toString());
    System.out.println(rect2.toString());

    //Problem 3
    System.out.println("Type a side length:");
    double side = sc.nextDouble();
    RegularPolygon tri = new RegularPolygon(side);
    RegularPolygon square = new RegularPolygon(4, side);
    System.out.println(tri.toString());
    System.out.println(square.toString());
  }
}
