import java.util.Scanner;

public class PrintCalendar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the full year: ");
        int year = input.nextInt();
        System.out.print("Enter the month: ");
        int month = input.nextInt();
        printMonth(year, month);
    }

    public static void  printMonth(int year, int month){
        System.out.print(month + " " + year );
    }

    public static void printMonthTitle(int year, int month){
        System.out.println(getMonthName(month) + " " + year);
    }

    public static String getMonthName(int month){
        if(month == 1){
            return "January";
        }

    }


}
