package day08_ternaryOperator;

import java.util.Scanner;

public class C7_NestedTernary {

	public static void main(String[] args) {
//Soru4 ) Kullanicidan dikdortgenin uzunlugunu ve genisligini alin,
//girilen degerlere gore dikdorgenin kare olup olmadigini yazdirin.

		Scanner scan=new Scanner(System.in);
	
		System.out.println("Lutfen dikdortgenin uzunlugunu ve genisligini giriniz");
	
		double a=scan.nextDouble();
		double b=scan.nextDouble();
	System.out.println(a<=0 || b<=0?  "Lutfen gecerli uzunluk giriniz" : a==b?  "Dikdorgen bir karedir" : "Dikdorgen bir kare degil" );
	
	scan.close();
	}

}
