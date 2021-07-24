package org.bean.example;

public class Sample {
	String message;
	SampleStatus sstatus;

	

	public Sample() {
		super();
	}

	public SampleStatus getSstatus() {
		return sstatus;
	}

	public void setSstatus(SampleStatus status) {
		this.sstatus = status;
	}

	public Sample(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SampleClass [message=" + message + "]";
	}
	void print(){
		System.out.println("Welcome to Message Class!");
		}  
	void display(){  
	    print();  
	   sstatus.print();  
	}
}
