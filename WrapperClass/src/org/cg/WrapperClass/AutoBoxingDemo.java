package org.cg.WrapperClass;

public class AutoBoxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int a=20;
		Integer i=Integer.valueOf(a);//manually passing
		Integer j=a;//autoboxing
		System.out.println(a+"  "+i+"  "+j);


	}

}
