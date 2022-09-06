package org.cg.StaticKeyword;

public class StaticDemo {
	public String name;
	public int id;
	public   static String clg="nmit";
	public StaticDemo(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	   void change() {
		clg="VTU";
	}
public void display() {
	System.out.println(name+" "+id+" "+clg);
}
}
