package org.training.example;

import java.util.Date;

public class DateDemo {
	
	public static Date todayDate()
	  {
		Date d=new Date();
		return d;
		
	  }
	  public static boolean afterDate()
	  {
		  Date d1 = new Date(2020,07,21);
	      Date d2 = new Date(1998, 07, 21);
	      boolean b = d2.after(d1);
	    
	      b = d1.after(d2);
	       return b;
	  }
	  public static boolean beforeDate()
	  {
		  Date d1 = new Date(2020,07,21);
	      Date d2 = new Date(1998, 07, 21);
	   
	       boolean b = d1.before(d2);
	       return b;
}
}
