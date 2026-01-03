import java.util.Scanner;

public class TriangleArea{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      double x1, y1, x2, y2, x3, y3;
      System.out.print("Enter three points for a triangle: ");
      x1 = input.nextDouble();
      y1 = input.nextDouble();
      x2 = input.nextDouble();
      y2 = input.nextDouble();
      x3 = input.nextDouble();
      y3 = input.nextDouble();
      
      double side1, side2, side3;
      side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y2 - y1, 2));
      side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
      side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
      
      double s = (side1 + side2 + side3) / 2;
      double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
      System.out.printf("The area of the triangle is %.1f", area);
    }
}
