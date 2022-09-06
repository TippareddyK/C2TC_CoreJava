package org.cg.LiteralAndNew;

import java.util.Scanner;

public class CharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter name ");
		String name=input.nextLine();
		int Ucount=0;
		int lcount=0;
		
		if(!name.isEmpty()) {
			for (char i:name.toCharArray()) {
				if(!Character.isDigit(i)&&Character.isAlphabetic(i)) {
					if(Character.isUpperCase(i)) {
						Ucount++;
					}
					else {
						lcount++;
					}
				}
				
			}
			
			
		}
		System.out.println(Ucount);
		System.out.println(lcount);
		

	}

}
