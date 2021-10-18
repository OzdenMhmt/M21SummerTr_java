package day07_ifElseStatement;

import java.util.Scanner;

public class C2_IfElse01 {

	public static void main(String[] args) {
//Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
//ve dikdortgenin kare olup olmadigini yazdirin		

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen dikdorgenin kenarlarini giriniz /nIlk kenraý girince enter'a basýnýz");

		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();

		if (kenar1 == kenar2) {
			System.out.println("Girdiginiz Dikdortgen bir karedir");
		} else {
			System.out.println("Girdiginiz Dikdortgen kare degil");
		}

scan.close();

	}

}
