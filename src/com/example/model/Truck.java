package com.example.model;

public class Truck extends Car {
    private double loadWeight;
    private static final double COMBUSTION_WITH_AIR_CON_TRUCK = 0.8;
    private static final double COMBUSTION_WITH_LOAD = 0.5;

    public Truck(String name, double tankVolume, double averageCombustion, boolean isAirConditionOn, double loadWeight) {
        super(name, tankVolume, averageCombustion, isAirConditionOn);
        this.loadWeight = loadWeight;
    }

    @Override
    public double getRangeOfVehicle() {
        return super.getRangeOfVehicle();
    }

    @Override
    public double getCombustion() {
        if (loadWeight >= 100 && isAirConditionOn()) {
            return super.getCombustion() + (COMBUSTION_WITH_LOAD * (loadWeight / 100)) + COMBUSTION_WITH_AIR_CON_TRUCK;
        } else if (isAirConditionOn() && loadWeight < 100) {
            return super.getCombustion() + COMBUSTION_WITH_AIR_CON_TRUCK;
        } else if (!isAirConditionOn() && loadWeight >= 100) {
            return super.getCombustion() + (COMBUSTION_WITH_LOAD * (loadWeight / 100));
        } else {
            return super.getCombustion();
        }
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    public static double getCombustionWithAirCon() {
        return COMBUSTION_WITH_AIR_CON_TRUCK;
    }

    public static double getCombustionWithLoad() {
        return COMBUSTION_WITH_LOAD;
    }

    @Override
    public String toString() {
        return super.toString() + ", load weight: " + loadWeight + "kg";
    }
}
