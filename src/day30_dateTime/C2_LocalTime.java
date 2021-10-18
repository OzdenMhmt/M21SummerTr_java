package day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C2_LocalTime {

	public static void main(String[] args) {
		LocalTime zman=LocalTime.now();
		System.out.println(zman);//21:36:01.172022900
		LocalTime time1=LocalTime.of(12,35,23);
		System.out.println(time1);//12:35:23
		System.out.println("su zamandan 2 saat ileri 34 dk geri 45 sn ileri : "+zman.plusHours(2).minusMinutes(34).plusSeconds(45));
		//23:07:04.551696200
		
		for (int i = 0; i <10000; i++) {
			System.out.print(i);
		}
		LocalTime zman2=LocalTime.now();
		System.out.println("");
		System.out.println(zman2);
		
		
		//ulke saatleri hesaplama:
		ZonedDateTime yer=ZonedDateTime.now();
		System.out.println(yer);
		//2021-08-02T21:53:00.517332700+03:00[Europe/Moscow]
		
		ZonedDateTime yer2=ZonedDateTime.now(ZoneId.of("Europe/Amsterdam"));
		System.out.println(yer2);
		//2021-08-02T20:54:08.793833100+02:00[Europe/Amsterdam]
		System.out.println(yer.now(ZoneId.of("America/Chicago")));
		// 2021-08-02T13:55:31.942789400-05:00[America/Chicago]
	}

}
