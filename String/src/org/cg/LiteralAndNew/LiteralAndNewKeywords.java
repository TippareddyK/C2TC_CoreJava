package org.cg.LiteralAndNew;

public class LiteralAndNewKeywords {
	public static void main(String[]args)
	{
		String str1="hello";
		String str2="hello";
		String str3=new String("hello");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		if (str1==str3) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	
	}

}
