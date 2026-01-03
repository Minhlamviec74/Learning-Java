import java.util.Scanner;

public class RunwayLength{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      double speed, accel, length;
      System.out.print("Enter speed and acceleration: ");
      speed = input.nextDouble();
      accel = input.nextDouble();
      length = ( speed * speed ) / ( 2 * accel );
      System.out.printf("The minimum runway length of this airplane is %.3f", length);

    }
}
