package com.nashtechglobal.service.ulti;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {
	
	private DateTimeUtils()
	{
		
	}
	
	public static String formatDate(LocalDate dateTime, String pattern)
	{	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		return formatter.format(dateTime);
	}
	
	public static LocalDateTime createDate(String dateTime, String pattern)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		
		return LocalDateTime.parse(dateTime,formatter);
	}
	
	public static String convertDate(String date, String fromPattern, String toPattern)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(fromPattern);
		LocalDateTime dateTime = LocalDateTime.parse(date,formatter);
		return DateTimeFormatter.ofPattern(toPattern).format(dateTime);
		
	}
}
