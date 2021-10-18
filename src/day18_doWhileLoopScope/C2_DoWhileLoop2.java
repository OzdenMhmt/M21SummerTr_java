package day18_doWhileLoopScope;

import java.util.Scanner;

public class C2_DoWhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki pozitif tamsayi giriniz");

		int sayi1 = 0;
		int sayi2 = 0;

		do {
			sayi1 = scan.nextInt();
			sayi2 = scan.nextInt();
			if (sayi1 > 0 && sayi2 > 0) {
				System.out.println("well done \ngirilen sayilarin carpimi : " + (sayi1 * sayi2));
			} else {
				System.out.println("lutfen iki pozitif tamsayi giriniz");
			}
		} while (!(sayi1 > 0 && sayi2 > 0));
		// do while loop ile 1 tur kazanmýs olduk,
		// (hile loop'dan 1 tur az yapmýs olduk)
		// do while once kodu calistirir sonra dogrulugunu kontrol eder

		// while loop once kontrol eder, sonra calýstýrýr.
		// calýstýktan sonra basa gelip bi daha sarti kontrol eder
		scan.close();
	}

}
