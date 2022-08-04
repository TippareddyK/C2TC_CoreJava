package org.cg.fundamentals;

import java.util.Random;

public class LogicalOperators {
	public static void main(String[] args) {
		Random random = new Random ();
		int i = random.nextInt(100);
		int j = random.nextInt(100);
		System.out.println(i);
		System.out.println(j);
		if (i>10 && j<=100)
		{
			System.out.println("both satisfied ");//prints when both true
		}
		else if (i<=10 || j>=50)
		{
			System.out.println("any one satisfies");//prints only if any one of true
		}
		else
		{
			System.out.println("lol");
		}
	}

}
