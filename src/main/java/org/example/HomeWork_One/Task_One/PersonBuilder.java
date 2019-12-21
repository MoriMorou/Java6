package org.example.HomeWork_One.Task_One;

public class PersonBuilder {

    public static void main( String[] args ) {
        Director director = new Director();

        director.setAbstractBuilder(new WomanBuilder());
        Person woman = director.buildPerson();

        System.out.println(woman);


    }
}
