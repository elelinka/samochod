package com.example.model;

public class Truck extends Car {
    private double loadWeight;

    public Truck(String name, double tankVolume, boolean isAirConditionOn, double loadWeight) {
        super(name, tankVolume, isAirConditionOn);
        this.loadWeight = loadWeight;
    }

    @Override
    public double getAverageCombustion() {
        return super.getAverageCombustion() + 0.8;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public String toString() {
        return super.toString() + ", load weight: " + loadWeight;
    }
}
