package com.example.model;

import java.util.Locale;

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

    public double getRangeOfVehicle() {
        return (tankVolume * 100) / averageCombustion;
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
        return averageCombustion;
    }

    public void setAverageCombustion(double averageCombustion) {
        this.averageCombustion = averageCombustion;
    }

    @Override
    public String toString() {
        return "name: " + name + ", tank volume: " + tankVolume
                + "L, average combustion: " + String.format(Locale.US, "%5.2f", getAverageCombustion())
                + "L/100km, range of vehicle: " + String.format(Locale.US, "%5.2f", getRangeOfVehicle()) + "km";
    }
}
