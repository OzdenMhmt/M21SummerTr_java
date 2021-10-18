package day15_forLoop;

import java.util.Iterator;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		// 10 dan 20 ye kadar olan sayilari yazdiran bir loop olusturalim

		for (int i = 10; i <= 20; i++) {
			System.out.print(i + " ");

		}
		// 100 ie 200 dahil aralarindaki 10 ile bolunebilen sayilari yazdirin
		System.out.println("");
		for (int i = 100; i <= 200; i += 10) {
			System.out.print(i + " ");

		}
		// 50den 20 ye kadar 3 ere 3er geri sayarak yazdiralim
		System.out.println("");
		for (int i = 50; i >= 10; i -= 3) {
			System.out.print(i + " ");
		}

		// 50 ile 100 arasýnda 3 ile bolunebilen sayilari yazdirin
		System.out.println("");
		for (int i = 50; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
			// eger degiskenimiz degistikce verilen artis veya azalisla bitis kosuluna
			// ulasamýyorsa sonsuz loop olusur ve sistem cokene kadar loop calýsmaya devam
			// eder
			/*
			 * for (int j = 10; j < 20; j--) { System.out.print(i + " ");
			 */

		}
		// eger baslangýc degeri kosulu saglamiyorsa
		// loop body hic calýsmadan loop'un sonuna gider
		// loop islevsiz olur,olu dogar
		for (int i = 10; i < 0; i++) {
			System.out.println(i + " ");
		}
		System.out.println("son for loop un sonrasi");
	}

}
