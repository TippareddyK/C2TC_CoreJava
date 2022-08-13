package org.cg.singletonclass;

public class Executor {

	public static void main(String[] args) {
		Myclass obj=Myclass.getInstance();
		Myclass.count();
		System.out.println("creating one more reference ");
		Myclass obj1=Myclass.getInstance();
		Myclass.count();
	

	}

}
