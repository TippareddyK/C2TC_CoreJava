package org.cg.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate td = LocalDate.now();
		System.out.println(td);
		LocalTime tt = LocalTime.now();
		System.out.println(tt);
		LocalDateTime DT=LocalDateTime.now();
		System.out.println(DT);

	}

}
