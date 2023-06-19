package dev.lpa;

import java.util.Arrays;
import java.util.Random;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int [] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));


    }

    public static int[] getRandomArray(int len){

        Random random = new Random();
        int [] randomArray = new int[len];
        for(int i = 0; i < len; i++){
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }
}