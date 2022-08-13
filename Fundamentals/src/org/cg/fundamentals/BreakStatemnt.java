package org.cg.fundamentals;

import java.util.Random;

public class BreakStatemnt {

	public static void main(String[] args) {
		Random numer = new Random();
		int i =numer.nextInt(100);
		System.out.println(i);
		for (int j=1;j<i;j++) {
			if(j%4==0) {
				System.out.println(j);
				break;
			}
			else
				System.out.println(j);
		}

	}

}
