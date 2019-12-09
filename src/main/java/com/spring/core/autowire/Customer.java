package com.spring.core.autowire;

public class Customer {
	Address address;

	Customer() {
		System.out.println("Customer is created");
	}


	public Customer(Address address) {
		super();
		this.address = address;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	void print() {
		System.out.println("hello Customer");
	}

	void display() {
		print();
		address.print();
	}
}
