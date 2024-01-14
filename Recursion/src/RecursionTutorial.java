public class RecursionTutorial {
    public static void main(String[] args) {
        sayHi(100);
    }

    private static void sayHi(int count){
        System.out.println("Hi!");
        //base case
        if (count <= 1){
            return;
        }
        sayHi(count - 1);
    }

}
