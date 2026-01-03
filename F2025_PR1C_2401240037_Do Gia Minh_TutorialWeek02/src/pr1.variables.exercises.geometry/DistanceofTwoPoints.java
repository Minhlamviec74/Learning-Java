import java.util.Scanner;

public class DistanceofTwoPoints{
    public static void main(String[] args){
        //Create a new Scanner object
        Scanner enterNow = new Scanner(System.in);
        //Variables declaration
        double x1, y1, x2, y2;
        
        System.out.println("Enter x1 and y1: ");
        x1 = enterNow.nextDouble();
        y1 = enterNow.nextDouble();
        
        System.out.println("Enter x2 and y2: ");
        x2 = enterNow.nextDouble();
        y2 = enterNow.nextDouble();
        
        double Distance = Math.pow(( Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) ), 0.5);
        System.out.printf("The distance between two points is: %.15f", Distance);
    }
}