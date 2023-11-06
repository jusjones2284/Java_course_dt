import java.math.*;
public class Exercise10_17 {
    public static void main(String[] args) {
        final BigInteger MAXLONG = new BigInteger(Long.MAX_VALUE + "");
        BigInteger n = new BigInteger("" + (long)(Math.sqrt(Long.MAX_VALUE)));
        for ( ; n.multiply(n).compareTo(MAXLONG) < 0;
              n = n.add(BigInteger.ONE));
        for (int i = 0; i < 10; i++) {
            System.out.println(n.multiply(n));
            n = n.add(BigInteger.ONE);
        }
    }
}