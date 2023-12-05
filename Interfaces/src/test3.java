import java.util.Scanner;
public class test3 {

import java.util.Scanner;

    public class PFinal2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer for hours: ");
            int hours = scanner.nextInt();

            System.out.print("Enter a Boolean value for isTicking: ");
            boolean isTicking = scanner.nextBoolean();

            System.out.print("Enter an integer for diff: ");
            int diff = scanner.nextInt();

            Clock myClock = new Clock(hours, isTicking, diff);

            System.out.println(myClock);

            myClock.increment();
            myClock.increment();
            myClock.decrement();

            System.out.println(myClock);

        }
    }
}
class Clock {
    private int hours;
    private boolean isTicking;
    private int diff;

    public Clock(int hours, boolean isTicking, int diff) {
        this.hours = hours;
        this.isTicking = isTicking;
        this.diff = diff;
    }

    public void increment() {
        if (hours < 12) {
            hours++;
        }
    }

    public void decrement() {
        if (hours > 0) {
            hours--;
        }
    }

    @Override
    public String toString() {
        return "hours: " + hours + " isTicking: " + isTicking + " diff: " + diff;
    }
}