package com.spring.core.beanscopes;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {  
public static void main(String[] args) {  
    ApplicationContext context=new ClassPathXmlApplicationContext("scopes.xml");  
    Customer objA=context.getBean("cust",Customer.class); 
    
    objA.setName("I'm Mahesh");
    objA.getMessage();

    Customer objB = (Customer) context.getBean("cust");
    objB.getMessage();
    
    Customer objc = (Customer) context.getBean("cust");
    objc.getMessage();
    Customer objd = (Customer) context.getBean("cust");
    objd.setName("I'm prasanth");

    objd.getMessage();
}  
} 
