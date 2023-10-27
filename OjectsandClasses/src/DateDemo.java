import java.security.SecureRandom;
import java.util.Date;
import java.util.Random;

public class DateDemo {


    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("The elapsed time since Jan 1, 1970" + date.getTime());
        System.out.println(date.toString());
        Random whatEver = new Random()
        ;
        System.out.println(whatEver.nextInt(50));

        for(int i = 0; i < 10; i++){
            System.out.println(whatEver.nextInt(30));
        }

        SecureRandom betterRandom = new SecureRandom();
    }
}
