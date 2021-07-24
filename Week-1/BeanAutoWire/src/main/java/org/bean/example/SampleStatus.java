package org.bean.example;

public class SampleStatus {
String status;

public SampleStatus() {
	
	       System.out.println("In Status Class..");
		
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

@Override
public String toString() {
	return "SampleStatus [status=" + status + "]";
}

void print(){
	System.out.println("Welcome to Status Class!!");
	}
}
