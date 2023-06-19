package dev.lpa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class MoreLists {

    public static void main(String[] args) {

        String [] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        System.out.println(list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickels", "mustards", "cheese", "cheese", "eggs")
        );
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third item = " + groceries.get(2));

        if(groceries.contains("mustard")){
            System.out.println("List contains mustard");
        } else {
            System.out.println("justin you will be a software then cloud engineer!");
        }

        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        //Instantiating Arrays
        String[] array = new String[10];
        String[] arrays;
        arrays = new String [] {"first", "second", "third"};
        System.out.println(arrays[1]);

        //anonymous array
        String [] jayArray = {"first", "second", "new", "old"};
        System.out.println("testing array" + (jayArray.length - 1) );
        Arrays.sort(jayArray);
        System.out.println(jayArray);



        //Instantiating ArrayLists
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> newArrayList = new ArrayList<>(List.of("first", "second", "third"));
        ArrayList<String> thirdNewArray = new ArrayList<>(List.of(jayArray));
        System.out.println(thirdNewArray);
        System.out.println( thirdNewArray.size() -1);
        int elementCount = thirdNewArray.size();
        System.out.println(elementCount);
        thirdNewArray.set(0, "hello");
        System.out.println(thirdNewArray);

        thirdNewArray.sort(Comparator.naturalOrder());
        thirdNewArray.sort(Comparator.reverseOrder());





    }
}
