package com.org.server.main.user;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Component;
@Component
public class UserDaoService 
{
public static int usersCount=5;

private static List<User> users=new ArrayList<>();
 
static
{

users.add(new User(121, "Kiran", new Date()));
users.add(new User(245, "Teena", new Date()));
users.add(new User(343, "Sheera", new Date()));
users.add(new User(432, "Dev", new Date()));
users.add(new User(534, "Sunny", new Date()));
}

public List<User> findAll()
{
return users;
}

public User save(User user)
{
if(user.getId()==null)
{
user.setId(++usersCount);
}
users.add(user);
return user;
}

public User findOne(int id)
{
for(User user:users)
{
if(user.getId()==id)
return user;
}
return null;
}

public User deleteById(int id)
{
Iterator<User> iterator = users.iterator();
while(iterator.hasNext())
{
User user=iterator.next();
if(user.getId()==id)
{
iterator.remove();
return user; 
}
}
return null;
}
}