import java.util.Arrays;
import java.util.Random;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);
        var allDays = DayOfTheWeek.values();
        System.out.println(Arrays.toString(allDays));
        System.out.println(allDays[1]);


        for (int i = 0; i < 10; i++ ) {
            weekDay = getRandomDay();

            System.out.printf("Name is %s, Ordinal Value = %d%n",
                    weekDay.name(), weekDay.ordinal());

//            if (weekDay == DayOfTheWeek.FRI) {
//                System.out.println("Found a Friday!!!");
//            }

        }

        for(int i = 0; i < 10; i++){
            weekDay = getRandomDay();

            System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());

            if(weekDay == DayOfTheWeek.TUES){
                System.out.println("found tuesday!!");
            }

        }
    }



    public static DayOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }

    public static DayOfTheWeek getRandomDays(){

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }

}