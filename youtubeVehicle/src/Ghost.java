public class Ghost {

    private String color;
    private boolean isScary;


    public Ghost(String color, boolean isScary){

        super();
        this.color = color;
        this.isScary = isScary;
    }
}

public class Slimer extends Ghost{

    private boolean isHungry;


    public Slimer(boolean isHungry, boolean isScary){

        super("green", isScary);
        this.isHungry = isHungry;
    }
}
