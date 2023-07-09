import business.Company;
public class Person {
    //constant
    private String middleName = "Mickal";
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

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sayHello();
        p1.saySomething("my name is Justin");
        System.out.println(p1.getMiddleInitial());
        System.out.println(p1.add(5,10));
        char middleInital = p1.getMiddleInitial();
        System.out.println(middleInital);
        Person p2 = new Person();

    }
}
