package day07_ifElseStatement;

import java.util.Scanner;

public class C5_IfElseIIf01 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen dikdorgenin kenarlarini giriniz /nIlk kenraý girince enter'a basýnýz");

		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();		
if (kenar1<=0 || kenar2<=0) {
	System.out.println("lutfen gecerli uzunluk giriniz");
}	else if (kenar1==kenar2) {
	System.out.println("Girdiginiz dikdortgen karedir");
} else {
	System.out.println("Girdiginiz dikdortgen kare degildir");
}


scan.close();

	}

}
