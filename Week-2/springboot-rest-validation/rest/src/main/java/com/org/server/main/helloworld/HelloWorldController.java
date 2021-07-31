package com.org.server.main.helloworld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Configuration;
@Configuration

@RestController
public class HelloWorldController 
{

@GetMapping(path="/hello-world")
public String helloWorld()
{
return "Hello World";
}
@GetMapping(path="/hello-world-bean")

public HelloWorldBean helloWorldBean()
{
return new HelloWorldBean("Hello World");
}

@GetMapping(path="/hello-world/path-variable/{name}")
public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
{
return new HelloWorldBean(String.format("Hello World, %s",name));	
}
}
