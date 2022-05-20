package com.example.basics.configuration;

import com.example.basics.models.Bike;
import com.example.basics.models.Engine;
import com.example.basics.models.Truck;
import com.example.basics.models.Vehicle;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@ComponentScan(basePackages = {"com.example.basics"})
@Scope(
    value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
    proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ApplicationConfiguration {

  @Bean
  public Vehicle createBike() {
    return new Bike();
  }

  @Bean
  public Vehicle createTruckCons() {
    Vehicle truck = (Vehicle) new Truck("truck");
    return truck;
  }

  @Bean
  @ConditionalOnMissingBean
  public Engine engine1(){
    Engine engine = new Engine();
    return engine;
  }

  @Bean
  @Scope(value = "prototype")
  public Engine engine2(){
    Engine engine = new Engine();
    return engine;
  }
}
