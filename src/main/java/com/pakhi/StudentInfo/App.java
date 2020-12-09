package com.pakhi.StudentInfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    			
    			//Name obj = (Name)context.getBean("name");
    				Id obj1 = (Id)context.getBean("id");
    			//obj.std();
    				obj1.std();
    				
    	
 
    
    }
}
