package com.Itech.Car.controller;

import com.Itech.Car.handleJsonFilter.CarFilter;
import com.Itech.Car.model.Car;
import com.Itech.Car.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("api/cars")
public class CarController {
    private final CarService carService;

    private final CarFilter carFilter;

    @GetMapping()
    public ResponseEntity getListCar(){
        return new ResponseEntity<>(carFilter.getCars((List<Car>) carService.getAllCars()), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Void> createCar(@RequestBody Car car){
        carService.saveCar(car);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable int id){
        carService.deleteCarById(id);
        return new ResponseEntity("Deleted success",HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity updateCar(@RequestBody Car car){
        return new ResponseEntity<>(carFilter.getCar(carService.updateCar(car)), HttpStatus.OK);
    }
}
