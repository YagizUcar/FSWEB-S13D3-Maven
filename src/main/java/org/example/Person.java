package org.example;

public class Person {
    private String firstname;
    private String lastName;
    private int age;

    private String gender;
    private String occupation;
    private String city;

    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstname, String lastName, int age, String gender, String occupation, String city) {
        this(firstname, lastName, age);
        this.gender = gender;
        this.occupation = occupation;
        this.city = city;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }
}