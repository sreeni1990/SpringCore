package com.spring.core.beanscopes;

public class Customer {
	String name;

	Customer() {
		System.out.println("construct created");
	}
	
	 public void getMessage(){
	      System.out.println("Your name : " + name);
	   }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(String name) {
		super();
		this.name = name;
	}

}
