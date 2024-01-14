import java.util.Scanner;

public class ComputeFactorial {
    public static void main(String[] args) {
        //a recursive method is the one that calls itself. an infinite recursion is the one that never stops.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));


    }

    public static long factorial(int n){
        if(n == 0){
            return 1;
        }else {
            return n * factorial(n - 1);
        }


    }

}


