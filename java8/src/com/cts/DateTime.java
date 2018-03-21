package com.cts;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2017, Month.FEBRUARY, 10);
	      System.out.println("date: " + date);
	      LocalDate date1=LocalDate.ofYearDay(2017, 65);
	      System.out.println("Day: " + date1);
	      LocalTime date2=LocalTime.ofSecondOfDay(12345);
	      System.out.println("date: " + date2);
	      LocalDateTime  date3 = LocalDateTime.of(2014, Month.FEBRUARY, 20, 12, 00);
          System.out.println(date3);
          LocalDate date4 = LocalDate.now();
            LocalDate date5 = LocalDate.parse("2017-02-05");
            System.out.println(date5.isBefore(date4));  
	}

}
