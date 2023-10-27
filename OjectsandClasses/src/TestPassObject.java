public class TestPassObject {

    public static void main(String[] args) {
        Circle2 myCircle = new Circle2(1);

        int n = 5;
        printAreas(myCircle, n);

        Circle2 circleArray = new Circle2(10);

        for (int i = 0; i < circleArray.length; i++){
            circleArray[i] = new Circle2(); 


    }

    public static void printAreas(Circle2 c, int times){

        while (times >= 1){
            System.out.println(c.getArea());
        }

    }
}
