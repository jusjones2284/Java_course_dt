package dev.lpa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String [] originalArray = new String[] {"First", "Second", "Third"};
        String [] duplicateArray = new String[] {"fourth", "fifth", "sixth"};
        System.out.println(Arrays.toString(originalArray));

        var originalList = Arrays.asList(originalArray);
        var duplicateList = Arrays.asList(duplicateArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);



    }
}