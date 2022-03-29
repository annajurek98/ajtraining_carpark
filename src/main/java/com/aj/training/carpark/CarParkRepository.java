package com.aj.training.carpark;

import java.util.List;

interface CarParkRepository {

    void addCar(Car car);

    void deleteCarByNumberPlate(String numberPlate);

    List<Car> fetchAll();
}
