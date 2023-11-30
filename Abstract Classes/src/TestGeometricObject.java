public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? " +
                equalArea(geoObject1, geoObject2)
                );

        displayGeometricObject(geoObject1);

        displayGeometricObject(geoObject2);

        Number x = 3;
        System.out.println(x.intValue());
        System.out.println(x.doubleValue());


    }

    public static boolean equalArea(GeometricObject object1, GeometricObject object2){
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object){
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
//
//public class ApartmentHouse extends RentableDwelling {
//    public ApartmentHouse(double rentPerUnit, int numberOfApartments) {
//        super(rentPerUnit);
//        this.numberOfApartments = numberOfApartments;
//    }
//    public double getRentalIncome() {
//        return getRentPerUnit() * numberOfApartments;
//    }
//    private int numberOfApartments;
//}
//
//public abstract class Vehicle {
//    public Vehicle(double maxSpeed) {
//        this.maxSpeed = maxSpeed;
//    }
//    public abstract void accelerate();
//    public double getCurrentSpeed() {
//        return currentSpeed;
//    }
//    public double getMaxSpeed() {
//        return maxSpeed;
//    }
//    public void pedalToTheMetal() {
//        while (currentSpeed < maxSpeed)
//            accelerate();
//    }
//    protected double currentSpeed;
//    private double maxSpeed;
//}
