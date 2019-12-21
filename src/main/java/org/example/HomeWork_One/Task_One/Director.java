package org.example.HomeWork_One.Task_One;

public class Director {

    AbstractBuilder abstractBuilder;

    public void setAbstractBuilder(AbstractBuilder abstractBuilder) {
        this.abstractBuilder = abstractBuilder;
    }

    Person buildPerson(){
        abstractBuilder.createPerson();
        abstractBuilder.buildFirstName();
        abstractBuilder.buildLastName();
        abstractBuilder.buildMiddleName();
        abstractBuilder.buildCountry();
        abstractBuilder.buildAddress();
        abstractBuilder.buildPhone();
        abstractBuilder.buildAge();
        abstractBuilder.buildGender();

        Person person = abstractBuilder.getPerson();
        return person;
    }
}
