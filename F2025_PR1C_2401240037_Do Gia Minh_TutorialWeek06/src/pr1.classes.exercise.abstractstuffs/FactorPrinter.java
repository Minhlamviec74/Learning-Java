package pr1.classes.exercise.abstractstuffs;
import java.util.Scanner;
public class FactorPrinter{
    public static void main(String[] args){
        //Actually, I intended to make getFactorList() and some other methods static, but the exercise doesn't allow so
        Scanner numberInput = new Scanner(System.in);
        int num = numberInput.nextInt();
        FactorGenerator test = new FactorGenerator(num);
        System.out.println(test.getFactorList());
        System.out.println(test.hasMoreFactor());
    }
}