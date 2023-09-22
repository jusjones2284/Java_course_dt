import java.util.Scanner;

public class Exercise04_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();


        System.out.print("Enter the length of the side: ");
        double sideLength = input.nextDouble();


        double area = calcPolyArea(numberOfSides, sideLength);


        System.out.println("The area of the polygon is " + area);
    }

    public static double calcPolyArea(int numberOfSides, double sideLength) {
        double numerator = numberOfSides * Math.pow(sideLength, 2);
        double denominator = 4 * Math.tan(Math.PI / numberOfSides);
        return numerator / denominator;
    }
}
