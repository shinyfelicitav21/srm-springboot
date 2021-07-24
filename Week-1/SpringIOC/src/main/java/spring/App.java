package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
public static void main(String args[]) {
	
	ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
	Student s= (Student)ac.getBean("stud");
	
	((AbstractApplicationContext) ac).registerShutdownHook();
	
	System.out.println(s.getId());
	System.out.println(s.getName());
    System.out.println(s.getSdetails().getStatus());
    System.out.println(s.getSdetails().getNames());

    System.out.println("Done...");
    
}
}