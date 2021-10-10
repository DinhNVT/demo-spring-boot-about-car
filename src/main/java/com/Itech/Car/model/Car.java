package com.Itech.Car.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@JsonFilter("filter.Car")
public class Car{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameCar;

    private Double price;

    private boolean status;

    private String description;

    @ManyToOne
    @JoinColumn(name = "car_maker_id")
    private CarMaker carMaker;
}
