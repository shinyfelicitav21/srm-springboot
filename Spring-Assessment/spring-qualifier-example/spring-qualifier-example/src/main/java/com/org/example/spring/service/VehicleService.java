package com.org.example.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.org.example.spring.bean.Vehicle;

@Component
public class VehicleService {

   @Autowired
   @Qualifier("carBean")
   private Vehicle vehicle;

   public void service() {
      vehicle.start();
      vehicle.stop();
   }
}
