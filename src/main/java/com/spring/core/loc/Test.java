package com.spring.core.loc;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Test {  
public static void main(String[] args) {  
    Resource resource=new ClassPathResource("ac.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);
    
   /* ApplicationContext context =   
    	    new ClassPathXmlApplicationContext("ac.xml");*/  
    Employee emp=(Employee)factory.getBean("emp",Employee.class);  
    emp.getDispalyName();
    emp.setName("prasanth");
    System.out.println(emp.getName());
}  
}

 