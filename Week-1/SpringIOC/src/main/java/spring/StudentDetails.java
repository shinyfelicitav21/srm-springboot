package spring;

import java.util.List;

public class StudentDetails {

	public StudentDetails() {
		System.out.println("Performance Status..");	
		
	}
private String status;
	
	private List names;

	public List getNames() {
		return names;
	}

	public void setNames(List names) {
		this.names = names;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "StudentDetails [status=" + status + ", names=" + names + "]";
	}

	
}
