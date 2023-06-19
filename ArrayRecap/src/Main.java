// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] myArray = {10, 35, 20, 17, 18};

        for(int i = 0; i < myArray.length; i++){
            System.out.println("Value = " + myArray[i]);
        }

        //Enhanced for Loop
        int[] myArrays = {10, 35, 20, 17, 18};
        for(int myInt : myArrays){
            System.out.println("value = " + myInt);
        }

        //Traditional for loop
        int[] myArrayss = {10, 35, 20, 17, 18};
        for(int i = 0; i < myArrayss.length; i++){
            System.out.println("value = " + myArrayss[i]);
        }
    }

    int [] array = new int[5];
    int [] myNumbers = {5,4,3,2,1};


}