package com.example.model;

public class Truck extends Car {
    public static final double COMBUSTION_WITH_AIR_CON_TRUCK = 1.6;
    public static final double COMBUSTION_WITH_LOAD = 0.5;

    private double loadWeight;

    public Truck(String name, double tankVolume, double averageCombustion, boolean isAirConditionOn, double loadWeight) {
        super(name, tankVolume, averageCombustion, isAirConditionOn);
        this.loadWeight = loadWeight;
    }

    @Override
    public double getRangeOfVehicle() {
        return super.getRangeOfVehicle();
    }

    private double getCurrentCombustion() {
        double averageCombustion = getAverageCombustion();
        if (isAirConditionOn()) {
            averageCombustion += COMBUSTION_WITH_AIR_CON_TRUCK;
        }
        if (loadWeight >= 100) {
            averageCombustion += (COMBUSTION_WITH_LOAD * (loadWeight / 100));
        }
        return averageCombustion;
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
