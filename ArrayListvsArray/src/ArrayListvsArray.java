import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListvsArray {

    public static void main(String[] args) {
        //Array Creating an array
        String [] a = new String[2];
        a[0] = "hello";
        a[1] = "world";
        System.out.println(a[1]);
        System.out.println(a.length);
        Arrays.sort(a);

        //ArrayList
        ArrayList<String> b = new ArrayList<>();
        b.add("Hello");
        b.add("World love you");
        b.add("what going on");
        b.get(1);
        b.set(2, "love you");
//        b.remove(1);
//        b.remove("whats going on");
//        b.clear();

        String [] anotherArray = new String[b.size()];
        b.toArray(anotherArray);


        Collections.sort(b);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(9);
        c.add(3);
        c.add(10);
        c.add(1);
        c.add(595);
       c.remove(Integer.valueOf(3)) ;

       Integer [] array1 = new Integer[c.size()];
       c.toArray(array1);
        System.out.println(c[1]);

       String [] array = {"red", "green", "blue"};
       ArrayList<String> conversion = new ArrayList<>(Arrays.asList(array));
       ArrayList<String> conversions = new ArrayList<>(Arrays.asList(array));

        for(Integer f: c){
            System.out.print(f + " ");
        }

        for(Integer z: c){
            System.out.println(z);
        }





       for(int i = 0; i < a.length; i++){
           System.out.print(a[i] + " ");

        }

       for (int i = 0; i < b.size(); i++){
           System.out.println(b.get(i));
       }


       Integer [] arrays = {3, 5, 95, 4, 15, 34, 3, 6, 5};
       ArrayList<Integer> jmj = new ArrayList<>();
       Arrays.asList(arrays);
       Collections.sort(jmj);

       Integer [] blackArrays = {3, 5, 95, 4, 15, 34, 3, 6, 5};
       ArrayList<Integer> blackArrays1 = new ArrayList<>();
       Arrays.asList(blackArrays1);
       Collections.min(blackArrays1);
       Collections.max(blackArrays1);

       Integer [] blackArrays2 = {3, 5, 95, 4, 15, 34, 3, 6, 5};
       ArrayList<Integer> blackArrays3 = new ArrayList<>();
       Arrays.asList(blackArrays3);
       Collections.shuffle(blackArrays3);
    }




}
