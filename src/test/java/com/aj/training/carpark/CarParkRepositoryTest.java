package com.aj.training.carpark;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CarParkRepositoryTest {

    private CarParkRepositoryMockDatabase carParkRepositoryMockDatabase;

    @BeforeEach
    void setUp() {
        carParkRepositoryMockDatabase = new CarParkRepositoryMockDatabase();
        carParkRepositoryMockDatabase.addCar(new Car("WPI 54128","Porshe","Targa"));
        carParkRepositoryMockDatabase.addCar(new Car("WT 33128","Mazda","XYZ"));
    }

    @Test
    void addCar() {
        List<Car> initialList = carParkRepositoryMockDatabase.fetchAll();
        carParkRepositoryMockDatabase.addCar(new Car("KR 12345", "Lexus", "UX"));
        List<Car> updatedList = carParkRepositoryMockDatabase.fetchAll();
        assertEquals(initialList.size() + 1, updatedList.size());
    }

    @Test
    void deleteCar() {
        List<Car> initialList = carParkRepositoryMockDatabase.fetchAll();
        carParkRepositoryMockDatabase.deleteCarByNumberPlate("WPI 54128");
        List<Car> updatedList = carParkRepositoryMockDatabase.fetchAll();
        assertEquals(initialList.size()-1, updatedList.size());
    }
}