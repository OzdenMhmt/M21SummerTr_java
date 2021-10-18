package day12_stringManipulation3;

import java.util.Scanner;

public class C03_StringManipulation03 {

	public static void main(String[] args) {
		/*
		 * Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari
		 * sagliyorsa “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem
		 * basarisiz,Lutfen yeni bir sifre girin” yazdirin - Ilk harf buyuk harf olmali
		 * - Son harf kucuk harf olmali - Sifre bosluk icermemeli - Sifre uzunlugu en az
		 * 8 karakter olmali
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("\nLutfen bir sifre giriniz.");
		String sifre = scan.nextLine();

		if ((sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') // 1.sart
				&& (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') // 2.sart
				&& sifre.contains(" ") == false && sifre.length() >= 8 // 3.ve 4. sart
		) {

			System.out.println("Sifre basari ile tanimlandi");
		} else {

			System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
		
		//Hocanin cozumu
			boolean ilkHarfKont=(sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z');
			boolean sonHarfKont=(sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z');
			boolean spaceKont= !sifre.contains(" ");//icermemesi icin basina !-ünlem koysak olur
			boolean uzunlukkont=sifre.length()>=8;
			
			if (ilkHarfKont&&sonHarfKont&&spaceKont&& uzunlukkont ) {
				System.out.println("Sifre basari ile tanimlandi");
			}else {
				System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
			}
		}
scan.close();

	}

}
