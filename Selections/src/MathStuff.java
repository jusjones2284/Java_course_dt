import java.security.SecureRandom;
import java.util.Random;

public class MathStuff {
    public static void main(String[] args) {

//        System.out.println(Math.ceil(5.0));
//        System.out.println(Math.floor(5.6));
//        System.out.println(Math.abs(-5));
//        int num1 =3;
//        int num2 =6;
//        System.out.println(Math.min(num2, num1));
//        System.out.println(Math.max(num1, num2));
//        System.out.println((int)Math.pow(2,4));
//        System.out.println((int)(Math.random() * 10));
//        System.out.println(Math.round(5.8));
//
//        Random random = new Random();
//        System.out.println(random.nextInt(10));
//        System.out.println(random.nextBoolean());
//        System.out.println(random.nextFloat());
//
//        SecureRandom randoms = new SecureRandom();
//        System.out.println(randoms.nextInt(10));

//        System.out.println(Math.getExponent());

        System.out.println(calcAreaOfCircle(3));




    }

    /**
     * this method calculates the area of a circle
     * it uses the formula: area = PI * radius^
     * @param radius
     * @return
     */

    public static double calcAreaOfCircle(double radius){

        return Math.PI * Math.pow(radius, 2);
    }
}
