package ru.nosov.task1;

public class Truck extends Car{
    protected int wheels;
    protected float maxWeight;

    public void newWheels (int wheels) {
        System.out.println("Новое количество колес: " + wheels);
    }

    public Truck(int w, String m, char c, float s, int wheels, float maxWeight) {
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }


    public Truck(int wheels, float maxWeight) {
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    @Override
    public void outPut () {
        System.out.println("Вес " + super.model + " составляет " + super.weight + "кг.");
        System.out.println("Цвет машины - " + super.color + " и её скорость - " + super.speed);
        System.out.println("Количестов колес " + wheels + " и грузоподъемность " +maxWeight);
    }

}
