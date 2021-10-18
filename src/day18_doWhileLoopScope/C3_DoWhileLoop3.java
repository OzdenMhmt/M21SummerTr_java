package day18_doWhileLoopScope;

import java.util.Scanner;

public class C3_DoWhileLoop3 {

	public static void main(String[] args) {
		/*
		 * Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek
		 * icin 0’a basmasini soyleyin.
		 * 
		 * Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif
		 * sayilarin toplaminin kac oldugunu yazdirin. kullanici negatif sayi girerse
		 * ignore edin
		 */

		// while loop profesyonel programcilik icin gerekli-menu kullanimi

		Scanner scan = new Scanner(System.in);

		double sayi = 5;
		int count = 0;
		double sayilarToplami = 0;

		do {
			System.out.println("toplamak uzere pozitif sayilar giriniz " 
		+ "\nislemi bitirmek icin sifira basin");
			sayi = scan.nextDouble();

			if (sayi > 0) {
				sayilarToplami += sayi;
				count++;
			} else if (sayi < 0) {
				System.out.println("pozitif deger girmeliydiniz" + "\nbu sayi negatif oldugu icin yok sayiyorum");
			} else {

			}

		} while (sayi != 0.0);
		
		System.out.println("pozitif sayilar toplami : " + sayilarToplami + " / " +"girdiginiz sayilardan" + count + " tanesi pozitifti");
		scan.close();
	}

}
