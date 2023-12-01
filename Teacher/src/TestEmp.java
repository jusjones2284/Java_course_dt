//import java.util.Arrays;
//
//public class TestEmp {
//
//    public static void main(String[] args) {
//        Teacher haynes = new Teacher("Berlyn Haynes", -1);
//        Teacher haynes2 = new Teacher("Berlyn Haynes", 1);
//       ;
//        System.out.println(haynes2.nameInUpperCase());
//
//        System.out.println(haynes.equals(haynes2));;
//
//        System.out.println(haynes.toString());;
//
//        Teacher.printWhatever();
//        String hello = Teacher.DEFAULT_EMPLOYEE_NAME;
//        System.out.println(Teacher.DEFAULT_EMPLOYEE_NAME);
//
//    }
//}
//
//import java.util.Scanner;
//
//public class Exercise04_17 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//
//        System.out.print("Enter a year: ");
//        int year = input.nextInt();
//
//
//        System.out.print("Enter a month: ");
//        String month = input.next();
//
//
//        if (isValidMonth(month)) {
//            int daysInMonth = getDaysInMonth(year, month);
//            System.out.println(month + " " + year + " has " + daysInMonth + " days");
//        } else {
//            System.out.println(month + " is not a correct month name");
//        }
//    }
//
//    private static boolean isValidMonth(String month) {
//
//        String[] validMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
//        for (String validMonth : validMonths) {
//            if (month.equalsIgnoreCase(validMonth)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private static int getDaysInMonth(int year, String month) {
//
//        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//
//        int monthIndex = getMonthIndex(month);
//        return daysInMonth[monthIndex];
//    }
//
//    private static boolean isLeapYear(int year) {
//
//        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//    }
//
//    private static int getMonthIndex(String month) {
//
//        String[] validMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
//        for (int i = 0; i < validMonths.length; i++) {
//            if (month.equalsIgnoreCase(validMonths[i])) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}



User
        solve in Java code:
        A complex number is a number in the form a + bi, where a and b are real numbers and i is sqrt(-1). The numbers a and b are known as the real part and imaginary part of a complex number, respectively.
        You can perform addition, subtraction, multiplication, and division for complex numbers using the following formulas:
        a + bi + c + di = (a + c) + (b + d)i
        a + bi - (c + di) = (a - c) + (b - d)i
        (a + bi) * (c + di) = (ac - bd) + (bc + ad)i
        (a+bi)/(c+di) = (ac+bd)/(c^2 +d^2) + (bc-ad)i/(c^2 +d^2)
        You can also obtain the absolute value for a complex number using the following formula:
        | a + bi | = sqrt(a^2 + b^2)
        (A complex number can be interpreted as a point on a plane by identifying the (a, b) values as the coordinates of the point. The absolute value of the complex number corresponds to the distance of the point to the origin, as shown in Figure 13.10 in the text.)
        Design a class named Complex for representing complex numbers and the methods add, subtract, multiply, divide, and abs for performing complex number operations, and override the toString method for returning a string representation for a complex number. The toString method returns (a + bi) as a string. If b is 0, it simply returns a. Your Complex class should also implement Cloneable and Comparable. Compare two complex numbers using their absolute values.
        Provide three constructors Complex(a, b), Complex(a), and Complex(). Complex() creates a Complex object for number 0 and Complex(a) creates a Complex object with 0 for b. Also provide the getRealPart() and getImaginaryPart() methods for returning the real and imaginary part of the complex number, respectively.
        Use the template at https://liveexample.pearsoncmg.com/test/Exercise13_17_13e.txt for your code.
        Sample Run
        Enter the first complex number: 3.5 5.5
        Enter the second complex number: -3.5 1
        (3.5 + 5.5i) + (-3.5 + 1.0i) = 0.0 + 6.5i
        (3.5 + 5.5i) - (-3.5 + 1.0i) = 7.0 + 4.5i
        (3.5 + 5.5i) * (-3.5 + 1.0i) = -17.75 -15.75i
        (3.5 + 5.5i) / (-3.5 + 1.0i) = -0.5094339622641509 -1.7169811320754718i
        |3.5 + 5.5i| = 6.519202405202649
        false
        3.5
        5.5
        [-3.5 + 1.0i, 4.0 + -0.5i, 3.5 + 5.5i, 3.5 + 5.5i]
        Class Name: Exercise13_17
        ChatGPT
        I can provide you with a Java code template for the Complex class based on your requirements. Here's the code:

        java
        Copy code
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;

class Exercise13_17 {
    public static void main(String[] args) {
        Complex complex1 = new Complex(3.5, 5.5);
        Complex complex2 = new Complex(-3.5, 1);

        // Perform operations
        System.out.println(complex1 + " + " + complex2 + " = " + complex1.add(complex2));
        System.out.println(complex1 + " - " + complex2 + " = " + complex1.subtract(complex2));
        System.out.println(complex1 + " * " + complex2 + " = " + complex1.multiply(complex2));
        System.out.println(complex1 + " / " + complex2 + " = " + complex1.divide(complex2));
        System.out.println("|" + complex1 + "| = " + complex1.abs());

        // Compare two complex numbers using their absolute values
        System.out.println(complex1.compareTo(complex2));

        // Display real and imaginary parts
        System.out.println(complex1.getRealPart());
        System.out.println(complex1.getImaginaryPart());

        // Test clone and equals
        Complex[] array = {new Complex(-3.5, 1), new Complex(4.0, -0.5), complex1, complex1.clone()};
        System.out.println(Arrays.toString(array));
    }
}

class Complex implements Cloneable, Comparable<Complex> {
    private double real;
    private double imaginary;

    public Complex() {
        this(0, 0);
    }

    public Complex(double real) {
        this(real, 0);
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getRealPart() {
        return real;
    }

    public double getImaginaryPart() {
        return imaginary;
    }

    public Complex add(Complex complex) {
        return new Complex(this.real + complex.real, this.imaginary + complex.imaginary);
    }

    public Complex subtract(Complex complex) {
        return new Complex(this.real - complex.real, this.imaginary - complex.imaginary);
    }

    public Complex multiply(Complex complex) {
        double newReal = this.real * complex.real - this.imaginary * complex.imaginary;
        double newImaginary = this.imaginary * complex.real + this.real * complex.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex divide(Complex complex) {
        double denominator = complex.real * complex.real + complex.imaginary * complex.imaginary;
        double newReal = (this.real * complex.real + this.imaginary * complex.imaginary) / denominator;
        double newImaginary = (this.imaginary * complex.real - this.real * complex.imaginary) / denominator;
        return new Complex(newReal, newImaginary);
    }

    public double abs() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public String toString() {
        if (imaginary == 0) {
            return String.format("%.1f", real);
        } else {
            return String.format("%.1f + %.1fi", real, imaginary);
        }
    }

    @Override
    public Complex clone() {
        return new Complex(this.real, this.imaginary);
    }

    @Override
    public int compareTo(Complex complex) {
        return Double.compare(this.abs(), complex.abs());
    }
}
    You can copy and run this code in your Java environment. The Complex class includes the required methods for addition, subtraction, multiplication, division, absolute value, and comparison based on absolute values. The Exercise13_17 class demonstrates the usage of the Complex class with a sample run.

        User
        solve in Java:The equation of a parabola can be expressed in either standard form (y = ax^2 + bx + c) or vertex form (y = a(x-h)^2 + k). Write a program that prompts the user to enter a, b, and c as integers in standard form and displays h and k in the vertex form.
        Use the template at https://liveexample.pearsoncmg.com/test/Exercise13_21_13e.txt for your code.
        Hint: Use the Rational class in LiveExample 13.13 for computing h and k.
        Sample Run 1
        Enter a, b, c: 1 3 1
        h is -3/2 k is -5/4
        Sample Run 2
        Enter a, b, c: 2 3 4
        h is -3/4 k is 23/8
        Class Name: Exercise13_21
        ChatGPT
        Certainly! Here's the Java code for the Exercise13_21 class that solves the given problem:

        java
        Copy code
        import java.util.Scanner;

public class Exercise13_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a, b, and c
        System.out.print("Enter a, b, c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Calculate h and k using Rational class
        Rational h = new Rational(-b, 2 * a);
        Rational k = new Rational(4 * a * c - b * b, 4 * a);

        // Display the result
        System.out.println("h is " + h + " k is " + k);
    }
}

class Rational extends Number implements Comparable<Rational> {
    private long numerator = 0;
    private long denominator = 1;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }

        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        long n = numerator * secondRational.getDenominator() +
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        long n = numerator * secondRational.getDenominator() -
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.numerator;
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator == 1)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object other) {
        return (this.subtract((Rational) (other))).getNumerator() == 0;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
}
    This program takes coefficients a, b, and c as input and calculates the vertex form h and k using the Rational class. The Rational class is used to handle rational numbers and arithmetic operations. The compareTo method is implemented for comparing rational numbers.

        User
        solve in java:Use the template at https://liveexample.pearsoncmg.com/test/Exercise13_19_13e.txt to write a program that prompts the user to enter a decimal number and displays the number in a fraction.
        Hint: read the decimal number as a string, extract the integer part and fractional part from the string, and use the Rational class in LiveExample 13.13 to obtain a rational number for the decimal number.
        Sample Run 1
        Enter a decimal number: 3.25
        The fraction number is 13/4
        Sample Run 2
        Enter a decimal number: -0.45452
        The fraction number is -11363/25000
        Class Name: Exercise13_19
        ChatGPT
        Certainly! Here's the Java code for the Exercise13_19 class that prompts the user to enter a decimal number and displays the number in fraction form using the Rational class:

        java
        Copy code
        import java.util.Scanner;

public class Exercise13_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        String decimalNumber = input.next();

        // Extract integer and fractional parts from the decimal number
        String[] parts = decimalNumber.split("\\.");
        String integerPart = parts[0];
        String fractionalPart = (parts.length > 1) ? parts[1] : "0";

        // Convert integer and fractional parts to Rational numbers
        Rational integerRational = new Rational(Long.parseLong(integerPart));
        Rational fractionalRational = new Rational(Long.parseLong(fractionalPart), Math.pow(10, fractionalPart.length()));

        // Combine the integer and fractional parts
        Rational result = integerRational.add(fractionalRational);

        // Display the fraction number
        System.out.println("The fraction number is " + result);
    }
}

class Rational extends Number implements Comparable<Rational> {
    private long numerator = 0;
    private long denominator = 1;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }

        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        long n = numerator * secondRational.getDenominator() +
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator == 1)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
}
    This program takes a decimal number as input, extracts the integer and fractional parts, and then converts them to Rational numbers. Finally, it displays the resulting fraction.

        User
        solve in java:Enter the first complex number: 3.5 5.5
        Enter the second complex number: -3.5 1
        (3.5 + 5.5i) + (-3.5 + 1.0i) = 0.0 + 6.5i
        (3.5 + 5.5i) - (-3.5 + 1.0i) = 7.0 + 4.5i
        (3.5 + 5.5i) * (-3.5 + 1.0i) = -17.75 -15.75i
        (3.5 + 5.5i) / (-3.5 + 1.0i) = -0.5094339622641509 -1.7169811320754718i
        |3.5 + 5.5i| = 6.519202405202649
        false
        3.5
        5.5
        [-3.5 + 1.0i, 4.0 + -0.5i, 3.5 + 5.5i, 3.5 + 5.5i]
        Class Name: Exercise13_17
        ChatGPT
        Certainly! Below is the Java code for the Exercise13_17 class that implements the required complex number operations:

        java
        Copy code
        import java.util.Scanner;

public class Exercise13_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first complex number
        System.out.print("Enter the first complex number: ");
        double a1 = input.nextDouble();
        double b1 = input.nextDouble();
        Complex complex1 = new Complex(a1, b1);

        // Prompt the user to enter the second complex number
        System.out.print("Enter the second complex number: ");
        double a2 = input.nextDouble();
        double b2 = input.nextDouble();
        Complex complex2 = new Complex(a2, b2);

        // Perform complex number operations
        System.out.println(complex1 + " + " + complex2 + " = " + complex1.add(complex2));
        System.out.println(complex1 + " - " + complex2 + " = " + complex1.subtract(complex2));
        System.out.println(complex1 + " * " + complex2 + " = " + complex1.multiply(complex2));
        System.out.println(complex1 + " / " + complex2 + " = " + complex1.divide(complex2));
        System.out.println("|" + complex1 + "| = " + complex1.abs());

        // Compare two complex numbers using their absolute values
        System.out.println(complex1.equals(complex2));

        // Display real and imaginary parts of the first complex number
        System.out.println(complex1.getRealPart());
        System.out.println(complex1.getImaginaryPart());

        // Test clone and equals
        Complex[] array = {new Complex(-3.5, 1), new Complex(4.0, -0.5), complex1, complex1.clone()};
        System.out.println(Arrays.toString(array));
    }
}

class Complex implements Cloneable {
    private double real;
    private double imaginary;

    public Complex() {
        this(0, 0);
    }

    public Complex(double real) {
        this(real, 0);
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getRealPart() {
        return real;
    }

    public double getImaginaryPart() {
        return imaginary;
    }

    public Complex add(Complex complex) {
        return new Complex(this.real + complex.real, this.imaginary + complex.imaginary);
    }

    public Complex subtract(Complex complex) {
        return new Complex(this.real - complex.real, this.imaginary - complex.imaginary);
    }

    public Complex multiply(Complex complex) {
        double newReal = this.real * complex.real - this.imaginary * complex.imaginary;
        double newImaginary = this.imaginary * complex.real + this.real * complex.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex divide(Complex complex) {
        double denominator = complex.real * complex.real + complex.imaginary * complex.imaginary;
        double newReal = (this.real * complex.real + this.imaginary * complex.imaginary) / denominator;
        double newImaginary = (this.imaginary * complex.real - this.real * complex.imaginary) / denominator;
        return new Complex(newReal, newImaginary);
    }

    public double abs() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public String toString() {
        if (imaginary == 0) {
            return String.format("%.1f", real);
        } else {
            return String.format("%.1f + %.1fi", real, imaginary);
        }
    }

    @Override
    public Complex clone() {
        return new Complex(this.real, this.imaginary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Complex complex = (Complex) obj;

        return Double.compare(complex.real, real) == 0 &&
                Double.compare(complex.imaginary, imaginary) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(real);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(imaginary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
    This code allows the user to input two complex numbers and performs various operations on them as described in the prompt. The Complex class represents complex numbers and includes methods for addition, subtraction, multiplication, division, absolute value, toString, clone, equals, and hashCode. The Exercise13_17 class demonstrates the usage of the Complex class with a sample run.

        User
        solve in java:(Convert decimals to fractions)
        Use the template at https://liveexample.pearsoncmg.com/test/Exercise13_19_13e.txt to write a program that prompts the user to enter a decimal number and displays the number in a fraction.
        Hint: read the decimal number as a string, extract the integer part and fractional part from the string, and use the Rational class in LiveExample 13.13 to obtain a rational number for the decimal number.
        Sample Run 1
        Enter a decimal number: 3.25
        The fraction number is 13/4
        Sample Run 2
        Enter a decimal number: -0.45452
        The fraction number is -11363/25000
        Class Name: Exercise13_19
        For a hint on this program, please see https://liveexample.pearsoncmg.com/java13e.html. If you get a logic or runtime error, please refer to https://liveexample.pearsoncmg.com/faq.html
        ChatGPT
        Certainly! Here's the Java code for the Exercise13_19 class that converts decimals to fractions using the Rational class:

        java
        Copy code
        import java.util.Scanner;

public class Exercise13_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        String decimalNumber = input.next();

        // Convert decimal to fraction using Rational class
        Rational rationalNumber = convertToFraction(decimalNumber);

        // Display the fraction number
        System.out.println("The fraction number is " + rationalNumber);
    }

    private static Rational convertToFraction(String decimalNumber) {
        // Extract integer and fractional parts from the decimal number
        String[] parts = decimalNumber.split("\\.");
        String integerPart = parts[0];
        String fractionalPart = (parts.length > 1) ? parts[1] : "0";

        // Calculate the number of decimal places
        int decimalPlaces = fractionalPart.length();

        // Convert integer and fractional parts to Rational numbers
        Rational integerRational = new Rational(Long.parseLong(integerPart));
        Rational fractionalRational = new Rational(Long.parseLong(fractionalPart), (long) Math.pow(10, decimalPlaces));

        // Combine the integer and fractional parts
        return integerRational.add(fractionalRational);
    }
}

class Rational extends Number implements Comparable<Rational> {
    private long numerator = 0;
    private long denominator = 1;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }

        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        long n = numerator * secondRational.getDenominator() +
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator == 1)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
}
    This program takes a decimal number as input, extracts the integer and fractional parts, and then converts them to Rational numbers. Finally, it displays the resulting fraction. The Rational class is used to handle rational numbers and arithmetic operations.

        User
        solve in java:(Days of a month)
        Write a program that prompts the user to enter a year and the first three letters of a month name (with the first letter in uppercase) and displays the number of days in the month.
        If the input for month is incorrect, display a message as shown in the following sample run.
        Sample Run 1
        Enter a year: 2001
        Enter a month: Jan
        Jan 2001 has 31 days
        Sample Run 2
        Enter a year: 2016
        Enter a month: Feb
        Feb 2016 has 29 days
        Sample Run 3
        Enter a year: 2016
        Enter a month: jan
        jan is not a correct month name
        Class Name: Exercise04_17
        ChatGPT
        Certainly! Here's the Java code for the Exercise04_17 class that prompts the user to enter a year and the first three letters of a month name and displays the number of days in the month:

        java
        Copy code
        import java.util.Scanner;

public class Exercise04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Prompt the user to enter a month
        System.out.print("Enter a month: ");
        String month = input.next();

        // Check the validity of the month and display the result
        if (isValidMonth(month)) {
            int daysInMonth = getDaysInMonth(year, month);
            System.out.println(month + " " + year + " has " + daysInMonth + " days");
        } else {
            System.out.println(month + " is not a correct month name");
        }
    }

    private static boolean isValidMonth(String month) {
        // Check if the month is one of the valid month names
        String[] validMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (String validMonth : validMonths) {
            if (month.equalsIgnoreCase(validMonth)) {
                return true;
            }
        }
        return false;
    }

    private static int getDaysInMonth(int year, String month) {
        // Array to store the number of days in each month
        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Get the index of the month and return the corresponding number of days
        int monthIndex = getMonthIndex(month);
        return daysInMonth[monthIndex];
    }

    private static boolean isLeapYear(int year) {
        // Check if the year is a leap year
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int getMonthIndex(String month) {
        // Get the index of the month in the array
        String[] validMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < validMonths.length; i++) {
            if (month.equalsIgnoreCase(validMonths[i])) {
                return i;
            }
        }
        return -1; // Return -1 if the month is not found (this should not happen with the current program logic)
    }
}
    This program checks if the entered month is valid and then calculates and displays the number of days in that month for the given year. The isValidMonth method checks if the entered month is one of the valid month names, and the getDaysInMonth method calculates the number of days based on the month and the leap year status.

        User
        solve in java:(Count vowels and consonants)
        Assume letters A/a, E/e, I/i, O/o, and U/u as the vowels.
        Write a program that prompts the user to enter a string and displays the number of vowels and consonants in the string.
        Sample Run
        Enter a string: Programming is fun
        The number of vowels is 5
        The number of consonants is 11
        Class Name: Exercise05_49
        ChatGPT
        Certainly! Here's the Java code for the Exercise05_49 class that counts vowels and consonants in a given string:

        java
        Copy code
        import java.util.Scanner;

public class Exercise05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();


        int vowelCount = 0;
        int consonantCount = 0;


        str = str.toLowerCase();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }


        System.out.println("The number of vowels is " + vowelCount);
        System.out.println("The number of consonants is " + consonantCount);
    }
}