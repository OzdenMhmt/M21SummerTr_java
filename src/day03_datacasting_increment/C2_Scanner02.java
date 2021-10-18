package day03_datacasting_increment;

import java.util.Scanner;

public class C2_Scanner02{

	public static void main(String[] args) {

//Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

		
	Scanner scan= new Scanner(System.in);
	
	System.out.println("lutfen isminizi giriniz");
	
	char ilkHarf= scan.next().charAt(0);
	//0-5 Mehmet M= index o = 1.harf
	// h harfi , indexte 2.harf
		
	System.out.println("girdiginiz kelimenin ilkharfi:" +ilkHarf);
	
	scan.close();
	
	
	
	
	
	}

}
