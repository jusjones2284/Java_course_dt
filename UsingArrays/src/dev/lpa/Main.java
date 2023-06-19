package dev.lpa;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int [] firstArray =  getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int [] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 10);
        System.out.println(Arrays.toString(secondArray));

        int [] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int [] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int [] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Mark") >= 4){
            System.out.println("Found Mark in the list");
        }else {
            System.out.println("Mark is not on the list");
        }

        String[] jArray = {"Justin", "Jason", "Brandon", "Jon", "Frank"};
        Arrays.sort(jArray);
        System.out.println(Arrays.toString(jArray));
        if(Arrays.binarySearch(jArray, "Jon") >= 4){
            System.out.println("Jon has been found");
        }

        String [] kArray = {"karice", "Megan", "Jacob", "Rose"};
        Arrays.sort(kArray);
        System.out.println(Arrays.toString(kArray));
        if(Arrays.binarySearch(jArray, "karice") >= 0){
            System.out.println("Found Karice in the list");
        }


        int [] s1 = {1, 2, 3, 4, 5};
        int [] s2 = {1, 2, 3, 4, 5};

        if(Arrays.equals(s1, s2)){
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

    }

   

    private static int [] getRandomArray(int len){

        Random random = new Random();
        int [] newInt = new int[len];
        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}