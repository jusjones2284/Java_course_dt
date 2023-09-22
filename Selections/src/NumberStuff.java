import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class NumberStuff {
    public static void main(String[] args) {
        float num1 = 2.15f;
        float num2 = 1.10f;
        System.out.println(num1 - num2);

        MathContext mc = new MathContext(5, RoundingMode.HALF_UP);
        System.out.println(new BigDecimal(".054798").sqrt(mc));
        System.out.println(new BigDecimal("7").max(new BigDecimal("15")));
        System.out.println(new BigDecimal("5451.45").multiply(new BigDecimal("123123")));

        BigDecimal num3 = new BigDecimal("2.15");
        BigDecimal num4 = new BigDecimal("1.10");

        System.out.println(num3.subtract(num4));
        System.out.println(num3.multiply(num4));

        System.out.println(new BigDecimal(".3145645").multiply(new BigDecimal(".344319")));
        System.out.println(new BigDecimal(".789798").add(new BigDecimal(".456478")));
        System.out.println(new BigDecimal(".1564564").divide(new BigDecimal("5.564"), mc));

        BigDecimal num10 = new BigDecimal(465456.55f);

        System.out.println();

        byte myByte = 100;
        BigDecimal num18 =  new BigDecimal(myByte);
        byte b = num18.byteValue();

        BigInteger myInt = new BigInteger("4546456");



    }
}
