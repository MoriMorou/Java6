package org.example.HomeWork_One.Task_Two;


// Класс отвечает теперь только за грузовые автомобили
public class Lorry extends Vehicle{

    @Override
    void open() {
        System.out.println("Lorry is open");
    }
}
