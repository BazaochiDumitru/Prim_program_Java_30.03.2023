package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bazaochi Dumitru - Evaluare 1");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Bazaochi", "Dumitru", "stdposta1@gmail.com", "Aw11M"));
        students.add(new Student("Anastasia", "Maidacenco", "stdposta2@gmail.com", "Aw11M"));
        students.add(new Student("Betisor", "Natalia", "stdposta3@gmail.com", "Aw11M"));
        students.add(new Student("Odobescu", "Vladislav", "stdposta4@gmail.com", "Aw11M"));
        students.add(new Student("Banari", "Vladislav", "stdposta5@gmail.com", "Aw11M"));

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Cabac", "Valeriu", "professor1@gmail.com", "Informatica"));
        teachers.add(new Teacher("Cabac", "Eugeniu", "professor2@gmail.com", "Matematica"));
        teachers.add(new Teacher("Negara", "Corina", "professor3@gmail.com", "Fizica"));

        System.out.println("Lista de studenti:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nLista de profesori:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}