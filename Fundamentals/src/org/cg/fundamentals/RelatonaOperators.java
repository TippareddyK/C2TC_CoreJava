package org.cg.fundamentals;

import java.util.Random;

public class RelatonaOperators {

	public static void main(String[] args) {
		//we will take random input from compiler so
		Random random = new Random();
		int i = random.nextInt (100);
		int j = random.nextInt(100);
		System.out.println("i =  " + i);
		System.out.println("j = " +j);
		// relational operator
		System.out.println("i>j " + (i>j));
		System.out.println("i<j " + (i<j));
		System.out.println("i>=j " + (i>=j));
		System.out.println("i<=j " + (i<=j));
		System.out.println("i==j " + (i==j));
		System.out.println("i!=j " + (i!=j));
		

	}

}
