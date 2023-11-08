public class Demo {
    public static void main(String[] args) {
        Student a = new Student("Mary", 19, 1122);
        Student b = new Student("Mary", 19, 1234);

        if(a.equals(b))
            System.out.println("they are equal");
        else
            System.out.println("not equal");
    }
}
