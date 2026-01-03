import java.util.Scanner;

public class IntegerDigitsSum{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number between 0 and 1000: ");
      int numZeroToHundred = input.nextInt();
      int firstDigit, secondDigit, thirdDigit;
      firstDigit = numZeroToHundred % 10; //Remainder = first digit, and we need to  remove it in the second digit
      secondDigit = (numZeroToHundred / 10) % 10;
      thirdDigit = (numZeroToHundred / (10 * 10)) % 10;
      
      System.out.printf("The sum of the digits is %d", firstDigit + secondDigit + thirdDigit);
    }
}
