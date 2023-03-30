package org.example;

public class Student extends Person{
    private final String group;

    public Student(String firstName, String lastName, String email, String group) {
        super(firstName, lastName, email);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public String toString() {
        return super.toString() + ", Group: " + group;
    }
}
