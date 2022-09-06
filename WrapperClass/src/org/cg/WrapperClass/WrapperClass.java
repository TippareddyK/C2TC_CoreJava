package org.cg.WrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20 ;
		float b=2.025f;
		double c=2.8585;
		char d='a';
		byte e=10;
		short f=20;
		long g=40;
		boolean h=true;
		
		// autoboxing converting primitive to object 
		Integer a1=a;
		Float b1=b;
		Double c1=c;
		Character d1=d;
		Byte e1=e;
		Short f1=f;
		Long g1=g;
		Boolean h1=h;
		System.out.println("auto boxing = " +a1);
		System.out.println("auto boxing = " +b1);
		
		System.out.println("auto boxing = " +c1);
		
		System.out.println("auto boxing = " +d1);
		System.out.println("auto boxing = " +e1);
		System.out.println("auto boxing = " +f1);
		System.out.println("auto boxing = " +g1);
		System.out.println("auto boxing = " +h1);
		//unboxing
		Integer obj1=25;
		Float obj2=2.255f;
		Character obj3='l';
		Boolean obj4=false;
		Short obj5=25;
		Double obj6=6.56;
		Long obj7= 22l;
		Byte obj8=56;
		int a2=obj1 ;
		float b2=obj2;
		double c2=obj6;
		char d2=obj3;
		byte e2=obj8;
		short f2=obj5;
		long g2=obj7;
		boolean h2=obj4;
		System.out.println("unboxing :"+a2);
		System.out.println("unboxing :"+b2);
		System.out.println("unboxing :"+c2);
		System.out.println("unboxing :"+d2);
		System.out.println("unboxing :"+e2);
		System.out.println("unboxing :"+f2);
		System.out.println("unboxing :"+g2);
		System.out.println("unboxing :"+h2);
		
		
		
		
		
		
		
		
		
		

	}

}
