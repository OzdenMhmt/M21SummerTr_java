package day07_ifElseStatement;

import java.util.Scanner;

public class C9_NestedIfElse02 {

	public static void main(String[] args) {
/*
 11)Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
 Kullanicidan bir sifre girmesini isteyin
 Eger ilk harf buyuk harf ise ìAî olup olmadigini kontrol edin.
 Ilk harf A ise  ìGecerli Sifreî  degilse ìGecersiz Sifreî yazdirin.
 Eger ilk harf kucuk harf ise ìzî olup olmadigini kontrol edin.
 Ilk harf z ise  ìGecerli Sifreî  degilse ìGecersiz Sifreî yazdirin.
 */

Scanner scan=new Scanner(System.in);

System.out.println("Lutfen bir sifre giriniz...");

char sifre›lkHarf=scan.next().charAt(0);

if (sifre›lkHarf>='a' && sifre›lkHarf<='z') {//kucuk harf
	if (sifre›lkHarf=='z') {
		System.out.println("Gecerli Sifre");
	}else {
		System.out.println("Gecersiz sifre");
	}
	
	
} else if (sifre›lkHarf>='A'  && sifre›lkHarf<='Z') { //b¸y¸k harf
	if (sifre›lkHarf=='A') {
		System.out.println("Gecerli Sifre");
	}else {
		System.out.println("Gecersiz sifre"); }	
	
} else {//yanlis giris
	System.out.println("sifrenin ilk karakteri harf olmali");
}
scan.close();
	}

}
