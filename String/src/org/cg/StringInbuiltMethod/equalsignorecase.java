package org.cg.StringInbuiltMethod;

import java.util.Scanner;

public class equalsignorecase {
	public static void main(String []args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter1");
		String s1=input.nextLine();
		Scanner input1=new Scanner(System.in);
		System.out.println("enter2");
		String s2=input1.nextLine();
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("both are same but letter i dont know ");
		}
		else {
			System.out.println("both are diff");
		}
		
		
	}
}
