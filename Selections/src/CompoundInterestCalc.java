import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompoundInterestCalc {

    private static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
    private static final NumberFormat percentFormatter = NumberFormat.getPercentInstance();

    public static void main(String[] args) throws ParseException {

        //        CompoundInterestCalc calc = new CompoundInterestCalc();
        BigDecimal balance = CompoundInterestCalc.calculate("10000.00", "8%", 10, "1000");
        System.out.println(moneyFormatter.format(balance));


    }

    public static BigDecimal calculate(String principal, String rate, int period, String contribution) throws ParseException {
        //Balance(Y) = P(1 + r)Y + c[ (1 + r)Y - 1) / r ]
        String rateAsPercent= percentFormatter.parse(rate).toString();
        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rateAsPercent)).pow(period); //(1 + r)^period
//        BigDecimal b = a.multiply(new BigDecimal(period)); // (1 + r)
        BigDecimal c = a.subtract(BigDecimal.ONE); // ((1 + r)^Y - 1)
        BigDecimal d = c.divide(new BigDecimal(rate)); //(1 + r)^Y - 1) / r
        BigDecimal e = d.multiply(new BigDecimal(moneyFormatter.parse(contribution).toString()));


        BigDecimal f = new BigDecimal(principal).multiply(a).multiply(new BigDecimal(period));
        BigDecimal j = a.multiply(new BigDecimal(principal));

        BigDecimal total = j.add(e);
        return  total;




    }
}
