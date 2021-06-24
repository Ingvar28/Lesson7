package ru.nosov.task2;

public class Pyramid extends Shape{
    protected double s;
    protected double h;

    public Pyramid(double s, double h) {
        super(s * h / 3);
        this.s = s;
        this.h = h;
    }
}
