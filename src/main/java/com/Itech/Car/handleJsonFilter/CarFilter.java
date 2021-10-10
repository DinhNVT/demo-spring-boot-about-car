package com.Itech.Car.handleJsonFilter;

import com.Itech.Car.model.Car;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import lombok.NoArgsConstructor;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@Component
public class CarFilter {
    public MappingJacksonValue getCars(List<Car> carList) {
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(carList);
        FilterProvider filterProvider = new SimpleFilterProvider()
                .addFilter("filter.Car", SimpleBeanPropertyFilter.serializeAll())
                .addFilter("filter.CarMaker", SimpleBeanPropertyFilter.serializeAllExcept("cars"));
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }

    public MappingJacksonValue getCar(Car car) {
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(car);
        FilterProvider filterProvider = new SimpleFilterProvider()
                .addFilter("filter.Car", SimpleBeanPropertyFilter.serializeAll())
                .addFilter("filter.CarMaker", SimpleBeanPropertyFilter.serializeAllExcept("cars"));
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }
}
