package Deliverable3;

public class Person {
    private String firstName;
    private String lastName;
    private Address home;

    //constructors
    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getHome() {
        return home;
    }

    public void setHome(Address home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "First name: " + firstName + ", Last name: " + lastName + ", Home: " + home;
    }
    
}
