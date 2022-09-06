package org.cg.thisKeyword;

public class mainMethod {

	public static void main(String[] args) {
		System.out.println("creating obj for base ");
		Base obj=new Base();
		System.out.println("------------------------------------------------------------------");
		System.out.println("creating obj for base1");
		Base1 obj1=new Base1();
		System.out.println("------------------------------------------------------------------");
		System.out.println("creating obj for base1 int values");
		Base1 obj3=new Base1(10);
		System.out.println("------------------------------------------------------------------");
		System.out.println("creating obj for base1 2 int values");
		Base1 obj4=new Base1(25,36);
		System.out.println("------------------------------------------------------------------");
		System.out.println("creating obj for derived 2 int values");
		Derived obj5=new Derived(25,36);
		System.out.println("------------------------------------------------------------------");
		System.out.println("creating obj for derived 2 int values");
		Derived obj6=new Derived(25);
		
		
		
		
		
	}

}
