package com.Itech.Car.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DTO_Car {
    private int id;

    private String nameCar;

    private Double price;

    private boolean status;

    private String description;

    private long carmaker_id;
}
