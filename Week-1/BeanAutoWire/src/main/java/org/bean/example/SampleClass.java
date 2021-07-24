package org.bean.example;

public class SampleClass {
String message;
SampleStatus sstatus;



public SampleClass() {
	super();
}

public SampleStatus getSstatus() {
	return sstatus;
}

public void setSstatus(SampleStatus sstatus) {
	this.sstatus = sstatus;
}

public SampleClass(String message) {
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
