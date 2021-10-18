package day24_foreachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C1_List1 {

	public static void main(String[] args) {
		/*
		 * 1)Kullanicidan isimler isteyin ve bunlari bir list’te depolayin. Kullanici
		 * yeter yazana kadar isim istemeye devam edin.
		 * 
		 * Kullanici isim girmeyi bitirdiginde toplam kac isim girdigini ve bunlardan
		 * kac tanesinin asagidaki listede olan isimlerden oldugunu yazdirin
		 * isimList=Ali , Veli, Ayse, Fatma, Zeki, Kemal Not : kucuk buyuk harf onemli
		 * degil
		 * Not: yeter icin kucuk buyuk harf onemli degil ancak isimler icin onemli
		 */
		Scanner scan = new Scanner(System.in);
		List<String> girilenIsimler = new ArrayList<>();
		String isim;
		

		do {
			System.out.println("Lutfen listeye eklmek icin isim giriniz");
			isim = scan.nextLine();
			if (!isim.equalsIgnoreCase("yeter")) {
				girilenIsimler.add(isim);
				

			}

		} while (!isim.equalsIgnoreCase("yeter"));
		//karsilastirmak istedigimiz listeyi olusturalim
		// listenin uzunlugu degismeyecegi icin array olusturup, list'e cevirebilirim.
		//boylece 6 isimi tek tek eklmek zorunda kalmam
		
		String isimler[]={"Ali" , "Veli", "Ayse", "Fatma", "Zeki", "Kemal"};
		List<String>isimList=Arrays.asList(isimler);
		
		//elimizde 2 tane liste var
		//1/kullanicidan aldigimiz isimlerin oldugu girilenIsimler
		//2-karsilastiracagimiz liste --isimler--
		
		System.out.println("toplam : "+girilenIsimler.size()+" isim girdiniz");
		int count=0;
		
		for (int i = 0; i < girilenIsimler.size(); i++) { //loop ile girilen isimleri tek tek cagiridm
			if (isimList.contains(girilenIsimler.get(i))) {
				count++; //eger cagirdigim isim isimListte varsa count'u bir artirdim
			}
		}
		System.out.println("girdiginiz isimlerden count "+count+" tanesi bendeki listede kayitli");
		
	}

}
