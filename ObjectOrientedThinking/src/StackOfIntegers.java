public class StackOfIntegers {

    private int[] elements;
    private int size;

    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers(){
        this(DEFAULT_CAPACITY);

    }

    public StackOfIntegers(int capacity){
        elements = new int[capacity];
    }

    public boolean empty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public int peek(){
        return elements[size -1];
    }
    int num3 = 10;
    Integer num5 = new Integer(num3); //boxing
    Integer num1 = new Integer(8);
    Integer num2 = 9;

    Integer num6 = num3; //autoboxing

    int num7 = num6;//auto unboxing
    double j = 10.00;
    Double x10 = 38.88;
    String x15 = "484";
    int num8 = Integer.parseInt(x15);
    String x1 = Double.valueOf(5.0).toString();
    Double x2 = Double.valueOf("5.0").compareTo(88.88);
    Integer x3 = Integer.valueOf(5);
   Integer x4 = Integer.valueOf("5");

   Integer jx = new Integer(7);
   Integer jy = 78;

   Double jv = 48.99;

   int ju = Integer.parseInt("8");

   double jus = Integer.valueOf(9) + 8; 






}
