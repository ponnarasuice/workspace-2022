package com.example.basics;

import com.example.basics.configuration.ApplicationConfiguration;
import com.example.basics.models.Car;
import com.example.basics.models.Truck;
import com.example.basics.models.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String args[]) {
    // usually we create objects by new operator. spring takes care of that and stores it in context
    // need to include the spring-context jar, spring-core jar, spring beans


    

    // spring creates objects based on the configurations in xml or annotations
    ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
    Vehicle bike = (Vehicle) context.getBean("createBike");
    bike.rideType();
//    Vehicle truck = (Vehicle) context.getBean("createTruckCons", "heavyvehicle");
//    truck.rideType();
    Vehicle car = context.getBean(Car.class);
car.rideType();

  }
}
