import java.util.Arrays;

public class Testcomp {

    public static void main(String[] args) {
        Person [] people = {new Person(3), new Person(4), new Person(10)};
    }

}

class Person {

    Person(){

    };
    private int id;

    Person(int id){
        this.id = id;
    }
}
