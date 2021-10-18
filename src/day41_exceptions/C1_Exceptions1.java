package day41_exceptions;

import java.util.Scanner;

public class C1_Exceptions1 {
	//kullanicidan alacaginiz iki tam sayinin bolumunu yazdiriniz.
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bolunecek tamsayiyi yazin");
		
		int sayi1=scan.nextInt();
		
		System.out.println("Lutfen kaca bolmek istediginizi yazin");
		int sayi2=scan.nextInt();
		// java exceptions'i handle etmek icin try-catch blogu olusturmus.
		
		
		try {
			System.out.println("bolme isleminin sonucu : " + sayi1/sayi2);
		} catch (ArithmeticException e) {
			System.out.println("bolme isleminde bolen 0 olamazzzzz!!!");
			
		}
		
	}
	
	
}
