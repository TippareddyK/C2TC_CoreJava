package org.cg.StringInbuiltMethod;

public class formatdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="new story";
		int a=25;
		float b=0.25f;
		String s1=String.format("%d",a);
		String s2=String.format("%f",b);
		String s3=String.format("%16.12f",b);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
