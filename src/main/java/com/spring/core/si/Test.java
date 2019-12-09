package com.spring.core.si;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Test {  
public static void main(String[] args) {  
    Resource r=new ClassPathResource("si.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    Employee e=(Employee)factory.getBean("obj");  
    e.displayInfo();  
      
}  
}