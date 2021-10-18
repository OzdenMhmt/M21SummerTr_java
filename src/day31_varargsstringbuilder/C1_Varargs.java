package day31_varargsstringbuilder;

import java.util.Scanner;

public class C1_Varargs {

	public static void main(String[] args) {
		// Var---- variety cesitlilik args-- arguments

		// verilen iki sayinin toplamini bulan bir method yaziniz
		// verilen uc sayinin toplamini bulan bir method yaziniz

		int sayi1 = 17;
		int sayi2 = 20;
		int sayi3 = 35;

		ikiSayiTopla(sayi1, sayi2);
		ucSayiTopla(sayi1, sayi2, sayi3);
		topla(17, 20, 35, 76);

	}

	public static void topla(int... sayi) {
		int toplam = 0;
		for (int i : sayi) {
			toplam += i;
		}
		System.out.println("varrags toplam :" + toplam);
	}

	public static void ucSayiTopla(int sayi1, int sayi2, int sayi3) {
		System.out.println("uc sayi toplami : " + (sayi1 + sayi2 + sayi3));

	}

	public static void ikiSayiTopla(int sayi1, int sayi2) {
		System.out.println("iki sayi toplami : " + (sayi1 + sayi2));

	}
}