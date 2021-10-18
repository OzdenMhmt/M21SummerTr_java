package day14_methodCreation2;

import java.util.Scanner;

public class C4_MethodCreation4 {

	public static void main(String[] args) {
		/*
		 * Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak
		 * kredi karti numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler
		 * kucuk olacak sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda
		 * bosluk olacak sekilde duzelten 2 method yazin, ve programda kullanabilmek
		 * icin duzenlenmis hallerini geri dondurun.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen isminizi adresinizi giriniz");
		String isim = scan.nextLine().toUpperCase();
		System.out.println("lutfen soyisminizi adresinizi giriniz");
		String soyisim = scan.nextLine().toUpperCase();
		System.out.println("lutfen kredi karti numarasini arada bosluk olmadan yaziniz ");
		String kkNo = scan.nextLine().toUpperCase();

		isim = isimDuzelt(isim);
		soyisim = soyisimDuzelt(soyisim);
		kkNo = krediKartiDuzelt(kkNo);
		System.out.println(isim+" "+soyisim+"\n"+kkNo);
		scan.close();
	}

	public static String krediKartiDuzelt(String kkNo) {
		if (!kkNo.contains(" ") && kkNo.length()==16) {
			kkNo = kkNo.substring(0, 4) + " " + kkNo.substring(4, 8) + " " + kkNo.substring(8, 12) + " "
					+ kkNo.substring(12, 16);
		} else {
			System.out.println("Lutfen kredi karti nosunu bosluksuz ve 16 hane giriniz");
		}
			
		return kkNo;
	}

	public static String soyisimDuzelt(String soyisim) {

		soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
		// pratik kullanim acisindan baba adi, ana adi, anne kzilik soyadi vb.
		// tum bilgileri ayni method'u kullanarak istedgimiz formata cevirebiliriz

		return soyisim;
	}

	public static String isimDuzelt(String isim) {
		// bu methodoun amacý musteri ismini nasil yazarsa yazsin
		// ilk harf buyuk digerleri kucuk harf olacak sekilde duzunlemek
		// basta sonda bosluk býrakmissa onlari da yok edelim
		isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
		// musteri isminde yaptigim degisiklikleri main e gondermek icin
		// return type i void yerine variable in data turune uygun bir sekle
		// dondurebilirsin
		return isim;
	}

}
