package org.cg.fundamentals;

public class ScopeOfVariable {

	public static void main(String[] args) {
		
		int outter = 2;
		{
			int inner = 3;//the scope this varaible is only inside the loop 
			System.out.println(inner);
			
			System.out.println(outter);
		}
		 int inner = 4; // if we same name inside and outside varaible compiler not sow error
		 System.out.println(inner);
		 System.out.println(outter);
		
		 
		 int a=5;
		 int b=5;
		 a +=5;
		 // -=20;
		 b =5%6;
		 System.out.println(b);

	}

}
