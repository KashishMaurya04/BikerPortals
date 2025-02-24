
package bikerportals;
import java.util.*;

public class Loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Loan Amount (₹): ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter Rate Of Interest (%): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter Tenure (Months): ");
        int tenure = scanner.nextInt();

        // Calculate EMI
        double monthlyInterestRate = interestRate / (12 * 100);
        double emi = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, tenure)) / (Math.pow(1 + monthlyInterestRate, tenure) - 1);

        System.out.printf("Your EMI is ₹ %.2f/- per month\n", emi);

        scanner.close();
    }
}
