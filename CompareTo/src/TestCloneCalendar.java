import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCloneCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2013,2, 1);
        Calendar calendar1 = calendar;

        Calendar calendar2 = (Calendar) calendar.clone();
        System.out.println(calendar1 == calendar);
        System.out.println(calendar2 == calendar);
        System.out.println(calendar2.equals(calendar));

    }
}
