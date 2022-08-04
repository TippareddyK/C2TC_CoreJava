package org.cg.fundamentals;

public class PreAndPostIncerment {
	public static void main(String[] args) 
	{
		  int a =5;
		  int b=2;
		  int c=-1;
		  System.out.println(a++);//first store defined value so its print 5 then increment by 1 5+1=6
		  
		  System.out.println(++a);//first increment then store so before value 6 now 6+1=7
		  System.out.println(a--);//first store a value then decrement 
		  System.out.println(--a);//first decrement then store
		  int d= --a + b++ + --c ;
		  //--a=4,b=2,-1 =4+2-1=5
		  System.out.println(d);
		 
		  
		  
		  
		  
	}
	

}
