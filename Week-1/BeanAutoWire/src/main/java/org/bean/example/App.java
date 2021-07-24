package org.bean.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");  
	    System.out.println("Autowire-ing using byName");
	   Sample s= ( Sample) ac.getBean("s",Sample.class);  
	   s.display();  
	   System.out.println(s.getMessage());
	   System.out.println(s.getSstatus().getStatus());
	   
	   System.out.println("-------------------------");
	   System.out.println("Autowire-ing using byType");
	   SampleClass sc= (SampleClass) ac.getBean("sc",SampleClass.class);  
	   sc.display();  
	   System.out.println(sc.getMessage());
	   System.out.println(sc.getSstatus().getStatus());

	}

}
