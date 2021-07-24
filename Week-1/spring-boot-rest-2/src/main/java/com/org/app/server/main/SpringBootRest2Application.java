package com.org.app.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.org.app"})
public class SpringBootRest2Application {

    public static void main(String[] args) {
    SpringApplication.run(SpringBootRest2Application.class, args);
    }
}
