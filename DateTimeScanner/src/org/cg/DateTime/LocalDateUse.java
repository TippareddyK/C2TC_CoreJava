package org.cg.DateTime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		LocalDate INP=LocalDate.of(2022, Month.FEBRUARY, 15);
		System.out.println(date.plusDays(1));
		System.out.println(date.minusDays(1));
		System.out.println(date.compareTo(INP));
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.isLeapYear());
		

	}

}
