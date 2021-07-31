package com.org.server.main.user;
import java.util.Date;
import javax.validation.constraints.Size;

public class User 
{
private Integer id;
@Size(min=8, message="Name should have atleast 8 characters...")
private String name;

private Date dob;
	
protected User()
{
	
}
public User(Integer id, String name, Date dob) 
{
super();
this.id = id;
this.name = name;
this.dob = dob;
}
public Integer getId() 
{
return id;
}
public void setId(Integer id) 
{
this.id = id;
}
public String getName() 
{
return name;
}
public void setName(String name) 
{
this.name = name;
}
public Date getDob() 
{
return dob;
}
public void setDob(Date dob) 
{
this.dob = dob;
}
@Override
public String toString() 
{

return String.format("User [id=%s, name=%s, dob=%s]", id, name, dob);
}
}
