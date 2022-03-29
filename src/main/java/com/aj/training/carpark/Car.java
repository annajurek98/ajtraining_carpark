package com.aj.training.carpark;

public class Car {
    private String numberPlate;
    private String brand;
    private String model;

    public Car(String numberPlate, String brand, String model) {
        this.numberPlate = numberPlate;
        this.brand = brand;
        this.model = model;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
