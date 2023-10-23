//public class TestVoidMethod {
//
//    public static void main(String[] args) {
//        System.out.print("The grade is: ");
//        printGrade(50);
//
////        nPrintln();
//
//    }
//
//    public static void printGrade(double score){
//        if(score > 90.0){
//            System.out.println('A');
//        } else if (score > 80) {
//            System.out.println('B');
//        } else if (score > 70) {
//            System.out.println('C');
//        } else if (score > 65) {
//            System.out.println('D');
//        } else System.out.println('F');
//    }
//
//    public static void printGrade(double score, double points){
//        if(score < 0 || score > 100){
//            System.out.println("Invalid score");
//            return;
//        }
//        if(score >= 90){
//            System.out.println('A');
//        }
//        if(score >= 70){
//            System.out.println('C');
//        }
//    }
//
//    public static void nPrintln(String message, int n){
//        for(int i = 0; i < n; i++)
//            System.out.println(message);
//    }
//}
//
//import java.util.Scanner;
//
//public class Exercise_06_07 {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        final int NUMBER_OF_YEARS = 30;
//
//        System.out.print("\nThe amount invested: ");
//        double amount = input.nextDouble();
//        System.out.print("Annual interest rate: ");
//        double annualInterestRate = input.nextDouble();
//
//        double monthlyInterestRate = annualInterestRate / 1200;
//
//        for (int years = 1; years <= NUMBER_OF_YEARS; years++) {
//            System.out.printf("%-10d", years);
//            System.out.printf("%11.2f\n",
//                    futureInvestmentValue(amount, monthlyInterestRate, years));
//        }
//    }
//    public static double futureInvestmentValue(
//            double investmentAmount, double monthlyInterestRate, int years) {
//        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
//    }
//}
//public class Exercise06_13 {
//    /** Main Method */
//    public static void main(String[] args) {
//
//        double seriesStart  =  1.0;
//        double numberOfRows = 20.0;
//
//
//        System.out.println("\ni         m(i)     ");
//        System.out.println("-------------------");
//
//
//        for (double i = seriesStart; i <= numberOfRows; i++) {
//            System.out.printf("%-10.0f", i);
//            System.out.printf("%7.4f\n", sumSeries(i));
//        }
//    }
//    public static double sumSeries(double n) {
//        double sum = 0;
//        for (double i = 1; i <= n; i++) {
//            sum += i / (i + 1);
//        }
//        return sum;
//    }
//}
//
//import java.util.Scanner;
//
//public class Exercise_06_37 {
//    /** Main Method */
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a number and its width: ");
//        int number = input.nextInt();
//        int width = input.nextInt();
//
//        System.out.println(
//                number + " formatted to width " + width + ": " + format(number, width));
//    }
//
//    public static String format(int number, int width) {
//        String num = number + "";
//
//        if (num.length() < width) {
//            for (int i = width - num.length(); i > 0; i--) {
//                num = 0 + num;
//            }
//        }
//        return num;
//    }
//}
//
//import java.util.Scanner;
//
//public class Exercise_06_25 {
//    /*Main Method */
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter milliseconds: ");
//        long millis = input.nextLong();
//
//        System.out.println("hours:minuties:seconds: " + convertMillis(millis));
//    }
//
//    public static String convertMillis(long millis) {
//        millis /= 1000;
//
//        String currentMinuteAndSecond = "";
//        for (int i = 0; i < 2; i++) {
//            currentMinuteAndSecond = ":" + millis % 60 + currentMinuteAndSecond;
//            millis /= 60;
//        }
//        return millis + currentMinuteAndSecond;
//    }
//}
//
//import java.util.Scanner;
//public class Exercise06_23{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String str = input.nextLine();
//
//        System.out.print("Enter a character: ");
//        char c = input.nextLine().charAt(0);
//
//        input.close();
//
//        System.out.println("The number of occurences of " + c + " in "
//                + str + " is " + count(str,c) );
//    }
//    public static int count(String str, char c){
//        int count = 0;
//        for (int i = 0; i < str.length(); i++){
//            if (str.charAt(i) == c){
//                count++;
//            }
//        }
//        return count;
//    }
//}