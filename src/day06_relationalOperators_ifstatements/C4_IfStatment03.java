package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C4_IfStatment03 {

	public static void main(String[] args) {

		/*
		 * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
		 * baslayan gun isimleini yazdirin Ornek: ilkHarf=P output = “Pazar, Pazartesi
		 * veya Persembe” ilkHarf=S output = “Sali” Buyuk kucuk harf problem olmamasi
		 * icin toUpperCase methodunu kullanin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen istedigimiz gun siminin ilk harfini giriniz");
		char harf = scan.next().toLowerCase().charAt(0);
		// toLowerCase()- KULLANICININ GÝRDÝGÝ TÜM HARFLERÝN HEPSÝNÝ KUCULTUR
		// toUpperCase()- KULLANICININ GÝRDÝGÝ TÜM HARFLERÝN HEPSÝNÝ BUYULTUR
		if (harf == 'p' || harf == 'P') {
			System.out.println("pazartesi,persembe veya pazar");

		}
		if (harf == 's') {
			System.out.println("sali");
		}

		if (harf == 'c') {
			System.out.println("carsamba, cuma veya cumartesi");
		}

		if (harf != 'p' && harf != 's' && harf != 'c') {
			System.out.println("Lutfen gün ismi giriniz");
		}
scan.close();
	}

}
