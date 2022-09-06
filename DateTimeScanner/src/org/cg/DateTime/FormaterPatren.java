package org.cg.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormaterPatren {

	public static void main(String[] args) {
		LocalDate obj = LocalDate.now();
		System.out.println(obj);
		DateTimeFormatter obj1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String FormattedDate=obj.format(obj1);

		System.out.println(FormattedDate);
		LocalTime time=LocalTime.now();
		DateTimeFormatter time1=DateTimeFormatter.ofPattern("HH*mm*ss");
		String time2=time.format(time1);
		System.out.println(time2);
		LocalDateTime DT=LocalDateTime.now();
		DateTimeFormatter DT1=DateTimeFormatter.ofPattern("hh*mm*ss.a ___ z");
		String DT2=DT.format(DT1);
		System.out.println(DT2);
		//System.out.println(year);
		
		
		
	}

}
