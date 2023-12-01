//public record Teacher(String name, int employeeNumber) {
//
//    public static final String DEFAULT_EMPLOYEE_NAME = "George";
//
//    public Teacher(String name, int employeeNumber){
//        if(employeeNumber < 0){
//            throw new IllegalArgumentException("employeeNumber cannot be negative");
//        }
//
//        this.name =name;
//        this.employeeNumber = employeeNumber;
//    }
//
//    public String nameInUpperCase(){
//        return name.toUpperCase();
//    }
//
//    public static void printWhatever(){
//        System.out.println("Whatever");
//    }
//}

// Example usage
import java.util.Scanner;

public class Exercise12_08Extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int userValue = input.nextInt();

        try {
            EvenNumber evenNumber = new EvenNumber(userValue);
            System.out.println("Current number is " + evenNumber.getValue());
            System.out.println("Next even number is " + evenNumber.getNext().getValue());
            System.out.println("Previous even number is " + evenNumber.getPrevious().getValue());
        } catch (RuntimeException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}

class EvenNumber {
    private int value;

    public EvenNumber() {
        this(0);
    }

    public EvenNumber(int value) {
        if (value % 2 != 0) {
            throw new RuntimeException("value not even");
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public EvenNumber getNext() {
        return new EvenNumber(value + 2);
    }

    public EvenNumber getPrevious() {
        if (value > 0) {
            return new EvenNumber(value - 2);
        } else {
            throw new RuntimeException("No previous even number for 0");
        }
    }
}