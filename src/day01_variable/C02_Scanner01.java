package day01_variable;

import java.util.Scanner;

public class C02_Scanner01 {

	public static void main(String[] args) {
	
		// 1-kullan�c�dan bilgi alamak icin 3 adima ihtiyac var:
		// 1- Scanner class'indan bir object olusturuyoruz
		Scanner scan = new Scanner(System.in);
		
		//2- kullan�c�ya ne istedi�iniz bildiren bir mesaj yazin
		System.out.println("Lutfen soyisminizi giriniz");
		
		/*3-Kullnicidan istedi�imiz bilginin data turune gore
		 bir variable olu�turup
		 konsolda yazilan bilgiyi kodlarimizin icine aliyoruz
		  */
		String kullanicininSoyIsmi = scan.nextLine();
		
	System.out.println("Girdi�iniz soyisim:" + kullanicininSoyIsmi);
	
	scan.close();
	
	;
	}

}
