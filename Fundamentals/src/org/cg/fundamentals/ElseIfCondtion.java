package org.cg.fundamentals;

import java.util.Scanner;

public class ElseIfCondtion {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the age = ");
		int age=input.nextInt();
		if (age >=60)
		{
			System.out.println("Applicable for PMvvy and voting");
		}
		else if (age <60 && age >= 18) {
			System.out.println("applicable for voting");
		}
		else if (age <60 && age >=18)
		{
			System.out.println("test");
		}
		else {
			System.out.println("teen ager");
		}//in else if condition if any one condition true then its not check for next condtion
	}//both else if condition are true but its print only 1st one

}
