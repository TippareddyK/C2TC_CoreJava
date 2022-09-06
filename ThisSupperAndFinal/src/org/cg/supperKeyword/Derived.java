package org.cg.supperKeyword;

public class Derived extends Base1{
	Derived (){
		System.out.println("der constrcutor called");
	}
	Derived(int i,int j){
		super (i);
		System.out.println("constrctor with two int values in derived"+i +" " +j);	
	}
	Derived (int i){
		System.out.println("int 1 values in derived class " + i);
	}

}
