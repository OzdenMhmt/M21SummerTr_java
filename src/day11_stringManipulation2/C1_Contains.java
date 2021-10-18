package day11_stringManipulation2;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {

		/*
		 * verilen String’in istenen karakter(ler)i 
		 * Icerip icermedigini kontrol eder.
		 * Iceriyorsa TRUE, icermiyorsa FALSE dondurur.
		 * 
		 */

		String str = "Calisirsaniz, Java ogrenmek cok kolay";
		System.out.println(str.contains("a")); // true
		System.out.println(str.contains("t")); // false, indexof'ta -1 verir. cunku ýndexini istiyoruz
		System.out.println(str.contains("Java")); // true

		// Kullanicidan bir cumle ve bir harf isteyin,
		// harfin cumlede var olup olmadigini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String cumle = scan.nextLine().toLowerCase();

		System.out.println("bir kelime giriniz");
		String kelime = scan.next().toLowerCase();

		// indexof ile sorma
		if (cumle.indexOf(kelime) != -1) {
			System.out.println("kelime cümlede kullanilmis");
		} else {
			System.out.println("kelime cumlede kullanýlmamis");
		}

		// contains de sorma-cumlede kelime var mi diye sorar alt satir-37.satir
		if (cumle.contains(kelime)) {
			System.out.println("kelime cümlede kullanilmis");
		} else {
			System.out.println("kelime cümlede kullanilmamis");
		}
		
		
		
scan.close();

	}

}
