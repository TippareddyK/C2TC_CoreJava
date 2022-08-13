package org.cg.enumexample;

enum months{
	jan(31),feb(28),mar(31),apr(30),may(31),jun(30),july(31),aug(31),sep(30),oct(31),nov(30),dec(31);
	private int days;
	private months(int days) {
		this.days = days;
	}
	public int getdays(){
		return days;
	}
}

public class Enum {
	public static void main(String[] args) {
		System.out.println("days in month of nov are : " + months.dec.getdays());
		

	}

}
