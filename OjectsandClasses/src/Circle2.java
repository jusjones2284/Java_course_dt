public class Circle2 {
    double radius;
    static int numberOfObjects = 0;
    static int numberOfCars = 6;

    Circle2(){
        radius = 1.0;
        numberOfObjects++;
    }

    Circle2(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    static  int getNumberOfObjects(){
        return numberOfObjects;
    }
    double getArea(){
        return numberOfCars * radius * radius * Math.PI;



    }
    static int getNumberOfCars(){
        return numberOfCars;

    }


    public static void main(String[] args) {
        System.out.println("Number of objects: " + Circle2.getNumberOfObjects());

        System.out.println("Creating an object....");

        Circle2 c1 = new Circle2();

        System.out.println("Number of objects: " + Circle2.getNumberOfObjects());

        System.out.println("Creating an object....");

        Circle2 c2 = new Circle2(8);

        System.out.println("Number of objects: " + Circle2.getNumberOfObjects());

        System.out.println("The area of c1 is" + c1.getArea());
        System.out.println("The area of c1 is" + c2.getArea());


        Circle2.getNumberOfObjects();
        Circle2.getNumberOfCars();
    }


}
