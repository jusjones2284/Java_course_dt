import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Enter your yearly interest rate

        System.out.println("Enter yearly interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter loan amount, for example, 151556: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate,numberOfYears, loanAmount);

        System.out.printf("The loan was created on %s\n" +
                "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());




    }
}
