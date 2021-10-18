package day32_stringBuilder;

import java.time.LocalTime;

public class C2_StringBuilder2 {

	public static void main(String[] args) {
		// 1000 kere donecek bir loop yazalim
		// loop'da String ve StringBuilder kullanip
		// oncesinde ve sonrasinda zaman alalim
		// hizlarini karsilastiralim
		String str = "";
		StringBuilder sb = new StringBuilder();

		LocalTime time = LocalTime.now();
		System.out.println("string oncesi zaman : " + time);

		for (int i = 0; i <= 999; i++) {
			str += i;
		}
		System.out.print(str);
		System.out.println("");

		LocalTime time1 = LocalTime.now();
		System.out.println("String sonrasi sb oncesi zaman : " + time1);

		for (int i = 0; i < 1000; i++) {
			sb.append(i);
		}
		System.out.print(sb);
		System.out.println("");

		LocalTime time2 = LocalTime.now();
		System.out.println("Sb sonrasi zaman : " + time2);
	}

}
