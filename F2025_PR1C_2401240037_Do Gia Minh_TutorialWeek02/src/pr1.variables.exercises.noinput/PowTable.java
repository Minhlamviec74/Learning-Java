import java.util.Scanner;

public class PowTable{
    public static void main(String[] args){
        int a, b;
        a = 1;
        b = 2;
        double powerAAndB = Math.pow(a, b);
        System.out.println("a      b      pow(a , b)");
        System.out.printf("%d      %d      %d\n", a, b, (int)powerAAndB);

        a = 2;
        b = 3;
        powerAAndB = Math.pow(a, b);
        System.out.printf("%d      %d      %d\n", a, b, (int)powerAAndB);

        a = 3;
        b = 4;
        powerAAndB = Math.pow(a, b);
        System.out.printf("%d      %d      %d\n", a, b, (int)powerAAndB);
    }
}