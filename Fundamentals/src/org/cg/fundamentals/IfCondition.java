package org.cg.fundamentals;

public class IfCondition {

	public static void main(String[] args) {
		int i=17;
		int j=16;
		if (i>j) //if is stand alone block so if first loop true also its check other if condition
		{
			System.out.println("I is greater then j");
		}
		if (j<i)
		{
			System.out.println("J is greater then i");
		}
		else {
			System.out.println("Both are equal");
		}

	}// so its printing both condtion

}
