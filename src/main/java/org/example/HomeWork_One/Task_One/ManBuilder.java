package org.example.HomeWork_One.Task_One;

public class ManBuilder extends AbstractBuilder{
    @Override
    void buildFirstName() {
        person.setFirstName("Adam");
    }

    @Override
    void buildLastName() {
        person.setLastName("_");

    }

    @Override
    void buildMiddleName() {
        person.setMiddleName("_");
    }

    @Override
    void buildCountry() {
        person.setCountry("Adem");

    }

    @Override
    void buildAddress() {
        person.setAddress("paradise");

    }

    @Override
    void buildPhone() {
        person.setPhone("no connection");

    }

    @Override
    void buildAge() {
        person.setAge(38);

    }

    @Override
    void buildGender() {
        person.setGender(Gender.MAN);

    }
}
