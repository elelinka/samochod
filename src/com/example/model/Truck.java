package com.example.model;

public class Truck extends Car {
    private double loadWeight;

    public Truck(String name, double tankVolume, boolean isAirConditionOn, double loadWeight) {
        super(name, tankVolume, isAirConditionOn);
        this.loadWeight = loadWeight;
    }

    @Override
    public double getRangeOfVehicle() {
        return (getTankVolume() * 100) / getAverageCombustion();
    }

    @Override
    public double getAverageCombustion() {
        if (loadWeight >= 100) {
            return (super.getAverageCombustion() * 2 + 1.3) * loadWeight / 100;
        } else {
            return super.getAverageCombustion() * 2;
        }
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public String toString() {
        return super.toString() + ", load weight: " + loadWeight + "kg";
    }
}
