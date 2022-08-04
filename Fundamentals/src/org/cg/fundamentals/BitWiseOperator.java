package org.cg.fundamentals;

public class BitWiseOperator {
	public static void main(String[] args) {
		int i=6;
		//first convert 6 to binary form
		//16 8 4 2 1
		//0 0 1 1 0 =means binary form of 6 is 00110
		//right shift binary form one time 0 0 0 1 1 = 3
		System.out.println(i>>1);//i>>1 means sift once if put i>>2 then two time shift
		System.out.println(i<<1);//left shift one time
		//left shift binary form one time 0 1 1 0 0 = 12
	}

}
