public class SelfDrivingCar extends Car{

    public void applyBrakes(){

        System.out.println("computer applies brakes");
        checkSurroundings();
    }

    public void emergencyOverride(){
        System.out.println("driver takes control");
        super.applyBrakes();
    }
}
