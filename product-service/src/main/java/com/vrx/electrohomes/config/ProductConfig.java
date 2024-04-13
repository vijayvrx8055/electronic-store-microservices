package com.vrx.electrohomes.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.vrx.electrohomes")
public class ProductConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
