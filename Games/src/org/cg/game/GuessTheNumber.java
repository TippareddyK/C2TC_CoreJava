package org.cg.game;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		Random input=new Random();
		int a =input.nextInt(15);
		int i=1;
		System.out.println("guess the number between 0-15");
		while (i<=3) {
			Scanner input1=new Scanner(System.in);
			System.out.print("guess the number ");
			int b=input1.nextInt();
			if(a==b) {
				System.out.println("you won");
				break;
			}
			else if (i==3) {
				System.out.println("Try Again");
				System.out.println("  0       0");
				System.out.println("  |       | ");
				System.out.println("    ----   ");
			}
			else
			{
				System.out.println("try again you have "+ (3-i) +  "chanceses");
			}
			i++;
		
		}
		System.out.println("The correct number is = "+a);
	}

}
