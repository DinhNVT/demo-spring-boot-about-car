package com.Itech.Car.repository;

import com.Itech.Car.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Integer> {
}
