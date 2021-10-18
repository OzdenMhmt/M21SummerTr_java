package day42_exceptions;

import java.util.Scanner;

public class Exceptions7 {

	public static void main(String[] args) {
		// Kullanicidan yasini girmesini isteyin.
		// Kodunuzu kullanici sifirdan kucuk bir sayi girerse Exception verecek
		// sekilde yazin.
		
		
		/*Scanner scan=new Scanner(System.in);
		System.out.println("yasinizi giriniz");
		int age=scan.nextInt();
		
		if (age>0) {
			System.out.println("Girdginiz yas : "+age);
		}else {
			throw new IllegalArgumentException();
		}
		System.out.println("Kod calismaya devem etti");*/
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen yazsinizi giriniz");
		int age=scan.nextInt();
		
		try {
			if (age>0) {
				System.out.println("Girdginiz yas : "+age);
			}else {
				throw new IllegalArgumentException();
			}
		} catch (Exception e) {
		e.getMessage();
			System.out.println("");
		}
		
		
		
		System.out.println("Ey kullanici, sistemi boyle cokertemezsin..Eksi girecegimi hesaplayamacaðim mi sandin?");
		
	}

}
