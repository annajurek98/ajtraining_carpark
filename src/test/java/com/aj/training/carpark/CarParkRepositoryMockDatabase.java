package com.aj.training.carpark;

import java.util.ArrayList;
import java.util.List;

public class CarParkRepositoryMockDatabase implements CarParkRepository {

    private final List<Car> mockDatabase = new ArrayList<>();

    @Override
    public void addCar(Car car) {
        mockDatabase.add(car);
    }

    @Override
    public void deleteCarByNumberPlate(String numberPlate) {
        mockDatabase.removeIf(car -> car.getNumberPlate().equals(numberPlate));
    }

    @Override
    public List<Car> fetchAll() {
        return new ArrayList<>(mockDatabase);
    }
}
