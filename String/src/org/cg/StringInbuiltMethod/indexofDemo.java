package org.cg.StringInbuiltMethod;
import java.util.Scanner;

public class indexofDemo {
	public static void main(String[]args) {
		Scanner inpuut=new Scanner (System.in);
		System.out.println("enter");
		String str=inpuut.nextLine();
		System.out.println(str.indexOf('a'));
		int a=str.indexOf('y', 8);
		System.out.println(a);
		int b=str.indexOf("reddy");
		System.out.println(b);
		System.out.println(str.indexOf("ti"));
		System.out.println(str.substring(5).indexOf('e'));
		System.out.println(str.substring(3, 8).indexOf('d'));
		System.out.println(str.replace('d', 'y'));
		
		
	}

}
