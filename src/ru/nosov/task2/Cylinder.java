package ru.nosov.task2;

public class Cylinder extends SolidOfRevolution{
    protected double height;

    public Cylinder( double radius, double height) {
        super(Math.PI * Math.pow(radius, 2) * height, radius);
        this.height = height;
    }
}
