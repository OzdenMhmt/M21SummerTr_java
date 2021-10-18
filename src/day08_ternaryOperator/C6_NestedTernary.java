package day08_ternaryOperator;

import java.util.Scanner;

public class C6_NestedTernary {

	public static void main(String[] args) {
/*
 * Soru1 : Kullanicidan bir tamsayi alin ve sayi 10’dan 
 * kucukse “Rakam” , 100’den kucukse “iki
basamakli sayi”degilse “uc basamakli veya daha buyuk sayi” yazdirin
 */

Scanner scan=new Scanner(System.in);

System.out.println("Lutfen tam sayi giriniz");

int sayi=scan.nextInt();

System.out.println(sayi<0? "negatif sayi" :sayi<10 ? "Rakam" : ( sayi<100 ? "ikibasamakli" : "uc basamakli veya daha buyuk sayi")) ;

scan.close();
	}

}
