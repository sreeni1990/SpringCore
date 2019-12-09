package com.spring.core.looseCoupled;

public class LazyWorker implements IWorker {
	public void work() {
		System.out.println("Lazy worker working");
	}
}
