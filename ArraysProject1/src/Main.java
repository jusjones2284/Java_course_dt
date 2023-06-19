import java.util.Arrays;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int [] myIntArray = new int[10];
        myIntArray[0] = 12;
        myIntArray[5] = 50;
        myIntArray[1] = 15;

        double [] myDoubleArray = new double[10];
        myDoubleArray[3] = 20.00;
        System.out.println(myDoubleArray[3]);

        int [] firstFivePositives = new int[]{1, 2, 3, 4, 5};
        double [] secondFivePositives;
        secondFivePositives = new double[]{20.00, 30.52, 65.33, 90.52};
        System.out.println(secondFivePositives[2]);

        int [] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last element: " + firstTen[arrayLength - 1]);

        int [] newArray;
        newArray = new int []{5, 4, 3, 2, 1};

        int [] anotherNewArray;
        anotherNewArray = new int[]{10, 9, 8, 7, 6, 5, 4};

        int [] newArrays;
        newArrays = new int[]{5, 4, 3, 2, 6};
        for(int i = 0; i < newArrays.length; i++){
            System.out.println((newArrays[i]) + "");
        }

        System.out.println();
        for(int element: newArrays){
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(newArrays));

        Object [] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArrays;
    }
}