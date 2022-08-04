package org.cg.fundamentals;

import java.util.Random;

public class TernaryOperator {
	public static void main(String[] args)
	{
		Random random = new Random ();
		int i = random.nextInt(100);
		int j = random.nextInt(100);
		System.out.println("i= " + i);
		System.out.println("j= " + j);
		System.out.println("big number is " + (i>j?i:j));//if its true then its prints j value 
		                              //else its print j value
	}
}
