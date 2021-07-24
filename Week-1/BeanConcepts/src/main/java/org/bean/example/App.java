package org.bean.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
			 ApplicationContext ac1= new ClassPathXmlApplicationContext("bean.xml");
			  System.out.println("Singleton Scope");
			 Student s1=(Student)ac1.getBean("s1");
			 s1.setId("S123");
			 s1.setName(" Felicita");
			 s1.setPlace("Chennai");
		   
			 System.out.println(s1.getId());
			 System.out.println(s1.getName());
			 System.out.println(s1.getPlace());
			 
			 Student s2=(Student)ac1.getBean("s1");

			 System.out.println(s2.getId());
			 System.out.println(s2.getName());
			 System.out.println(s2.getPlace());
			
		     ApplicationContext ac2 = new ClassPathXmlApplicationContext("bean.xml");
			 Student s3=(Student)ac2.getBean("s2");
			 
			 System.out.println("Prototype Scope");
			 s3.setId("K222");
			 s3.setName("Kiran");
			 s3.setPlace("Trichy");
			
			 System.out.println(s3.getId());
			 System.out.println(s3.getName());
			 System.out.println(s3.getPlace());
			 
			 Student s4=(Student)ac2.getBean("s2");
			 
			 System.out.println(s4.getId());
			 System.out.println(s4.getName());
			 System.out.println(s4.getPlace());
			 
			}
	}


