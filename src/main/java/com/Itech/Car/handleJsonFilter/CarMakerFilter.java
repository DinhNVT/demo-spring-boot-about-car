package com.Itech.Car.handleJsonFilter;

import com.Itech.Car.model.CarMaker;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import lombok.NoArgsConstructor;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@Component
public class CarMakerFilter {
    public MappingJacksonValue getCarMakers(List<CarMaker> carMakerList) {
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(carMakerList);
        FilterProvider filterProvider = new SimpleFilterProvider()
                .addFilter("filter.CarMaker", SimpleBeanPropertyFilter.serializeAllExcept("cars"));
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }
}
