package org.cg.StaticKeyword;

public class StaticBlock {
	static {
		System.out.println("1st static ");
	}
 void method() {
	 System.out.println("hello");
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock ff =new  StaticBlock();
		ff.method();
		System.out.println("hey main you are 2nd");
		StaticBlock fg=new  StaticBlock();
		ff.method();
		

	}

}
