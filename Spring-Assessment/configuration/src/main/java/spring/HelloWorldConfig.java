package spring;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;

@Configure
public class HelloWorldConfig {
   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}
