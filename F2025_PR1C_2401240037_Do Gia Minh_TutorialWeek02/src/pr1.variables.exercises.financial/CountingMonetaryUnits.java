import java.util.Scanner;

public class CountingMonetaryUnits{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      double dollar, quarter, dime, nickle, cent; // dollar: %100, quarter: %25, dime: %10, nickle: %5, cent: Remaining
      System.out.print("Enter amount of money (in dollar): ");
      double totalMoney = input.nextDouble();
      cent = totalMoney * 100; // 1 dollar = 100 cents
      dollar = (cent - (cent % 100))  / 100 ; // (original - remainder) / diviend;
      double remainingDollarCent = cent - dollar * 100;
      quarter = ((remainingDollarCent - (remainingDollarCent % 25)) / 25);
      double remainingQuarterCent = remainingDollarCent - quarter * 25; //turn it back to cent for easier calculation
      dime = ((remainingQuarterCent - (remainingQuarterCent % 10)) / 10);
      double remainingDimeCent = remainingQuarterCent - dime * 10;
      nickle = ((remainingDimeCent - (remainingDimeCent % 5)) / 5);
      cent = remainingDimeCent - nickle * 5;
      System.out.printf("%.2f has %.0f dollars, %.0f quaters, %.0f dimes, %.0f nickles, %.0f cents.", totalMoney, dollar, quarter, dime, nickle, cent);

    }
}
