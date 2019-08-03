package com.example.model;

import java.util.Locale;

public class Car extends Vehicle {
    private boolean isAirConditionOn;

    public Car(String name, double tankVolume, boolean isAirConditionOn) {
        super(name, tankVolume);
        this.isAirConditionOn = isAirConditionOn;
    }

    @Override
    public double getRangeOfVehicle() {
        return (getTankVolume() * 100) / getAverageCombustion();
    }

    @Override
    public double getAverageCombustion() {
        if (isAirConditionOn) {
            return super.getAverageCombustion() + 0.8;
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

    @Override
    public String toString() {
        return super.toString() + ", is air condition on: " + isAirConditionOn;
    }
}
