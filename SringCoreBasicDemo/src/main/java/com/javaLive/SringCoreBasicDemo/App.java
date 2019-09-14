package com.javaLive.SringCoreBasicDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*BeanFactory beanFactory = 22 - Spring REST
                new XmlBeanFactory( new ClassPathResource("spring-beans.xml"));
 
        GreetingMessage obj = (GreetingMessage) beanFactory.getBean("greetingMessage");
         
        String message = obj.getMessage();
        System.out.println(message);*/
        
    	
    	ApplicationContext context = 
    	           new ClassPathXmlApplicationContext("spring-config.xml");
    	          
    	          GreetingMessage obj = (GreetingMessage) context.getBean("greetingMessage");
    	          
    	          String message = obj.getMessage();
    	          System.out.println(message);
    }
}
