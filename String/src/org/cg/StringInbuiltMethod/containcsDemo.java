package org.cg.StringInbuiltMethod;

public class containcsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hey im groot one of avenger....i saved gurdian galexy heros";
		System.out.println(str.contains("groot"));
		System.out.println(str.contains("a"));
		System.out.println(str.contains("...."));
		boolean a=(str.contains("nope"));
		if(a) {
			System.out.println("yes its there");
		}
		else {
			System.out.println("nope");
		}

	}

}
