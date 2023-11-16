//import java.util.Scanner;
//
//public class Quotient {
//
//    public static int quotient(int number1, int number2){
//        if(number2 == 0)
//            throw new ArithmeticException("Divisor cannot be zero");
//        System.out.println(number1 + " / " + number2 + " is " +
//                        (number1/number2)
//                );
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter two integers: ");
//        int number1 = input.nextInt();
//        int number2 = input.nextInt();
//
//        try{
//            if(number2 == 0)
//                throw new ArithmeticException("behavior cannot be zero");
//
//            System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
//        }
//        catch (Exception ex){
//            System.out.println("Exception: an integer cannot be divided by zero");
//        }
//    }
//}

import java.util.Scanner;

public class Quotient{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number2 > number1){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number2 != 0){
            System.out.println((number1 + " / " + number2 + " is " +
                    (number1 / number2)
            ));
        } else
            System.out.println("Divisor cannot be zero");

    }
}