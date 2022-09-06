package org.cg.finalKeyword;

public class Base {
	final int speed=40;
	
	Base(){
		System.out.println("default constrcutor ");
	}
	void methodx() {
		System.out.println("method x is called ");
	}
	public final void  methody() {
		System.out.println("method y called");
	}

}
