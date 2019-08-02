package com.example.model;

public class Vehicle {
    private String name;
    private double tankVolume;
    private double averageCombustion;
    private static double combustion = 10;

    public Vehicle(String name, double tankVolume) {
        this.name = name;
        this.tankVolume = tankVolume;
        this.averageCombustion = combustion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double getAverageCombustion() {
        return combustion;
    }

    public void setAverageCombustion(double averageCombustion) {
        this.averageCombustion = averageCombustion;
    }

    @Override
    public String toString() {
        return "name: " + name + ", tank volume: " + tankVolume + ", average combustion: " + averageCombustion;
    }
}
