package org.example;

public class Teacher extends Person{
    private final String speciality;

    public Teacher(String firstName, String lastName, String email, String speciality) {
        super(firstName, lastName, email);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String toString() {
        return super.toString() + ", Speciality: " + speciality;
    }
}
