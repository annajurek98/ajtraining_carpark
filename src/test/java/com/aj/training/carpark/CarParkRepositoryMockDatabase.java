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
        for (Car car : mockDatabase) {
            if (car.getNumberPlate().equals(numberPlate)) {
                mockDatabase.remove(car);
                break;
            }
        }
    }
    @Override
    public List<Car> fetchAll() {
        return new ArrayList<>(mockDatabase);
    }
}
