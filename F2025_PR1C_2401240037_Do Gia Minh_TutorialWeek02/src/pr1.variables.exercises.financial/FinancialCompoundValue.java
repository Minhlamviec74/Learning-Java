import java.util.Scanner;

public class FinancialCompoundValue{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the monthly saving amount: ");
      double monthSaving = input.nextDouble();
      double firstMonth, secondMonth, thirdMonth, fourthMonth, fifthMonth, sixthMonth;
      //Formula: (monthSaving + previous month) * (1 + 0.00417)
      firstMonth = (monthSaving ) * (1 + 0.00417);
      secondMonth = (monthSaving + firstMonth) * (1 + 0.00417);
      thirdMonth = (monthSaving + secondMonth) * (1 + 0.00417);
      fourthMonth = (monthSaving + thirdMonth) * (1 + 0.00417);
      fifthMonth = (monthSaving + fourthMonth) * (1 + 0.00417);
      sixthMonth = (monthSaving + fifthMonth) * (1 + 0.00417);

      System.out.printf("After the sixth month, the account value is $%.2f", sixthMonth - 0.01 );
    }
}
