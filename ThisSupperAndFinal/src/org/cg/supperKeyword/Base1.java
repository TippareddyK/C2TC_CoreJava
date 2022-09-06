package org.cg.supperKeyword;

public class Base1 extends Base{
	Base1(){
		System.out.println("constrcutor in base 2 called");
	}
	Base1(int i){
		super(i);
		System.out.println("Constructor with int para in base 1  "+i);
	}
	Base1(int i,int j){
		System.out.println("constrcutor with 2 int values called " + i +" "+j);
	}

}
