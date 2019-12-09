package com.spring.core.ci;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("ci.xml");  
        BeanFactory factory=new XmlBeanFactory(r);       
        Employee emp=(Employee)factory.getBean("e");  
        emp.show();  
          
    }  
}  