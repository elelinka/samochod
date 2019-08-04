package com.example.model;

import java.util.Locale;

public class Car extends Vehicle {
    private boolean isAirConditionOn;
    private static final double COMBUSTION_WITH_AIR_CON = 0.8;

    public Car(String name, double tankVolume, double averageCombustion, boolean isAirConditionOn) {
        super(name, tankVolume, averageCombustion);
        this.isAirConditionOn = isAirConditionOn;
    }

    public double getRangeOfVehicle() {
        return (super.getTankVolume() / getCombustion()) * 100;
    }

    public double getCombustion() {
        if (isAirConditionOn) {
            return super.getAverageCombustion() + COMBUSTION_WITH_AIR_CON;
        } else {
            return super.getAverageCombustion();
        }
    }

    public boolean isAirConditionOn() {
        return isAirConditionOn;
    }

    public void setAirConditionOn(boolean airConditionOn) {
        isAirConditionOn = airConditionOn;
    }

    public static double getCombustionWithAirCon() {
        return COMBUSTION_WITH_AIR_CON;
    }

    @Override
    public String toString() {
        return super.toString() + " is air condition on: " + isAirConditionOn + ",\ncombustion: " + String.format(Locale.US, "%5.2f", getCombustion()) + "L" + ", range of vehicle: " + String.format(Locale.US, "%5.2f", getRangeOfVehicle()) + "km";
    }
}
