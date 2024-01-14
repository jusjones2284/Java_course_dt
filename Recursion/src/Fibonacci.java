import java.util.Scanner;

public class Fibonacci {
    private static long[] fibonacciCache;
    public static void main(String[] args) {


        System.out.print("Please enter number ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        fibonacciCache = new long[n + 1];

        for(int i = 0; i <= n; i++){
            System.out.print(fibonacci(i) + ", ");
        }



    }

    private static long fibonacci(int n) {
        if(n <= 1){
            return n;
        } else if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        } else {
            long fib= fibonacci(n - 1) + fibonacci(n -2) ;
            fibonacciCache[n] = fib;
            return fib;
        }
    }
}
