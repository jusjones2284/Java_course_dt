import java.util.Scanner;

public class SentienelValue {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        char continueLoop = 'Y';
//
//        while (continueLoop == 'Y'){
//
//            System.out.println("Enter Y to continue and N to quit: ");
//            continueLoop = input.getLine().charAt(0);
//        }

        Scanner scan = new Scanner(System.in);

        System.out.println("input your age: ");

        while (!scan.hasNextInt()){
            scan.next();
            System.out.println("incorrect! please enter an integer!");
        }

        int age = scan.nextInt();

        System.out.println("You are " + age);
//
//
    }


}
