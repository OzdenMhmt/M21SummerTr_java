package day08_ternaryOperator;

import java.util.Scanner;

public class C2_IfElseArtikYil2 {

	public static void main(String[] args) {
/*
 Soru 10) Interview Question
Kullanicidan artik yil olup olmadigini
kontrol etmek icin yil girmesini isteyin.
Kural 1: 4 ile bolunemeyen yillar artik yil
degildir
Kural 2: 4�un kati olmasina ragmen 100 ile
bolunebilen yillardan sadece
400�un kati olan yillar artik yildir
 */

		Scanner scan =new Scanner(System.in);
				
		System.out.println("Lutfen artik y�l kontrolu icin yil giriniz");
		int yil=scan.nextInt();
		
		if (yil%4!=0) {
			System.out.println("girdiginiz yil artik yil degildir");
		} else {
			if (yil%100==0 && yil%400==0) {
				System.out.println("girdiginiz yil artik yildir");
			}else if (yil%100==0 && yil%400!=0) {
				System.out.println("girdiginiz yil artik yil degildir");
			} else {
				System.out.println("girdiginiz yil artik yildir");
			}
				
	
		}
	scan.close();	
		
	}

}
