public class Robot {

    private static String fuelSource;
    private String name;

    public Robot(){

        fuelSource = "electricity";
        randomName();
    }
    public static String getFuelSource() {
        return fuelSource;
    }

    public String getName() {
        return name;
    }

    public static void setFuelSource(String fuelSource) {
        Robot.fuelSource = fuelSource;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void randomName(){

        //generates random int from 1-3
        int randomNumber = (int) (Math.random()*3+1);

        if (randomNumber == 1)
                name = "Bender";
        else if (randomNumber == 2)
            name = "Hal 9000";
        else
            name = "Gort";
    }


}


