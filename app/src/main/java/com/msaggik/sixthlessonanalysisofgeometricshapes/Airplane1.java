package com.msaggik.sixthlessonanalysisofgeometricshapes;

public class Airplane1 implements Flying {
    private int capacity;
    private int maxSpeed;
    private double fuelConsumption;

    public Airplane1(int capacity, int maxSpeed, double fuelConsumption) {
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public double calculateFuelConsumption(double distance) {
        return fuelConsumption * (distance / maxSpeed);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / maxSpeed;
    }
    // Геттеры и сеттеры
}
