package spring;

public class Student {

	String id,name;

	public Student(String place,String source) {
		System.out.println("Place:" +place+ "," +  source);
	}
	
	private StudentDetails sdetails;
	
	public StudentDetails getSdetails() {
		return sdetails;
	}
	public void setSdetails(StudentDetails sdetails) {
		this.sdetails = sdetails;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public void init(){
	      System.out.println("Bean is going through init.");
	   }
	   public void destroy() {
	      System.out.println("Bean will destroy now.");
	   }
}
