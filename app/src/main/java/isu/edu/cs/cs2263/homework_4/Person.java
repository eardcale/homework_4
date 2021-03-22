package isu.edu.cs.cs2263.homework_4;

public class Person {
    private String firstName;
    private String LastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        LastName = lastName;
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}
