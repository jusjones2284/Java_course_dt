import java.util.Scanner;

public class NumberStuff {
    public static void main(String[] args) {
//        byte myByte = 127;
//        boolean myFlag = true;
//        short myBigShort = 32767;
//        char myChar = 'd';
//        double myDouble = 3.141592;
//        float myFloat = 3.141592f;
//
//        byte anotherByte = 0x1f;//hexi decimial
//        int anotherInt = 0b010101;//binary
//        int anotherIns = 0b01;
//        int anotherInts = 0b01 | 0b10 | 0b00;
//
//
//        NumberStuff myInstance = new NumberStuff();
//        System.out.println(anotherInts);1000000000

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of minutes: ");
//                int minutes = input.nextInt();
//
//                int totalNumberOfDays = minutes / (24 * 60);
//                int numberOfYears = totalNumberOfDays / 365;
//                int remainingNumberOfDays = totalNumberOfDays % 365;
//
//        System.out.print(minutes + " minutes is approximately " + numberOfYears + " years and " + remainingNumberOfDays + " days " );
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("enter three points for a triangle: ");
//        double x1 = input.nextDouble();
//        double y1 = input.nextDouble();
//        double x2 = input.nextDouble();
//        double y2 = input.nextDouble();
//        double x3 = input.nextDouble();
//        double y3 = input.nextDouble();
//
//
//        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
//        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
//        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
//        double s = (side1 + side2 + side3) / 2;
//        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
//
//        System.out.println("The area of the triangle is " + area);
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter investment amount: ");
//        double investmentAmount = input.nextDouble();
//
//        System.out.print("Enter annual interest rate in percentage ");
//        double annualInterestRate = input.nextDouble();
//
//        System.out.print("Enter number of years: " );
//        int numberOfYears = input.nextInt();
//
//        double monthlyInterestRate = annualInterestRate/1200;
//
//        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate),(numberOfYears * 12));
//
//        System.out.println(futureInvestmentValue);




//            Scanner input =new Scanner(System.in);
//
//            System.out.println("Enter x1 and y1: ");
//
//            float x1= input.nextFloat();
//            float y1= input.nextFloat();
//
//            System.out.println("enter x2 and y2: ");
//
//            float x2=input.nextFloat();
//            float y2=input.nextFloat();
//
//            double distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
//            System.out.println("The distance between the two points is "+distance);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal ");
        double subtotal = input.nextDouble();
        System.out.print("Enter the gratuity rate: ");
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * gratuityRate/100;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

        }
    }






