package com.Itech.Car.service;

import com.Itech.Car.model.CarMaker;

public interface CarMakerService {
    Iterable<CarMaker> getAllCarMakers();
    CarMaker getCarMakerById(int id);
    void saveCarMaker(CarMaker carMaker);
    void deleteCarMakerById(int id);
    CarMaker updateCarMaker(CarMaker carMaker);
}
