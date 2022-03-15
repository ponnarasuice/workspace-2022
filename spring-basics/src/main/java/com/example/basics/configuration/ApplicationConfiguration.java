package com.example.basics.configuration;

import com.example.basics.models.Bike;
import com.example.basics.models.Truck;
import com.example.basics.models.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.basics"})
public class ApplicationConfiguration {

  @Bean
  public Vehicle createBike() {
    return new Bike();
  }

  public Vehicle createTruckCons(String type) {
    Vehicle truck = (Vehicle) new Truck(type);
    return truck;
  }
}
