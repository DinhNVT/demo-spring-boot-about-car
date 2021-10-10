package com.Itech.Car.service.impl;

import com.Itech.Car.model.CarMaker;
import com.Itech.Car.repository.CarMakerRepository;
import com.Itech.Car.service.CarMakerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarMakerServiceImpl implements CarMakerService {
    private final CarMakerRepository carMakerRepository;

    @Override
    public Iterable<CarMaker> getAllCarMakers() {
        return carMakerRepository.findAll();
    }

    @Override
    public CarMaker getCarMakerById(int id) {
        return carMakerRepository.findById(id).get();
    }

    @Override
    public void saveCarMaker(CarMaker carMaker) {
        carMakerRepository.save(carMaker);
    }

    @Override
    public void deleteCarMakerById(int id) {
        carMakerRepository.deleteById(id);
    }

    @Override
    public CarMaker updateCarMaker(CarMaker carMaker) {
        return carMakerRepository.save(carMaker);
    }
}
