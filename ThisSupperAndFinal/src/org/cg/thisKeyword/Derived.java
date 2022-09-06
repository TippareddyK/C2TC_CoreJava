 package org.cg.thisKeyword;

public class Derived extends Base1 {
	Derived(int i,int j){
		this (i);
		System.out.println("constrctor with two int values in derived"+i +" " +j);	
	}
	Derived (int i){
		System.out.println("int 1 values in derived class " + i);
	}

}
