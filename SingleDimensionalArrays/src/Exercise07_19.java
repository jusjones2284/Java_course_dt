//import java.util.Scanner;
//
//public class  Exercise07_11 {
//
//    public static double deviation(double[] x) {
//        double m = mean(x);
//        double total = 0;
//        for(int i = 0; i < x.length; ++i) {
//            total += Math.pow(m - x[i], 2);
//        }
//        return Math.sqrt(total / (x.length-1));
//    }
//
//    public static double mean(double[] x) {
//        double total = 0;
//        for(int i = 0; i < x.length; ++i) {
//            total += x[i];
//        }
//        return total/x.length;
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter 10 numbers: ");
//        double[] x = new double[10];
//        for(int i = 0; i < x.length; ++i) {
//            x[i] = in.nextDouble();
//        }
//        System.out.printf("The mean is %.2f\n", mean(x));
//        System.out.printf("The standard deviation is %.5f\n", deviation(x));
//    }
//
//}