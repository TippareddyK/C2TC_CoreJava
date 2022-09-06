package org.cg.Scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter you are name");
		String Name=scanner.nextLine();
		if(Name==null) {
			System.out.println("you dont have name ");	
		}
		System.out.println(Name);
		System.out.println("good bye");
		scanner.close();

	}

}
