package com.example.main;

import com.example.model.Car;
import com.example.model.Truck;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("Volvo", 60, 10, false);
        cars[1] = new Car("Audi", 50, 8, false);
        cars[2] = new Truck("SCANIA", 770, 60, false, 1000);
        cars[3] = new Truck("MAN", 600, 30, false, 1200);

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\nwith air condition on:");

        for (Car car : cars) {
            car.setAirConditionOn(true);
            System.out.println(car);
        }

    }
}