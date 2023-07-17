package model;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dob;

    public Person(){

    }

    public Person(String firstName, String lastName, LocalDate dob){
        this.firstName = firstName;
        this.lastName = lastName.toUpperCase();
        this.dob = dob;

    }

    public String getFirstName(){
        return firstName.substring(0,3).toUpperCase() + firstName.substring(3);
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName.substring(0,3).toUpperCase();
    }

    public String getLastName(){
        return lastName;
    }



    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                '}';
    }
}
