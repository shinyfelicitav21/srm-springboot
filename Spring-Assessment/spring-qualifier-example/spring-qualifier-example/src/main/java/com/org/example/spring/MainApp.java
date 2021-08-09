package com.org.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.example.spring.service.VehicleService;

public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext();

      
      context.scan("com.org.example.spring.bean");
      context.scan("com.org.example.spring.service");
      context.refresh();

      VehicleService vehicle = context.getBean(VehicleService.class);
      vehicle.service();

      context.close();
   }
}
