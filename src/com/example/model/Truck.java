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
        return (getTankVolume() / getCurrentCombustion()) * 100;
    }

    private double getCurrentCombustion() {
        if (loadWeight >= 100 && isAirConditionOn()) {
            return getCurrentCombustionWithLoad() + getCurrentCombustionWithAir();
        } else {
            return getCurrentCombustionWithAir();
        }
    }

    private double getCurrentCombustionWithAir() {
        if (isAirConditionOn() && loadWeight < 100) {
            return getAverageCombustion() + COMBUSTION_WITH_AIR_CON_TRUCK;
        } else {
            return getCurrentCombustionWithLoad();
        }
    }

    private double getCurrentCombustionWithLoad() {
        if (loadWeight >= 100 && !isAirConditionOn()) {
            return getAverageCombustion() + (COMBUSTION_WITH_LOAD * (loadWeight / 100));
        } else {
            return getAverageCombustion();
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
