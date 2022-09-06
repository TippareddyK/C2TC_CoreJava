package org.cg.DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime time=ZonedDateTime.now();
		System.out.println(time);
		ZonedDateTime USA=ZonedDateTime.now(ZoneId.of("America/Maceio"));
		System.out.println(USA);

	}

}
