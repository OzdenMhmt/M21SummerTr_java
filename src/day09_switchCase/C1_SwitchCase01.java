package day09_switchCase;

import java.util.Scanner;

public class C1_SwitchCase01 {

	public static void main(String[] args) {

		// Soru1 : Kullanicidan haftanin kacinci gunu oldugunu
		// sorun ve gun ismini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("haftanin kacinci gunu oldugunu giriniz");
		byte gunNo = scan.nextByte();

		switch (gunNo) {
		case 1:
			System.out.println("Bug�n pazartesi");
			break;
		case 2:
			System.out.println("Bug�n sali");
			break;
		case 3:
			System.out.println("Bug�n carsamba");
			break;	
		case 4:
			System.out.println("Bug�n persembe");
			break;	
			
		case 5:
			System.out.println("Bug�n cuma");
			break;
			
		case 6:
			System.out.println("Bug�n cumartesi");
			break;
		case 7:
			System.out.println("Bug�n pazar");
			break;
			
		default:
			System.out.println("Lutfen gecerli gun numarasi giriniz");

		}
scan.close();
	}

}
