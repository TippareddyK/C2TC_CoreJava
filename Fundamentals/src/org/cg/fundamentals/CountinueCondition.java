package org.cg.fundamentals;

import java.util.Scanner;

public class CountinueCondition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("enter the value of n = ");
		int n=input.nextInt();
		for (int i=1;i<=n;i++) {
			if(i%2==0)
				continue;
			else
				System.out.print(" " + i);
				
		}//its prints odd numbers 
		
	}

}
