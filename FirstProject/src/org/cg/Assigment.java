package org.cg;

public class Assigment {
	
	public static void main(String[] args) {
		float salary = 450000;
		if (salary > 1000000) {
			float a = (float)30/100;
			float tax = a*salary;
			System.out.print("Tax to be paid = ");
			System.out.println(tax);
		}
		else if (salary > 500000 & salary <= 1000000) {
			float a = (float)20/100;
			float tax = a*salary;
			System.out.print("Tax to be paid = ");
			System.out.println(tax);
			
		}
		else {
			float a = (float)5/100;
			float tax = a*salary;
			System.out.print("Tax to be paid = ");
			System.out.println(tax);
				
		}
		
	}

}
