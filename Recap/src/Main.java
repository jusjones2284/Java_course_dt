import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String [] array = new String[]{"first", "second", "third"};
        String [] arrays = {"frist", "second", "thrid"};
        System.out.println( arrays.length);
        arrays[0] = "one";
        System.out.println(arrays);
        String element = arrays[0];
        String [] anotherArray = {"fourth", "fifth", "sixth"};
        System.out.println(Arrays.toString(anotherArray));



        ArrayList<String> arrayList = new ArrayList<>(List.of("first", "second", "third"));
        System.out.println(arrayList.size() - 1);
        arrayList.set(0, "one");
        String elements = arrayList.get(0);

        ArrayList<String> arraysList = new ArrayList<>(List.of("eighth", "nineth", "tenth"));
        System.out.println(arraysList);

        String [] originalArray = new String[]{"first", "second", "third"};
        var orginalList = Arrays.asList(originalArray);

        orginalList.set(0, "two");
        System.out.println("list: " + orginalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);
    }
}