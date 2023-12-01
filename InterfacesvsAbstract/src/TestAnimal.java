public class TestAnimal {

    public static void main(String[] args) {

        Animal chickFil = new Chicken();
        System.out.println(chickFil.howToEat());
        eat(chickFil);

        chickFil = new Duck();
        eat(chickFil);
        
    }

    public static void eat(Animal animal){

        System.out.println(animal.howToEat());
    }
}
