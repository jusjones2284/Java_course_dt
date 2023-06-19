public class RobotTwo {

    private static String fuelSource;
    private String name;

    public RobotTwo(){
        this("Wall-E");

    }

    public RobotTwo(String newName){

        fuelSource = "electricity";
        name = newName;
    }
}
