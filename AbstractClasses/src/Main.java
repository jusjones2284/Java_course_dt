import dev.lpa.Animal;
import dev.lpa.Dog;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Animal is a abstract class and cant be instantiated
//        Animal animal =  new Animal("animal", "big", 100);

        Dog dog = new Dog("Wolf", "medium", 100);
        dog.makeNoise();
        doAnimalStuff(dog);
        Dog puppy = new Dog("Pitt", "big", 50);
        puppy.makeNoise();
    }

    private static void doAnimalStuff(Animal animal){

        animal.makeNoise();
        animal.move("slow");
    }
}