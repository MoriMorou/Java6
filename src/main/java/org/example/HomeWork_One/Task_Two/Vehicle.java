package org.example.HomeWork_One.Task_Two;

// добавила абстракный класс для порядка)))
abstract class Vehicle implements Moveable, Motionless{
    // Engine потеряли целый класс или неправильно определили тип (я выбрала второй вариант)
    private String engine;
    private String color;
    private String name;

    abstract void open();

    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void move(){
        System.out.println("Vehicle is moving");
    }
    @Override
    public void stop(){
        System.out.println("Vehicle is stopping");
    }

    @Override
    public String toString() {
        return "Vehicle, the total information {" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
