package com.trinity.commons;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ObjectMapper {

    @Autowired
    private ModelMapper modelMapper;

    public <T, J> J convertTo(T object, Class clazz) {

        J convert = (J) modelMapper.map(object, clazz);

        return convert;
    }
}