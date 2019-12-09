package com.spring.core.looseCoupled;

public class Manager {
	IWorker worker;
	public Manager(IWorker worker) {

		this.worker=worker;
		
	}

	public void ManageWork() {	
		
		this.worker.work();
	}

}
