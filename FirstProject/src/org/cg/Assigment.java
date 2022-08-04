package org.cg;

public class Assigment {
	
	public static void main(String[] args) {
		float b = 450000;
		if (b > 1000000) {
			float a = (float)30/100;
			float taxc = a*b;
			System.out.print("Tax to be paid = ");
			System.out.println(taxc);
		}
		else if (b > 500000 & b <= 1000000) {
			float a = (float)20/100;
			float taxc = a*b;
			System.out.print("Tax to be paid = ");
			System.out.println(taxc);
			
		}
		else {
			float a = (float)5/100;
			float taxc = a*b;
			System.out.print("Tax to be paid = ");
			System.out.println(taxc);
				
		}
		
	}

}
