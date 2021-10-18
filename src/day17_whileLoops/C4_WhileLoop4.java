package day17_whileLoops;

import java.util.Scanner;

public class C4_WhileLoop4 {

	public static void main(String[] args) {
//Soru 7 ) Kullanicidan bir sayi alin ve
//bu sayinin rakamlari toplamini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayigiriniz");
		int sayi = scan.nextInt();
		
		int i=sayi;
		int rakamlarToplami=0;
		int rakam=0;
		
		while (i>0) {
		
		rakam=i%10;
		rakamlarToplami+=rakam;
		i=i/10;
	
		}
		System.out.println("girdiginiz " +sayi +" rakamlar toplami " +rakamlarToplami+" ,i :"+i);
		// i ile islem yatik, sayi yerine i'yi kullanmasaydik
		//sayi ile islem yapsaydik buraya girdigimiz sayiyi 
		//yazdirmazdik.cunku sayi degismis olurdu
		scan.close();
	}

}
