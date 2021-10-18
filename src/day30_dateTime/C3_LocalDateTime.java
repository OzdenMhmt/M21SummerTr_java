package day30_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C3_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("aktual tarih ve zaman : "+ldt);//2021-08-02T22:04:41.657866700

		LocalDate d=LocalDate.of(2016, 1, 10);
		LocalTime t=LocalTime.of(13, 30);
		
		LocalDateTime ldt1=LocalDateTime.of(d, t);
		System.out.println(d);//2016-01-10
		System.out.println(t);//13:30
		System.out.println(ldt1);//2016-01-10T13:30
		
		System.out.println(ldt.getHour());//22
		System.out.println(ldt1.getHour());//13
		
		String time=ldt.toString();
		System.out.println(time.startsWith("2021"));//true
		System.out.println(time.endsWith("700"));//false
	}

}
