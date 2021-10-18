package day32_stringBuilder;

import java.util.Arrays;

public class C1_StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();// bos bir sb1 creat ettik.
		// SB e eleman ekleme obj.appent(obj);
		sb1.append("faruk");// faruk
		System.out.println("sb1 ilk harfi :" + sb1);
		sb1.append(" efehan");
		System.out.println("sb1 eklenmis hali :" + sb1);// faruk efehan
		System.out.println("sb1 uzunluk : " + sb1.length()); // 12
		System.out.println("sb1 kapasitesi " + sb1.capacity());// 16
		System.out.println(sb1.append(" guzel insan"));
		System.out.println("sb1 uzunluk : " + sb1.length()); // 24
		System.out.println("sb1 kapasitesi " + sb1.capacity());// 34

		StringBuilder sb2 = new StringBuilder("Mehmet"); // icinde Mehmet degeri olan bir SB uretir
		System.out.println("sb2 : " + sb2);

		StringBuilder sb3 = new StringBuilder(10); // 10 karakter kapasitesi olan bir SB uretir
		System.out.println("sb3 : " + sb3);

		// capacity hafiza yonetimi icin cok onemli
		// kod yazilirken sabt uzunluk veya max.uzunluk belli ise
		// 3.method ile ile olusturarak HAFIZA KULLANIMINI optimize edebiliriz.

		// Fazladan ayrilan kapasiteyi silme-->obj.trimToSize();
		sb1.trimToSize();
		System.out.println(sb1.capacity());// 24
		System.out.println(sb1.length());// 24

		// istenenen karakterin indexini alma
		System.out.println(sb1.indexOf("efe"));// 6
		System.out.println(sb1.lastIndexOf("e"));// 16

		// istenen bir karakteriinde'ine gore alma--->obj.charAT();
		System.out.println(sb1.charAt(7));// f

		// belli bir araliktaki characterlri alma--->obj.subSSeQuence();
		System.out.println("" + sb1.subSequence(7, 12));// fehan
		System.out.println(sb1.toString().substring(5)); // efehan guzel insan
		System.out.println(sb1.subSequence(7, sb1.length())); // fehan guzel insan
		// .subSequence(7, 12)) StringBuilder'in methodu

		// sb deki bir indexteki karakteri silme--->obj.delete();
		sb1.delete(3, 7);
		System.out.println("3-7 arasi silinmis sekli :" + sb1);// farfehan guzel insan
		sb1.deleteCharAt(2);
		System.out.println("2.karakterin silinmis hali : " + sb1);// fafehan guzel insan
		// System.out.println("3-7 arasi silinmis sekli :"+sb1.delete(3, 7)); faf guzel
		// insan

		// istenen inexe istenen karakteri veya karkaterleri
		// eklemek--->obj.insert(,ndex,characarler)
		sb1.insert(2, "r");
		System.out.println("2.index eklenmis hali : " + sb1);
		sb1.insert(7, 3.14);// sb1 obj 7.inexine 3.14 value eklendi.
		System.out.println(sb1);// farfeha3.14n guzel insan
		// insert methodu parametre olarak sadece char almaz obj alabilir.
		int arr[] = { 17, 63, 21 };
		sb1.insert(9, Arrays.toString(arr));// sb1'in 9.karakterinden itibaren arr verileri eklendi
		System.out.println("sb ye arr eklenmis hali : " + sb1);// farfeha3.[17, 63, 21]14n guzel insan

		// istenen index'deki chracterin yerine birden fazla character
		// eklemek-->obj.replace(a,b,"characterler)
		StringBuilder sb4 = new StringBuilder("Bugun hava cook sicakk");
		sb4.replace(3, 8, "xxxxxxxyyyyy");
		System.out.println(sb4);//// Bugxxxxxxxyyyyyva cook sicakk

		System.out.println("ozel durum : " + sb4.insert(5, "basarili", 2, 4));// Bugxxsaxxxxxyyyyyva cook sicakk
		/*
		 * 5:sb2 ye basarili ekleme baslangic indexi basarili: eklenencek string 2:
		 * eklenecek Stringin baslangic indexi-->dahil 4: eklenecek Stringin bitis
		 * indexi--->haric
		 */

		// reverse methodu-->obj.reverse(); sb elemanlarini indexe gore ters cevirir.
		StringBuilder sb5 = new StringBuilder("Bugun hava cook sicakk");
		System.out.println(sb5.reverse());// kkacis kooc avah nuguB

		// String ile StringBuilder karsilastirmasi: == equals -->
		// SB de equals metodu string classindan farkli calisir.
		// String clasindaki == opereatoru ile ayni islemi yapar..
		// Hem icerik hemde referans esitligine bakar.

		String s = "hayat";
		StringBuilder sb = new StringBuilder("hayat");
		// System.out.println(s==sb);-->
		// farkli data typlerini karsilastrima operatoru derleyemez CTE
		System.out.println(s.equals(sb));// false
		// stirng vs builder
		// SB toString metodu ile stringe cevirilerek string manipulation methodlari
		// kullanilabilir.
		System.out.println(s.equals(sb.toString()));// true
		// string vs string
		System.out.println(sb.equals(sb.toString()));// false
		// Builder vs string

		System.out.println(sb.toString().concat("guzel"));// hayatguzel
		System.out.println(sb);// hayat
		String d = sb.toString();// simdi atama yapildi
		System.out.println(sb.append(s, 2, 5));
		// sb'ye s'nin 2 ile 5 arasinai apent et
		// hayatyat
	}

}
