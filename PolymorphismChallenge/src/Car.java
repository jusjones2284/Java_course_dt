public class Car {

    private String description;

    //construtor
    public Car(String description) {
        this.description = description;
    }
    //protected access modifier protect subclasses can
    // override it but any other classes not sharing the same package cant.

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }

}

class GasPoweredCar extends Car{

    private double avgKmPerLiter;
    private int cylinders = 6;

    //constructor
    public GasPoweredCar(String description){
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders){
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready! %n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}
