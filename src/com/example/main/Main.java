package com.example.main;

import com.example.model.Car;
import com.example.model.Truck;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("Volvo", 60, true);
        cars[1] = new Car("Audi", 50, true);
        cars[2] = new Truck("SCANIA", 770, true, 1200);
        cars[3] = new Truck("MAN", 600, true, 600);

        for (Car car : cars) {
            System.out.println(car);
        }

    }
}