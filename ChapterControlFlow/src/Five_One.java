import java.util.Scanner;

public class Five_One {

    public static void main(String[] args) {
//        int count = 0;
//        while(count < 100){
//            System.out.println("Welcome to Java!" + " "  + count);
//            count = count + 5;
//        }
//
//        int sum  = 0, i = 1;
//        while (i < 10){
//            sum = sum + 1;
//            i++;
//        }
//        System.out.println("sum is " + sum);
//
//        int counts = 1;
//        while (counts <= 100){
//            System.out.println("Welcome to Java" + " " + count);
//        }


//        char continueLoop = 'Y';
//        while (continueLoop == 'Y'){
//            System.out.print("Enter Y to continue and N to quit: ");
//            continueLoop = input.getLine().charAt(0);
//        }

        Scanner input = new Scanner(System.in);

//        System.out.print("Enter an integer (the input ends if it is 0): ");
//        int data = input.nextInt();
//        int sum = 0;
//
//        while(data != 0){
//            sum += data;
//            System.out.print("Enter an integer (the input ends if its is 0):");
//            data = input.nextInt();
//        }
//
//        System.out.println("The sum is " + sum);

        int data;
        int sum = 0;

        do {
            System.out.print("Enter an integer (the input ends if it is 0) : ");
             data = input.nextInt();
             sum += data;
        }while (data != 0);

        System.out.println("the sum is " + sum);

        int count = 0;
        do{
            System.out.println("Welcome to Java! ");
            count++;
        } while (count < 100);


    }
}
