package com.Itech.Car.controller;

import com.Itech.Car.handleJsonFilter.CarMakerFilter;
import com.Itech.Car.model.Car;
import com.Itech.Car.model.CarMaker;
import com.Itech.Car.service.CarMakerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/api/carMakers")
public class CarMakerController {
    private final CarMakerService carMakerService;

    private final CarMakerFilter carMakerFilter;

    @GetMapping()
    public ResponseEntity getAllCarMakers(){
        return new ResponseEntity<>( carMakerFilter.getCarMakers((List<CarMaker>) carMakerService.getAllCarMakers()), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity createCarMaker(@RequestBody CarMaker carMaker){
        carMakerService.saveCarMaker(carMaker);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
