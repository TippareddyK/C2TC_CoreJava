package org.cg.fundamentals;

import java.util.Scanner;

public class SwichCondtion {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter the value between (1-5) =  ");
		int i=input.nextInt();
		switch (i)
		{
		case (1): System.out.println("u entered 1");
		break;
		case (2):System.out.println("U entered 2");
		break;
		case (3): System.out.println("u entered 3");
		break;
		case (4): System.out.println("u entered 4");
		break;
		case (5): System.out.println("u entered 5");
		break;
		default : System.out.println("wrong number");
		break;
			
		}

	}

}
