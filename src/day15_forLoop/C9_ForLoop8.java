package day15_forLoop;

import java.util.Scanner;

public class C9_ForLoop8 {

	public static void main(String[] args) {
		/*Soru 11 ) Interview Question 
		 * Kullanicidan 10’den kucuk bir sayi isteyin ve girilen
			sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)*/

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 10’dan kucuk bir pozitif tamsayii giriniz");
		
		int sayi=scan.nextInt();
		int faktoriyel=1;
		
		for (int i = 1; i <= sayi; i++) {
			faktoriyel*=i;
			//System.out.println(faktoriyel);// her adimi gorursun	
		}
		System.out.println(faktoriyel);//sadece sonucu yazar
	}

}
