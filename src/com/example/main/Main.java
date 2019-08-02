package com.example.main;

import com.example.model.Car;
import com.example.model.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volvo", 60, true);
        System.out.println(car.getAverageCombustion());

        Truck truck = new Truck("Man", 100, true, 600);
        System.out.println(truck.getAverageCombustion());

    }
}