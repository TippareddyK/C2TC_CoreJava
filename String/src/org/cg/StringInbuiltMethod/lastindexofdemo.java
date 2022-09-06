package org.cg.StringInbuiltMethod;

public class lastindexofdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="tippareddy";
		System.out.println(str1.lastIndexOf('r'));
		int b=str1.lastIndexOf('r',3);
		System.out.println(b);
		System.out.println(str1.lastIndexOf(str1.substring(1)));
		System.out.println(str1.substring(5).lastIndexOf('y'));
		String str2="tippareddyee";
		System.out.println(str2.lastIndexOf('e'));
		String str3="hello world of my ";
		int a=str3.lastIndexOf("of",11);
		System.out.println(a);
				
	}

}
