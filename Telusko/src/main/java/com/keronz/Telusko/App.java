package com.keronz.Telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       Car car = new Car();
//       car.drive();
    	
//    	Bike obj = new Bike();
//    	obj.drive();
    	
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
//    	Vehicle obj = (Vehicle)context.getBean("car");
//    	obj.drive();
    	
    	Tyre t = (Tyre) context.getBean("tyre");
    	System.out.println(t);
    	
    }
}
