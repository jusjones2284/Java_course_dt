import java.io.File;
import java.util.Scanner;

public class ReadData1 {

    public static void main(String[] args) throws Exception {
        File file = new File("thirdTestFile");

        Scanner input = new Scanner(file);
        while (input.hasNext()){
            String firstName = input.next();
            String mI = input.next();
            String lastName = input.next();
//            int prefix = input.nextInt();

            System.out.println(firstName + " " + mI + " " + lastName );
        }
    }

    // to read from a keyboard Scanner input = new Scanner();
    //Scanner input =  new Scanner(new File())
}
