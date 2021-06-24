package ru.nosov.task2;

import java.security.PublicKey;
import java.util.ArrayList;

public class Box extends Shape{

    private double capacity;


    public ArrayList<Shape> box = new ArrayList<>();

    public Box(double volume) {
        super(volume);
        capacity = volume;
    }

    public double getCapacity() {
        return capacity;
    }



    public boolean add(Shape shape) {

        if (capacity  < shape.getVolume()) {
            return false;
        }else {
            box.add(shape);
            capacity -= shape.getVolume();
            return true;
        }

    }
}
