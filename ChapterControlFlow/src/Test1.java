public class Test1 {

    public static void main(String[] args) {
//        System.out.println(xMethod(5));
//        System.out.println(max(1,2));

       int y = (int)('a' + Math.random()* ('z' - 'a' + 1));
        System.out.println(y);
    }


    public static int xMethod(int n, long l){
        System.out.println("int, long");
        return n;
    }

    public static long xMethod(long n){
        System.out.println("long");
        return n;
    }

    public static double max(int num1, double num2){
        System.out.println("max(int, double) is invoked");

        if(num1 > num2){
            return num1;

        }else return num2;

    }

    public static double max(double num1, int num2){
        System.out.println("max(double, int) is invoked");
        if(num1 > num2)
            return num1;
        else return num2;
    }




}
