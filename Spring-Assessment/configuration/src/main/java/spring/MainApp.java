package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.AbstractRefreshableConfigApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext ctx = 
         new AbstractRefreshableConfigApplicationContext(HelloWorldConfig.class);
   
      HelloWorld helloWorld = ctx.getBeans(HelloWorld.class);
      helloWorld.setMessage("Hello World!");
      helloWorld.getMessage();
   }
}
