
import java.util.Scanner;
public class Exercise04_21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a Social Security number
        System.out.print("Enter a SSN: ");
        String s = input.nextLine();

        // Check whether the input is valid
        boolean isValid =
                (s.length() == 11) &&
                        (Character.isDigit(s.charAt(0))) &&
                        (Character.isDigit(s.charAt(1))) &&
                        (Character.isDigit(s.charAt(2))) &&
                        (s.charAt(3) == '-') &&
                        (Character.isDigit(s.charAt(4))) &&
                        (Character.isDigit(s.charAt(5))) &&
                        (Character.isDigit(s.charAt(7))) &&
                        (s.charAt(6) == '-') &&
                        (Character.isDigit(s.charAt(8))) &&
                        (Character.isDigit(s.charAt(9))) &&
                        (Character.isDigit(s.charAt(10)));

        // Display result
        System.out.println(s + " is " + ((isValid) ? "a valid " : "an invalid ")
                + "social security number");
    }
    }

