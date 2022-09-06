package org.cg.finalKeyword;

public class Excutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d=new Derived();
		d.methodX();
		d.methody();
		d.methodx();
		System.out.println("------------------------------------------------");
		Base b=new Base();
		b.methodx();
		b.methody();
		System.out.println("------------------------------------------------");
		/*Derived d1=(Derived)b;
		d1.methodx();
		d1.methody();
		d1.methodX();*/
		
		System.out.println("------------------------------------------------");
		Base b1=(Base)d;
		b1.methodx();
		b1.methody();
	
	


	}

}
