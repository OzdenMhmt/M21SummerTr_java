package day30_dateTime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C4_DataTimeFormatter {

	public static void main(String[] args) {
		LocalDate bugun=LocalDate.now();
		LocalDate date=LocalDate.of(2020, 5, 15);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy");
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/yy");
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yy");
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd$M$yy");
		//// M :month m : minute
		/*
		 * yy:yilin son iki rakami
		 * y:yilin tamamini
		 * yyyy:yilin tamamini
		 * M: ay sirasini verir
		 * MM:ay sirasini verir
		 * MMM: ay isminin ilk uc harfini verir
		 * MMMM:ay isminin tamamini verir
		 */
		
		System.out.println(dtf.format(bugun));//02/8/21
		System.out.println(dtf1.format(date));//15/05/20
		System.out.println(dtf3.format(bugun));//02$8$21
		System.out.println(dtf2.format(date));//15/May/20
		
		//kac yasindayiz
		LocalDate dt=LocalDate.of(2005, 03, 05);
		System.out.println("bugunun tarihi: "+bugun);
		System.out.println("faruk dt : "+dt);
		Period yasim=Period.between(dt, bugun);
		System.out.println("faruk beyin yasi :"+yasim);
		System.out.println(yasim.getYears());//16
		
	}

}
