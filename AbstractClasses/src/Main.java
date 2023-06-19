import dev.lpa.Animal;
import dev.lpa.Dog;
import dev.lpa.Fish;

import java.util.ArrayList;

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

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Cat Fish", "Medium", 60));
        animals.add(new Fish("GoldFish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));

        for(Animal animal: animals){
            doAnimalStuff(animal);
        }
    }

    private static void doAnimalStuff(Animal animal){

        animal.makeNoise();
        animal.move("slow");
    }
}