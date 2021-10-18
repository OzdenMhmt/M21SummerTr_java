package day03_datacasting_increment;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
		
	/*	
	Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
Isminiz : Mehmet
Soyisminiz : Bulut
Kursumuza katiliminiz alinmistir,tesekkur ederiz
*/	
		
	Scanner scan= new Scanner(System.in);	
	
	System.out.println("Lutfen isminiz ve soyisminizi yazýnýz, \nisminiz yazdýktan sonra lutfen enter a basýnýz.");
	
	//alt satýra gecmek istegimizde \n yazarýz
	// \n den sonra bosluk býrakmamak lazim
		 
	String name=scan.nextLine();
	String surname= scan.nextLine();
	
	// next() sadce il kelimeyi alir, girilen deger daha uzunsa ilk kelimeden sonrasi kalir
	//nextLine() ise o satirin sonuna kadar girilen tum degerleri alir
	
	System.out.println("Isminiz :" +name + "\nSoyisminiz :" + surname +"\nKursumuza katiliminiz alinmistir,tesekkur ederiz");
			
scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
