package org.cg.DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DiffDateCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate hh=LocalDate.of(2001,Month.AUGUST,10);
		LocalDate hh1=LocalDate.now();
		Period per=hh.until(hh1);
		System.out.println(per.getDays());
		System.out.println(per.getMonths());
		System.out.println(per.getYears());

	}

}
