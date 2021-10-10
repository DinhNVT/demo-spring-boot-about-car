package com.Itech.Car.service;

import com.Itech.Car.model.Car;

public interface CarService {
    Iterable<Car> getAllCars();
    Car getCarById(int id);
    void saveCar(Car car);
    void deleteCarById(int id);
    Car updateCar(Car car);
}
