package org.cg.usingstatic;

public class UsingStatic {
	

	public UsingStatic() {
		super();
		System.out.println("constructor invoked");
	}
	int var_instance;
	static int var_static;
	//declaring non static method
	public void methodX() {
		var_instance=4;
		var_static=5;
	}
	public static void main(String[] args) {
		var_static=4;
		UsingStatic lol=new UsingStatic();
		lol.var_instance=4;
		System.out.println("static :"+var_static+"\n"+"non static :"+lol.var_instance);

	}

}
