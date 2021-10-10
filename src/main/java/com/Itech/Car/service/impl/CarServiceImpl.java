package com.Itech.Car.service.impl;

import com.Itech.Car.model.Car;
import com.Itech.Car.repository.CarRepository;
import com.Itech.Car.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Override
    public Iterable<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(int id) {
        return carRepository.findById(id).get();
    }

    @Override
    public void saveCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public void deleteCarById(int id) {
        carRepository.deleteById(id);
    }

    @Override
    public Car updateCar(Car car) {
        return carRepository.save(car);
    }
}
