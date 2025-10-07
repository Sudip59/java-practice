import java.util.Scanner;

public class InterestCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the loan amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double interest = amount * (rate / 100) * years;

        System.out.println("Loan amount: " + amount);
        System.out.println("Interest rate: " + rate);
        System.out.println("Number of years: " + years);
        System.out.println("Interest: " + interest);

        scanner.close();
    }
}
