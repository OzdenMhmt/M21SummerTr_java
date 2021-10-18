package day41_exceptions;

import java.util.Scanner;

public class C2_Exceptions2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 1;
		while (count <=2) {

			System.out.println("Lutfen bolunecek tamsayiyi yazin");
			int sayi1 = scan.nextInt();
			System.out.println("Lutfen kaca bolmek istediginizi yazin");
			int sayi2 = scan.nextInt();
			try {
				System.out.println("bolme isleminin sonucu : " + sayi1/sayi2);
			} catch (ArithmeticException e) {
				System.out.println("bolme isleminde bolen 0 olamazzzzz!!!");
				System.out.println(e.getMessage()); /// by zero sadece kisa mesaj
				
				e.printStackTrace();
				/*java.lang.ArithmeticException: / by zero
				at day41_exceptions.C2_Exceptions2.main(C2_Exceptions2.java:17)*/
				//kaynagina kadar verir
				
				System.out.println(e);//java.lang.ArithmeticException: / by zero
			}
			count++;
		}
		System.out.println("kod bu satira kadar gayet basarili");
	}
}
