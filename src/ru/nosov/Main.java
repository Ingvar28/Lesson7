package ru.nosov;

import ru.nosov.task1.*;
import ru.nosov.task2.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Task1
        System.out.println("Task 1");
        System.out.println("--------------------------------------------");

        Car porche = new Car(1500,"Porche 911", 'r', 299.99f);
        porche.outPut();
        System.out.println("");

        Car kamaz = new Truck(9000,"Kamaz", 'o', 179.99f,6, 13000f);
        kamaz.outPut();
        System.out.println("");

        Truck belaz = new Truck(390000,"Belaz", 'w', 79.99f, 4, 450000f);
        belaz.outPut();
        System.out.println("");

        Truck gazel = new Truck(4, 2000);



        //Task2
        System.out.println("Task 2");
        System.out.println("--------------------------------------------");

        Box box = new Box(64);
        System.out.println("Объем коробки: " + box.getVolume());

        Shape cylinder = new Cylinder(2,3);//
        System.out.println("Объем цилиндра: " + cylinder.getVolume());
        Shape ball = new Ball(2);
        System.out.println("Объем Шара: " + ball.getVolume());
        Shape pyramid = new Pyramid(2,2);
        System.out.println("Объем Пирамиды: " + pyramid.getVolume());

        System.out.println("--------------------------------------------");

        System.out.println("Можно ли добавить цилиндр в коробку? - " + box.add(cylinder));
        System.out.println("В коробке осталось: " + box.getCapacity() + "\n");
        System.out.println("Можно ли добавить шар в коробку? - " + box.add(ball));
        System.out.println("В коробке осталось: " + box.getCapacity() + "\n");
        System.out.println("Можно ли добавить пирамиду в коробку? - " + box.add(pyramid));
        System.out.println("В коробке осталось: " + box.getCapacity() + "\n");


    }
}
