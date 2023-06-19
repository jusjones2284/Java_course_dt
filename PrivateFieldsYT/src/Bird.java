public class Bird extends Animal{

    private String featherColor =  "red";
    //featherColor is private - cant be inherited, cant be accessed outside the Bird Class

    public void reportStats (){

        System.out.println("Feather Color: " + featherColor );
        System.out.println("Legs: " + getNumOfLegs());
        System.out.println("Wings: " + getNumOfWings());
    }


}
