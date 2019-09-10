package com.practice.jdk8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StringToDate {
	
	public static void main(String[] args) {
		
		String format1 = "05/09/2019";
		String format2 ="Wednesday, Sep 04, 2019 11:11:56 PM";
		
		dateFormat1(format1);
		dateFormat2(format2);
	}

	private static void dateFormat1(String dateInString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate = LocalDate.parse(dateInString, formatter);

        System.out.println(formatter.format(localDate));
		
	}
	
	private static void dateFormat2(String dateInString) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a");

        try {

            Date date = formatter.parse(dateInString);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }
		
		
	}

}
