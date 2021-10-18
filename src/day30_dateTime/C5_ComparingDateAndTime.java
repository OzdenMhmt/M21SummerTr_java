package day30_dateTime;

import java.time.LocalDate;

public class C5_ComparingDateAndTime {

	public static void main(String[] args) {
		LocalDate bugun=LocalDate.now();
		LocalDate date=LocalDate.of(2020, 11, 15);
		int fark=bugun.compareTo(date);
		System.out.println(bugun);//2021-08-02
		System.out.println(date);//2020-11-15
		System.out.println(fark);//1

		//karsilastirilan iki tarihin en buyuk parcasinin farkini verir
	}

}
