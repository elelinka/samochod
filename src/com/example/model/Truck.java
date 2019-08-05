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
        if (loadWeight >= 100 && isAirConditionOn()) {
            return (super.getTankVolume() / (super.getAverageCombustion() + (COMBUSTION_WITH_LOAD * (loadWeight / 100)) + COMBUSTION_WITH_AIR_CON_TRUCK)) * 100;
        } else if (loadWeight < 100 && isAirConditionOn()) {
            return (super.getTankVolume() / (super.getAverageCombustion() + COMBUSTION_WITH_AIR_CON_TRUCK)) * 100;
        } else if (loadWeight >= 100 && !isAirConditionOn()) {
            return (super.getTankVolume() / (super.getAverageCombustion() + (COMBUSTION_WITH_LOAD * (loadWeight / 100)))) * 100;
        } else {
            return (super.getTankVolume() / super.getAverageCombustion()) * 100;
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
