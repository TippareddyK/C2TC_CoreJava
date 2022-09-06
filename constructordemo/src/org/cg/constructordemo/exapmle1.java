package org.cg.constructordemo;

public class exapmle1 {
	String name;
	int age;
	double salery;
	void example1(){
		System.out.println("zero parameterized constructor");
	}
	void display() {
		System.out.println(name+" "+salery+" "+age);
	}

	public static void main(String[] args) {
		exapmle1 e1=new exapmle1();
		exapmle1 e2=new exapmle1();
		
		//e1.age=25;
		//e1.name="redd";
		//e1.salery=250.50;
		e1.display();
		
		

	}

}
