package day30_dateTime;

import java.time.LocalDate;

public class C1_LocalDate {

	public static void main(String[] args) {
		LocalDate tarih = LocalDate.now();// tarih isminde obj creat ettik.new anahtari kullanilmaz.
		System.out.println("bugunun tarihi :" + tarih);// 2021-08-02

		System.out.println("bugunden 21 gun sonrasi : " + tarih.plusDays(21));// 2021-08-23

		System.out.println("bugunden 3 yil sonrasi : " + tarih.plusYears(3));// 2024-08-02

		System.out.println("bugunden  3 gun 5 ay 2 yil sonrasi : " + tarih.plusDays(3).plusMonths(5).plusYears(2));
		// 2024-01-05

		System.out.println("bugunden 40 gun oncesi : " + tarih.minusDays(40));// 2021-06-23
		System.out.println(
				"bunun 5 yil oncesi 2 aya sonrasi 3 hafta ertesi : " + tarih.minusYears(5).plusMonths(2).plusWeeks(3));
		// 2016-10-23

		/*
		 * localDate classindan uretilen obj method chain kuralina uyar. ve methodlar
		 * ayni(homojen) olmak zorunda degildir.19.satir
		 */

		System.out.println(tarih.getDayOfMonth());// 2
		System.out.println(tarih.getYear());// 2021
		System.out.println(tarih.getDayOfYear());// 214
		System.out.println(tarih.getMonthValue());// 8
		System.out.println(tarih.getDayOfWeek());//MONDAY
		System.out.println(tarih.getMonth());//AUGUST
		
		LocalDate dogumGunu=LocalDate.of(1990,10,12);
		System.out.println("dogum gunu :"+dogumGunu);//1990-10-12
		System.out.println("dogum gunu haftanin gunu : "+dogumGunu.getDayOfWeek());//FRIDAY
		
		System.out.println(dogumGunu.isLeapYear());//false
		
		LocalDate tarih1= LocalDate.of(2015,5,6);
		LocalDate tarih2= LocalDate.of(2015,5,16);

		System.out.println(tarih1.isAfter(tarih2));//false
		System.out.println(tarih1.isBefore(tarih2)); //true
	}

}
