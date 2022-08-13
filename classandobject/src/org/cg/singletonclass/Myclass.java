package org.cg.singletonclass;

public class Myclass {
	static Myclass obj=new Myclass();
	static int countobj;
	private Myclass() {
		System.out.println("Myclass object is created ");
	}
	public static void count() {
		countobj++;
		System.out.println("total obj are : "+countobj);
		
	}
	
	public static Myclass getInstance() {
		return obj;
	}

}
