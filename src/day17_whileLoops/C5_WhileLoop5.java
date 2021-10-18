package day17_whileLoops;

import java.util.Scanner;

public class C5_WhileLoop5 {

	public static void main(String[] args) {
	/*
	 kullanicidan kodlamak uzere sayi isteyin
	 toplam 200 oluncaya kadar sayi istemeye devam edin
	 toplam 200 u gectiginde 
	 kullanicinin kac sayi girdigini
	 ve bu sayilarin toplaminin kac oldugunu yazdirin	
	 */
		
	//for loop da bir islem yapabilmek icin tekrar sayisini bilmek lazim(adim sayisi)
	//while loop ta ise adim sayisi degil bitirme kodu onemlidir.
		
		Scanner scan = new Scanner(System.in);
		
		int sayiToplami=0;
		int sayi=0;
		int sayac=0;
		
		while(sayiToplami<=200) {
			System.out.println("lutfen toplamak ici bir tamsayi giriniz");
			sayi=scan.nextInt();
			sayiToplami+=sayi;
			sayac++;
		}
		//bu satira toplamin 200 u gectiginden eminiz
		System.out.println("toplam : "+sayiToplami +" girdiginiz sayi adedi : "+sayac);
		
		// eger adim saysisi bilinmiyorsa veya ongorulemiyorsa
		//for lopp degil while kullanmak daha mantikli olabilir
		
		//eger adimlar belli ise for loop kullanmak daha mantikli olabilir
		//iki fazla satir yazmaktan,
		//veya degisimi unutup sonsuz loop'a girmekten kurtulmus oluruz
		
		scan.close();
		
		
	}

}
