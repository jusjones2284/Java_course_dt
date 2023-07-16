import model.Person;

import java.time.LocalDate;

public class HelloWorld {

    public static void main(String[] args) {
        //create a new instance of the class Person and inialize this object of first name of Johnny
        Person johnny = new Person
                ("Jusitn", "Jones", LocalDate.of(2000, 12, 22));
        Person amy = new Person();
        amy.setFirstName("Amy");
        System.out.println(johnny);
    }
}
