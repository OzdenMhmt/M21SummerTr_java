package day01_variable;

import java.util.Scanner;

public class C02_Scanner01 {

	public static void main(String[] args) {
	
		// 1-kullanıcıdan bilgi alamak icin 3 adima ihtiyac var:
		// 1- Scanner class'indan bir object olusturuyoruz
		Scanner scan = new Scanner(System.in);
		
		//2- kullanıcıya ne istediğiniz bildiren bir mesaj yazin
		System.out.println("Lutfen soyisminizi giriniz");
		
		/*3-Kullnicidan istediğimiz bilginin data turune gore
		 bir variable oluşturup
		 konsolda yazilan bilgiyi kodlarimizin icine aliyoruz
		  */
		String kullanicininSoyIsmi = scan.nextLine();
		
	System.out.println("Girdiğiniz soyisim:" + kullanicininSoyIsmi);
	
	scan.close();
	
	;
	}

}
