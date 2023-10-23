import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);

//        int count = 1;
//        do {
//            count += 3;
//            System.out.println(count);
//        } while (count < 5);
//
//        System.out.println(count);

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int max = number;

        do{
            number = input.nextInt();
            if(number > max)
                max = number;
        } while (number != 0);

        System.out.println("max is " + max);
        System.out.println("number " + number);

        int i;
        for(i = 0; i < 100; i++){
            System.out.println("Welcome to Java! ");
        }

        for (int k = 0, j = 0; i + j < 10; i++, j++){

        }




    }
}
