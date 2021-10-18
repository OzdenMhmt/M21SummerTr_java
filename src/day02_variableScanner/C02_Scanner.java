package day02_variableScanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
	//Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

	//kullanicidan deger almak icin 3 adým atmalýyýz
		
	Scanner scan= new Scanner(System.in);
	
// 2-kulanicidan ne istedigimiz yazdiralim
	
	System.out.println("Lutfen iki tam sayi giriniz :");
	
	// 3- next metodunu kullanarak girilen degerleri alip, olusturacagimiz veriable lara atayalim
	
	int sayi1 = scan.nextInt();
	int sayi2 =scan.nextInt();
	
	System.out.println("Girdiginiz sayilarin toplami :" +(sayi1 + sayi2));
	
	scan.close();
	
	
	}

}
