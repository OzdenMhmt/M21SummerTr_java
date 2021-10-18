package day14_methodCreation2;

import java.util.Scanner;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		/*
		 * Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.,
		 *  Kullanici 2,3 veya 4 degerini girerse, 
		 *  kullanicidan bu sayilari girmesini isteyin 
		 *  ve sayilarin toplamini yazdirin.
		 *   Kullanici toplamak istedigi sayi adedini 4’den buyuk
		 * girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen kac sayi toplamak istersiniz ");
		int kacSayi = scan.nextInt();
		
		
		if (kacSayi<2) {
			System.out.println(" toplamak icin en az iki sayi girmelisiniz ");
		}else if (kacSayi==2) {
			ikiSayiTopla();//sayilari method daalmaya karar verdik
		}else if (kacSayi==3) {
			ucSayiTopla();
		}else if (kacSayi==4) {
			dortSayiTopla();
		}else {
			System.out.println("Cok sayi girdiniz, ben toplayamam");
		}
		
	scan.close();
		}

	public static void dortSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dort tamsayi giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();
		int sayi4 = scan.nextInt();
	System.out.println("girilen dortsayinin toplami : "+(sayi1+sayi2+sayi3+sayi4));
	scan.close();		
	}

	public static void ucSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen uc tamsayi giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();
	System.out.println("girilen ucsayinin toplami : "+(sayi1+sayi2+sayi3));
	scan.close();	
	}

	public static void ikiSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki tamsayi giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int ikiSayiToplami=sayi1+sayi2;
	System.out.println("girilen iki sayinin toplami : "+ikiSayiToplami);
	scan.close();	
	}


		
	}
	
	
	
	


