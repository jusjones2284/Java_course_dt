public class Animal {

    private int numOfLegs = 4;
    private int numOfWings = 2;
    //numOfLegs is private so it - cant be inherited, cant be accessed outside the animal class

    public int getNumOfLegs(){
        return numOfLegs;
    }

    public int getNumOfWings(){
        return  numOfWings;
    }

    public void setNumOfWings(int numOfWings){
        this.numOfWings = numOfWings;
    }

    public void setNumOfLegs(int newNumOfLegs){
        numOfLegs = newNumOfLegs;
    }

}
