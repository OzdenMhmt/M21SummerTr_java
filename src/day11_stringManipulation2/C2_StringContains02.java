package day11_stringManipulation2;

import java.util.Scanner;

public class C2_StringContains02 {

	public static void main(String[] args) {
		/*
		 * Soru 1) Kullanicidan email adresini girmesini isteyin, 
		 * mail @gmail.com iceriyorsa “Email adresiniz kaydedildi”,
		 *  icermiyorsa “Lutfen gmail mail adresinizi giriniz.. 
		 *  “ yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir email giriniz");
		String email = scan.next();

		if (email.contains("@gmail.com")) {
			System.out.println("Email adresiniz kaydedildi");
		} else {
			System.out.println("Lutfen gmail mail adresinizi giriniz..");
		}
		
scan.close();		
	}

}
