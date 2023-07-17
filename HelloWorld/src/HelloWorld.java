import model.Person;

import java.time.LocalDate;

public class HelloWorld {

    public static void main(String[] args) {
        //create a new instance of the class Person and inialize this object of first name of Johnny
        Person justin = new Person
                ("Justin", "jones", LocalDate.of(2000, 12, 22));
        Person amy = new Person();
        amy.setFirstName("Amy");
        amy.setLastName("wallace");
        System.out.println("what is his first name? " + justin.getFirstName());
        System.out.format("The person's first name is: %n %s.", justin.getFirstName());
        System.out.format(" %n The person last name is %s", amy.getLastName());
        System.out.format(" %n The person last name is %s", justin.getLastName());
    }
}
