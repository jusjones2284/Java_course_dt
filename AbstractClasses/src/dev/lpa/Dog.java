package dev.lpa;

//concrete dog class
public class Dog extends Animal {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }


//    @Override
//    public void move() {
//        if(type == "Wolf" && size == "big"){
//            System.out.println("run like a wolf");
//        }else if(type == "Pitt"){
//            System.out.println("run like a pitt");
//        } else {
//            System.out.println("why do you like birds!");
//        }
//    }

    @Override
    public void move(String speed) {

        if(speed.equals("slow")){
            System.out.println(getExplicitType() + " walking");
        } else {
            System.out.println(getExplicitType() + " running");
        }
    }

    @Override
    public void makeNoise() {

        if(type == "Wolf"){
            System.out.println("Howling! ");
        } else {
            System.out.println("Wolf! ");
        }
    }
}
