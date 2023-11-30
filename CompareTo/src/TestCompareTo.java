import java.math.BigInteger;
import java.util.Arrays;
import java.util.Date;

public class TestCompareTo {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(9).compareTo(Integer.valueOf(20)));
        System.out.println(String.valueOf('c').compareTo(String.valueOf('d')));
        System.out.println("ABC".compareTo("ABC"));
        Date date1 = new Date(2321);
        Date date2 = new Date(2311);
        System.out.println(date2.compareTo(date1)); ;
        String s = "hello";

        String [] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        String [] states = {new String("Louisana"), new String("Georgia"), new String("California"),
        new String("New York")
        };
        Arrays.sort(states);
        for (String state: states){
            System.out.println("testing somehting out " + state.startsWith("L"));
        }

        Arrays.sort(cities);
        for(int i = 0; i < cities.length ; i++){
            System.out.println(cities[i]);
        }

        for(String city: cities){
            System.out.print(city + " ");
            System.out.println();
        }

        BigInteger [] hugeNumbers = {new BigInteger("900"), new BigInteger("500"),
                new BigInteger("85"), new BigInteger("656")};
        Arrays.sort(hugeNumbers);
        System.out.println(hugeNumbers[hugeNumbers.length - 1]);

        for(BigInteger newNum: hugeNumbers){
            System.out.println(newNum);
        }



    }
}
