package org.example.HomeWork_Five_Hibernate;

import org.example.HomeWork_Five_Hibernate.dao.Students;
import org.example.HomeWork_Five_Hibernate.entities.Student;

public class HibernateMain {
    final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private final static java.util.Random rand = new java.util.Random();

    public static void main(String[] args) {

        Students studentDAO = new Students();

        for (int i = 0; i <= 1000; i++) {
            Student student = new Student("Mori" + i, rand.nextInt((5 - 1) + 1) + 1);
            studentDAO.createNewStudent(student);
        }
    }
}
