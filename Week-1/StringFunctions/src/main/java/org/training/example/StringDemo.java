package org.training.example;

public class StringDemo {

	public static boolean sample(String s1,String s2) {
		return s1.equalsIgnoreCase(s2);
			
	}
	
	public static boolean contains(String s1) {
		return s1.contains("a");
			
	}
	public static int length(String str) {
		return str.length();
		
		}
	public static String concat(String s) {
		return s.concat("Ferirra");
		
		}
	public static int index(String s1) {
		return s1.indexOf('r');
		
		}
	public static int hash(String s2) {
		return s2.hashCode();
		
		}
}
