import business.Company;
public class Person {
    //constant
    private String middleName = "Mickal";
    public static double PIs = 3.14;
    private final double PI = 3.14;
    private final String MY_BIG_CONSTANT = "Hi, this is my constant message";
    private String firstName = "Jerry";
    private int age;
    private long id;
    private char middleInitial = 'J';
    private byte myByte;
    //new keyword - creating a instance of company
    static private Company company = new Company();
    private NewsAgency agency;
    public static int[] nums = initNums();
    public static int[] nums2;

    static {
        nums2 = new int[5];
        nums2[0] = 3;
        nums2[1] = 3;
        nums2[2] = 3;
        nums2[3] = 3;
        nums2[4] = 3;
    }

    public static int[] initNums(){
        int[] nums2 = new int[5];
        nums2[0] = 3;
        nums2[1] = 3;
        nums2[2] = 3;
        nums2[3] = 3;
        nums2[4] = 3;
        return nums2;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String message) {
        System.out.println(message + " this is my message");
    }

    public char getMiddleInitial(){
        return middleName.charAt(0);
    }
    public int add(int num1, int num2){
        int total = num1 + num2;
        return total;
    }
    public void test(int num1, int num2, String[] args){
        //do something clever
    }

    public void test2(int num, int num2, String... words){
        //do something clever
        System.out.println(words[1]);
        System.out.println("number of arguments" + " " + words.length );
    }

    public void test3(int num1, int num2, int... numbers){

    }






    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sayHello();
        p1.saySomething("my name is Justin");
        System.out.println(p1.getMiddleInitial());
        System.out.println(p1.add(5,10));
        char middleInital = p1.getMiddleInitial();
        System.out.println(middleInital);
        Person p2 = new Person();
        String [] writer = {"here", "there"};
        String[] words = new String[]{"one", "two", "three"};
        p2.test(12,13, new String[] {"one", "two", "three"});
        p1.test(1,2 , words);
        p1.test2(1, 3, writer);
        System.out.println(PIs);

    }
}
