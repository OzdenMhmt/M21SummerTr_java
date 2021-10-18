package day42_exceptions;

import java.util.Scanner;

public class Exceptions6 {
	/*
	 
	 Kullanicidan carpma yapmak icin bir String isteyin. 
	 Kullanicinin girdigi String sadece sayilardan olusuyorsa 
	 sayiyi 2 ile carpip sonucu yazdirin.
	 
	Kullanici sayilardan olusmayan bir String girerse 
	“Girdiginiz String sayiya cevrilemez” yazdirin.

	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ey kullanici sayi giriniz");
		String str=scan.nextLine();
		try {
			int sayi=Integer.parseInt(str);
			System.out.println(sayi*2);
		} catch (NumberFormatException e) {
			System.out.println("Girdiginiz String sayiya cevrilemez");
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("calismaya devam");
		scan.close();
		
	}
	
}
