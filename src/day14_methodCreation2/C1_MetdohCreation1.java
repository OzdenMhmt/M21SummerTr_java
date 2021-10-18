package day14_methodCreation2;

import java.util.Scanner;

public class C1_MetdohCreation1 {

	public static void main(String[] args) {
//Soru 1 ) Kullanicidan bir sayi alin. 
//Bu sayinin tek mi cift mi oldugunu, 
//sifirdan buyuk mu kucuk mu oldugunu,
// ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin
// toplamini,100’den kucukse sadece 1’ler basamagini 
//yazdiran 3 method olusturun.
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen tamsayi giriniz");
		int sayi = scan.nextInt();

		tekMiCiftmiYazdir(sayi);
		sifirlaKarsilastir(sayi);
		istenenbasamaklariYazdir(sayi);
scan.close();
	}

	public static void istenenbasamaklariYazdir(int sayi) {
		if (sayi < 100) {
			System.out.println("girdginiz sayin birler basamagi : " + sayi % 10);
		} else {// sayi 100 den buyuk 45254
			int rakamlarToplami = 0;
			int rakam = 0;

			rakam = sayi % 10; // 4
			rakamlarToplami += rakam; // 4
			sayi /= 10; //

			rakam = sayi % 10; // 5
			rakamlarToplami += rakam;// 9
			sayi /= 10;

			rakam = sayi % 10; // 2
			rakamlarToplami += rakam;// 11
			sayi /= 10;

			System.out.println("girilen sayi birler,onlar ve yuzler \nbasamaklari toplami : " + rakamlarToplami);
		
		}

	}

	public static void sifirlaKarsilastir(int sayi) {
		if (sayi > 0) {
			System.out.println("girilen sayi pozitif");
		} else if (sayi < 0) {
			System.out.println("girilen sayi negatif");
		} else {
			System.out.println("girilen sayi 0");
		}

	}

	public static void tekMiCiftmiYazdir(int sayi) {
		if (sayi % 2 == 0) {
			System.out.println("girilen sayi cift");
		} else {

			System.out.println("girilen sayi tek");

		}
	}

}
