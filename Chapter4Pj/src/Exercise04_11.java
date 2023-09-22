import java.util.Scanner;

public class Exercise04_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal value (0 to 15): ");
        int dv = input.nextInt();

        if(dv > 15 || dv < 0){
            System.out.println(dv + " is an invalid input");
        } else if (dv < 10) {
            System.out.println("The hex value is " + dv);
        } else System.out.println("The hex value is " + (char)('A' + dv - 10));

    }
}
