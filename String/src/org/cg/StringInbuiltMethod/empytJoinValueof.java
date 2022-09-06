package org.cg.StringInbuiltMethod;

public class empytJoinValueof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		System.out.println(str.isEmpty());
		//join
		str=String.join("hello","world","blind");
		System.out.println(str);
		
		//value of
		int a=30;
		float b=2.55f;
		String v =String.valueOf(b);
		System.out.println(10+v);

	}

}
