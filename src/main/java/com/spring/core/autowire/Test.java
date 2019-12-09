package com.spring.core.autowire;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {  
public static void main(String[] args) {  
    ApplicationContext context=new ClassPathXmlApplicationContext("AW.xml");  
    Customer cust=context.getBean("cust",Customer.class);  
    cust.display();  
}  
} 
