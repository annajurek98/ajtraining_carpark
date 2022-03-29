package com.aj.training.carpark;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(numberPlate, car.numberPlate) && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPlate, brand, model);
    }
}
