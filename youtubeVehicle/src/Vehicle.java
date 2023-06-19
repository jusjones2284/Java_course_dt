public class Vehicle extends Object{

    private String color;
    private int serialNumber;

    public Vehicle(){
        super();//if you make a call to superclass's constructor, it must be the first line
        color = "green";
    }

    public Vehicle(String newColor){
        this();
        color = newColor;
    }

    public Vehicle(String newColor, int newSerialNumber){

        super(); //the java compiler inserts this for us
        color = newColor;
        serialNumber = newSerialNumber;
    }


}
