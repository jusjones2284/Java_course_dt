import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);

        System.out.println("Guess a magic number between 0 and 100");

        int guess = -1;

        while (guess != number){

            System.out.print("\n enter your guess: ");
            guess = input.nextInt();

            if(guess == number){
                System.out.println(" You got it right!");
            } else if (guess > number){
                System.out.println("Your guess is too high!");
            } else
                System.out.println("Your guess is too low!");
        }
        System.out.println("Game over");

        int num =(int) (Math.random() * 101);

        Scanner inputs = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        System.out.print("\nEnter your guess: ");
        int guesses = inputs.nextInt();

        if (guesses == num){
            System.out.println("Yes, the number is " + number);
        } else if (guesses > num) {
            System.out.println("Your guess is too high");

        }else {
            System.out.println("Your guess is too low");
        }

        while (guess != num){

            System.out.println("\nEnter your guess: ");
            guesses = inputs.nextInt();

            if (guess == number){
                System.out.println("Yes, the number is " + num);
            } else if (guess > number) {
                System.out.println("Number too high");
            } else System.out.println("Your guess is too low");
        }



    }

}
