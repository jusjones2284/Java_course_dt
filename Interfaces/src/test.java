import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
//        System.out.println("abc".compareTo("aba"));
////
////        int[] list = new int[5];
////        list = new int[6];
//
//        int[] list1 = {1, 2, 3};
//        int[] list2 = {1, 2, 3};
//        list2 = list1;
//        list1[0] = 0; list1[1] = 1; list2[2] = 2;
//
//        for (int i = 0; i < list1.length; i++)
//            System.out.print(list1[i] + " ");

//        String s1 = "Welcome to Java!";
//        String s2 = "Welcome to Java!";
//
//        if (s1 == s2)
//            System.out.println(
//                    "s1 and s2 reference the same String object");
//        else
//            System.out.println(
//                    "s1 and s2 reference different String objects");

//        new Person().printPerson();
//        new Student().printPerson();

//        File file = new File("input.txt");
//        try (Scanner input = new Scanner(file);) {
//            String line = input.nextLine();
//        }

        Number x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println(x.compareTo(new Integer(4)));


    }
}

class Student extends Person {
    private String getInfo() {
        return "Student";
    }
}

class Person {
    private String getInfo() {
        return "Person";
    }

    public void printPerson() {
        System.out.println(getInfo());
    }
}