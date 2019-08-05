package com.example.model;

import java.util.Locale;

public class Car extends Vehicle {
    public static final double COMBUSTION_WITH_AIR_CON = 0.8;

    private boolean isAirConditionOn;

    public Car(String name, double tankVolume, double averageCombustion, boolean isAirConditionOn) {
        super(name, tankVolume, averageCombustion);
        this.isAirConditionOn = isAirConditionOn;
    }

    public double getRangeOfVehicle() {
        if (isAirConditionOn) {
            return (super.getTankVolume() / (super.getAverageCombustion() + COMBUSTION_WITH_AIR_CON)) * 100;
        } else {
            return (super.getTankVolume() / super.getAverageCombustion()) * 100;
        }
    }

    public boolean isAirConditionOn() {
        return isAirConditionOn;
    }

    public void setAirConditionOn(boolean airConditionOn) {
        isAirConditionOn = airConditionOn;
    }

    @Override
    public String toString() {
        return super.toString() + " is air condition on: " + isAirConditionOn
                + ", range of vehicle: " + String.format(Locale.US, "%5.2f", getRangeOfVehicle()) + "km";
    }
}
