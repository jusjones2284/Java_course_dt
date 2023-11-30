import java.util.ArrayList;
import java.util.Arrays;

public class TestCloneArrayList {
    public static void main(String[] args) {
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(1.5);
        list1.add(8.7);
        list1.add(3.5);
        list1.add(43.44);

        String [] y = {"berk", "bark", "ash"};
        Arrays.sort(y);
        System.out.println(y[0]);

        ArrayList<Double> list2 = (ArrayList<Double>) list1.clone();
        ArrayList<Double> list3 = list1;
        list2.add(5.66);
        list3.remove(43.44);

        System.out.println("list1 is " + list1);
        System.out.println("list2 is " + list2);
        System.out.println("list3 is " + list3);

        for(Double x : list2){
            System.out.println(x);
        }

        int [] list10 = {1, 2};

        System.out.println(Arrays.toString(list10));

        int[] list50 = {1,2};
        int[] list51 = list50.clone();
        list50[0] = 7;
        list51[1] = 10;

        System.out.println("list50 is " + list50[0]);
        System.out.println("list51 is " + list51[1]);


    }

//    class ArrayDemo{
//
//        public static Integer[] addX(Integer myArray[], int x){
//            int i;
//
//            ArrayList arrList = new ArrayList(Arrays.asList(myArray));
//
//            arrList.add(x);
//
//            myArray = arrList.toArray(myArray);
//        }
//    }
}
