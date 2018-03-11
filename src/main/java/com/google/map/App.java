package com.google.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.map.service.GarageService;

/**
 * Hello world!
 *
 */
public class App {
	private static ClassPathXmlApplicationContext context;
    public static void main( String[] args ) {
//    	try {
	    	context = new ClassPathXmlApplicationContext("context.xml");
	    	String car = "HONDA";//args[0];
	    	GarageService service = context.getBean(GarageService.class);
	    	
	    	System.out.println( service.getCleaningTime(car) );
//    	} finally {
//    		context.close();
//    	}
    }
}
