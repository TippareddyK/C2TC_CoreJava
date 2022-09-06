package org.cg.LiteralAndNew;

public class SimpleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]= {'a','b','c'};
		String s1=new String(a);
		String s2=new String(s1);
		System.out.println(s1 + " "+ s2);
		System.out.println(s1.equals(s2));
		String str="i am tippareddy "+" from bellary "+"karnataka";
		System.out.println(str);

	}

}
