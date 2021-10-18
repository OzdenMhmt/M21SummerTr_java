package day14_methodCreation2;

import java.util.Scanner;

public class C3_MethodCreation3 {

	public static void main(String[] args) {

/*
 Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre 
 - @ isareti icermiyorsa gecersiz email yazdirin
 - @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
 - @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”		
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen @mail adresinizi giriniz");
		
		String email= scan.next();
	
		emailKontrol(email);//method call
		scan.close();
	}

	public static void emailKontrol(String email) { //data turu yazmak zorundayýz "String"
		if (!email.contains("@")) {
			System.out.println("gecersiz email");
		}else if (!email.contains("@gmail.com")) {
			System.out.println("lutfen gmail adresinizi girin");
		}else if (!email.endsWith("@gmail.com")) {
			System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
		}else {
			System.out.println("maili adresiniz basariyla kaydedildi");
		}
		
	}

}
