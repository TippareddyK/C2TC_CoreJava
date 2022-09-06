package org.cg.StaticKeyword;

public   class UsingStatic {
	public UsingStatic() {
		System.out.println("invoked");
	}
	int var_instance;
	static int Var_local;
	public void method() {
		var_instance=4;
		Var_local=6;
		System.out.println(var_instance + " " + Var_local);
	}
public static void main (String[]args) {
	Var_local=9;
	UsingStatic us=new UsingStatic();
	us.var_instance=5;
	System.out.println("satic:"+Var_local+" non static :"+us.var_instance);
	us.var_instance++;
	UsingStatic.Var_local=6;
	System.out.println("satic:"+Var_local+" non static :"+us.var_instance);
	us.method();
	

	
	
}
}
