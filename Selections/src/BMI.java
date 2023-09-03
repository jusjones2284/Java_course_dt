import java.awt.*;
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter weight in pounds: ");
//        double weight = input.nextDouble();
//
//        System.out.println("Enter height inches: ");
//        double height = input.nextDouble();
//
//        final double KILOGRAMS_PER_POUND = 0.45359257;
//        final double METERS_PER_INCH = 0.0254;
//
//        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
//        double heightInMeters = height * METERS_PER_INCH;
//
//        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
//
//        System.out.printf( "Your BMI is %5.2f\n", bmi);
//
//        if (bmi < 16){
//            System.out.println("You are seriously underweight");
//        } else if ( bmi < 18) {
//            System.out.println("You are underweight");
//
//        } else if (bmi <24) {
//            System.out.println("You are normal weight");
//
//        } else if (bmi < 29) {
//            System.out.println("You are overweight");
//
//        } else if (bmi < 35) {
//            System.out.println("You are seriously overweight");
//
//        } else System.out.println(" you are greatly overweight");

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("\"(0-single filer, 1-married jointly or \" +\n" +
//                "      \"qualifying widow(er), 2-married separately, 3-head of \" +\n" +
//                "      \"household)\"");
//        System.out.print("Enter the filing status: ");
//        int status = input.nextInt();
//
//        System.out.println("Enter the taxable income: ");
//        double income = input.nextDouble();
//
//        double tax = 0;
//        if(status == 0){
//            if (income <= 8350){
//                tax = income * 0.10;
//            } else if (income <= 33950) {
//                tax = tax = 8350 * 0.10 + (income - 8350) * 0.15;
//            }
//        }
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println(" Enter an integer: ");
//
//        int number = input.nextInt();
//
//        if(number % 2 == 0 && number % 3 == 0)
//            System.out.println(number + " is divisible by 2 and 3.");
//
//        if (number % 2 == 0 || number % 3 == 0)
//            System.out.println(number + " is divisible by 2 or 3.");
//
//        if(number % 2 == 0 ^ number % 3 == 0)
//            System.out.println(number + " divisible by 2 or 3, but not both.");

        //write a boolean expression that evaluates to true if a number stored in variable num is between 1 and 100.

//        int x = 5;
//
//        (x != 0) || (x = 0);
//        !(x > 0) && (x > 0);
//        (true) && (3 => 4);
//        (-10 < x < 0);
//        x > 0) || (x < 0);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a year: ");
//        int year = input.nextInt();
//
//        boolean isLeapyear = (
//                year % 4 == 0 && year % 100 != 0
//                ) || (year % 400 == 0);
//
//        System.out.println(year + " is a leap year? " + isLeapyear);
//
//
//
//        int lottery = (int)(Math.random() * 100);
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your lottery pick (two digits): ");
//        int guess = input.nextInt();
//
//        int lotteryDigit1 = lottery/10;
//        int lotteryDigit2 = lottery % 10;
//
//        int guessDigit1 = guess / 10;
//        int guessDigit2 = guess % 10;
//
//        System.out.println("The lottery number is " + lottery);
//
//        if(guess == lottery)
//            System.out.println("Exact match: you win $10,000");
//        else if (guessDigit2 == lotteryDigit1
//             && guessDigit1 == lotteryDigit2)
//            System.out.println("Match all digits: you win $3,000");
//        else if (guessDigit1 == lotteryDigit1
//                ||guessDigit1 == lotteryDigit2
//                    || guessDigit2 == lotteryDigit2
//                    || guessDigit2 == lotteryDigit2
//                    )
//        System.out.println("Match one digit: you win $1,000");
//        else
//        System.out.println("Sorry, no match");
//
//        int x = 10;
//        int y = 10;
//
//       int yea = (int)(y > 10) && (x-- > 10);

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a year: ");
//        int year = input.nextInt();
//
//        switch (year % 12){
//            case 0:
//                System.out.println("monkey"); break;
//            case 1:
//                System.out.println("rooster"); break;
//            case 2:
//                System.out.println("dog"); break;
//            case 3:
//                System.out.println("pig"); break;
//            case 4:
//                System.out.println("rat"); break;
//            case 5:
//                System.out.println("ox");break;
//            case 6:
//                System.out.println("tiger");break;
//            case 7:
//                System.out.println("rabbit");break;
//            case 8:
//                System.out.println("dragon");break;
//            case 9:
//                System.out.println("snake");break;
//            case 10:
//                System.out.println("horse");break;
//            case 11:
//                System.out.println("sheep");break;

//            int day = 1;
//            switch (day){
//                case 1 -> System.out.println(1 + " " + " another num");
//                case 2 -> System.out.println(2 + " ");
//                case 3 -> System.out.println(3 + " ");
//            }
//
//            int days = 1;
//        System.out.println(
//                switch (days){
//                    case 1 -> 1 + " second one";
//                    case 2 -> 2 + " ";
//                    case 3 -> 3 + " ";
//                    default -> " ";
//
//                }
//        );
//
//        int year = 2000;
//        int month = 2;
//        System.out.println(
//                switch (month){
//                    case 2 -> {
//                        if(year == 2000)
//                        return "29 days";
//                    }
//                    else
//                        yield "28 days";
//                }
//        );

        int day = 2;
//
//        switch (day){
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tues");
//                break;
//            case 3:
//                System.out.println("wed");
//                break;
//            case 4:
//                System.out.println("thur");
//                break;
//            case 5:
//                System.out.println("fri");
//                break;
//        }

        System.out.println(
                switch (day){
                    case 1 -> "Monday";
                    case 2 -> "Tues";
                    case 3 -> "Wed";
                    case 4 -> "thur";
                    case 5 -> "sat";
                    default -> "none of these";
                }
        );
//
//        int num1 = 5;
//        int num2 = 10;
//
//        int max = (num1 > num2) ? num1: num2;
//        System.out.println(max);
//
//        System.out.println((num2 % 2 == 0) ? "num is even": "num is odd");
//
//        int status = num1 > num2 ? 1: (num1 == num2 ? 0: -1 );
//
//      ticketPrcie =  (ages >= 16) ? 20 :  10;

        boolean even = false;
        System.out.println(even ? false : "Falses" );

        int credits = 45;

//
//        String finalScore =  ((credits < 30)?"freshman":
//                ((credits < 60 && credits > 29)?"sophomore":
//                        ((credits < 90 && credits > 59)?"junior":
//                                ((credits > 89)?"senior": "invalid"))));

        String finalScores = ((credits < 30)? "freshman" : ((credits < 60 && credits > 29 ? "softmore" : ((credits < 90 && credits > 59)? "junior" : ((credits > 89) ?"senior" : "invalid" )))));

        int month = 12;
        String finalMonth = ((month == 1 ? "Jan" : ((month == 2) ? "Feb" :
                ((month ==3) ? "March": ((month == 4) ? "April" : "null")))));

        System.out.println(finalMonth);


    }








 }

