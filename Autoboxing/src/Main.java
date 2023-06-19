// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int num = 7;
        Integer num1 = num; // autoboxing - taking a primitive type and storing it into a class

        int num2 = num1.intValue(); //unboxing
        int num3 = num1; //auto unboxing


        System.out.println(num2);
        System.out.println(num3);

        String str = "12";
        int num4 = Integer.parseInt(str);
        System.out.println(num4 * 12);

        //instance of Interger is created autoboxing
        Integer boxedInt = 15;

        //unboxing manually unboxing
        int unboxedInt = boxedInt.intValue();

        //automatic unboxing
        Integer boxedInteger = 15;
        int unboxedInts = boxedInteger;

        //automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());

        Double resultedBoxed = getLiteralDoublePrimitive();
        double resultUnboxted = getDoubleObject();

        Integer [] wrapperArray = new Integer[5];
        

    }

    private static Double getDoubleObject(){

        return Double.valueOf(100);
    }

    private static double getLiteralDoublePrimitive(){

        return 100.0;
    }
}