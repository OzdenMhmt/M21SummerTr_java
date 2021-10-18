package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C5_IfStatements04 {

	public static void main(String[] args) {
// Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve 
//		dikdortgenin kare olup olmadigini yazdirin


		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen kenar uzunluklarrinidan birini tamsayi olark girin");
		int kenar1=scan.nextInt();
		System.out.println("Lutfen kenar uzunluklarrinidan digerini tamsayi olark girin");
		int kenar2=scan.nextInt();
		
		if (kenar1==kenar2) {
			System.out.println("girdiginiz dikdortgen bir karedir");
		}
if (kenar1!= kenar2) {
	System.out.println("girdiginiz dikdortgen bir kare degil");
}
	
	System.out.println("Lutfen tamsayi giriniz");
	scan.close();
	}

}
