public class Animal {

    public void eat(){

        System.out.println("animal eats");
    }

    public void sleep(){
        System.out.println("animal sleeps");
    }
}

class Mammal extends Animal{

    public void controlTep(){
        System.out.println("mammal control temp");
    }
}

class Lion extends Mammal {

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("lion doesn't sleep");
    }

    public void roar(){

        System.out.println("Lion roars loudly");
    }
}
