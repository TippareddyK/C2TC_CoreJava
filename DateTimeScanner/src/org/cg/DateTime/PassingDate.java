package org.cg.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PassingDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter date in dd/mm/yyyy");
		String input=scanner.nextLine();
		LocalDate date=LocalDate.parse(input,format);
		System.out.println(date);
		scanner.close();
		
	}

}
