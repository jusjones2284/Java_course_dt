import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a, b, c: ");
//        double a = input.nextDouble();
//        double b = input.nextDouble();
//        double c = input.nextDouble();
//
//        double discriminant =   Math.pow(b, 2) - 4 * a * c;
//        System.out.print("The equation has ");
//        if (discriminant > 0)
//        {
//            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
//            double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
//            System.out.println("two roots " + root1 + " and " + root2);
//        }
//        else if (discriminant == 0)
//        {
//            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
//            System.out.println("one root " + root1);
//        }
//        else
//            System.out.println("no real roots");



//                Scanner sc = new Scanner(System.in);
//                System.out.println("Enter a,b,c,d,e,f: ");
//                double a = sc.nextDouble();
//                double b = sc.nextDouble();
//                double c = sc.nextDouble();
//                double d = sc.nextDouble();
//                double e = sc.nextDouble();
//                double f = sc.nextDouble();
//
//                if( (a*d - b*c) == 0 )
//                    System.out.println("The equaltion has no solution\n");
//                else
//                {
//                    a=a/b;
//                    e=e/b;
//                    b=b/b;
//
//                    c=c/d;
//                    f=f/d;
//                    d=d/d;
//
//                    double x = (f - e) / (c-a);
//                    double y = e - (x*a);
//
//                    System.out.println("x is " + x + " and y is " + y);
//
//
//                }
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a month in the year (e.g., 1 for Jan): ");
//        int month = input.nextInt();
//
//        System.out.println("Enter a year: ");
//        int year = input.nextInt();
//
//        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//        System.out.println(leapYear);
//
//        switch (month)
//        {
//            case 1: System.out.println(
//                    "January " + year + " had 31 days"); break;
//            case 2: System.out.println("February " + year + " had" +
//                    ((leapYear) ? " 29 days" : " 28 days")); break;
//            case 3: System.out.println(
//                    "March " + year + " had 31 days"); break;
//            case 4: System.out.println(
//                    "April " + year + " had 30 days"); break;
//            case 5: System.out.println(
//                    "May " + year + " had 31 days"); break;
//            case 6: System.out.println(
//                    "June " + year + " had 30 days"); break;
//            case 7: System.out.println(
//                    "July " + year + " had 31 days"); break;
//            case 8: System.out.println(
//                    "August " + year + " had 31 days"); break;
//            case 9: System.out.println(
//                    "September " + year + " had 30 days"); break;
//            case 10: System.out.println(
//                    "October " + year + " had 31 days"); break;
//            case 11: System.out.println(
//                    "November " + year + " had 30 days"); break;
//            case 12: System.out.println(
//                    "December " + year + " had 31 days");
//        }
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter year: (e.g., 2012): ");
//        int year = input.nextInt();
//        System.out.print("Enter month: 1-12: ");
//        int month = input.nextInt();
//        System.out.print("Enter the day of the month: 1-31: ");
//        int dayOfMonth = input.nextInt();
//
//        if (month == 1 || month == 2)
//        {
//            month = (month == 1) ? 13 : 14;
//            year--;
//        }
//
//        int dayOfWeek = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100)
//                + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;
//
//        System.out.print("Day of the week is ");
//        switch(dayOfWeek)
//        {
//            case 0: System.out.println("Saturday"); break;
//            case 1: System.out.println("Sunday"); break;
//            case 2: System.out.println("Monday"); break;
//            case 3: System.out.println("Tuesday"); break;
//            case 4: System.out.println("Wednesday"); break;
//            case 5: System.out.println("Thursday"); break;
//            case 6: System.out.println("Friday");
//        }

//        System.out.println( 1+(4d + 2f));

        System.out.println(Math.ceil(5.0));
        System.out.println(Math.floor(5.6));
        System.out.println(Math.abs(-5));
        int num1 =3;
        int num2 =6;
        System.out.println(Math.min(num2, num1));
        System.out.println(Math.max(num1, num2));
        System.out.println((int)Math.pow(2,4));
        System.out.println((int)(Math.random() * 10));
        System.out.println(Math.round(5.8));
            }

        }



