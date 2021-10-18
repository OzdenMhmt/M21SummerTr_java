package day29_passByValue_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C1_PassByValue {

	/*
	 Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. 
	 	Iki method olusturup list elemanlarini artirmayi deneyelim
		- 1. Method’da elemanlari for each loop kullanarak artirin
		- 2. Method’da elemanlari set method’u kullanarak artirin
		- Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim.
	 */
	public static void main(String[] args) {
	List<Integer> sayiList = new ArrayList<>();
	sayiList.add(10);
	sayiList.add(11);
	sayiList.add(12);
	System.out.println("ilk olusturdugmuz List : "+sayiList); // [10, 11, 12]
	
	forLoopIleArtir(sayiList);
	System.out.println("forloop method call'dan sonra : " + sayiList); // [10, 11, 12]
	degistirSet(sayiList);
	System.out.println("Set ile degistirdigimiz liste main method'un icinde : " + sayiList);//[13,14,15] ?
}

public static void degistirSet(List<Integer> sayiList) {
	for (int i = 0; i < sayiList.size(); i++) {
		sayiList.set(i, sayiList.get(i)+5);
	}
	System.out.println("Set ile degistirdigimiz liste method'un icinde : " +sayiList); // [13, 14, 15]
	// Java Pass By Value kullanir ancak list'deki set method'u istisnai olarak
	// method'un icinde yapilan degoisiklikleri de kalici hale getirir.
}

public static void forLoopIleArtir(List<Integer> sayiList) {
	//for each loop ile elemanlari artiralim
	
	for (Integer each : sayiList) { // for each loop ile listeyi guncellemiyoruz
								// sadece herbir elemani tek tek cagirip 3 fazlasini yazdirdik
		each+=5;
		System.out.print(each + " ");//15,16,17
	}
	System.out.println("");
	System.out.println("for each loop'dan sonra list : "+sayiList); // listenin kendisinin degismedigini gorduk //[10, 11, 12]
	//foreach loop'da atama yapamdigim icin listeyi kalici olarak degistiremedim
	//for loop kullanip get method'u ile elementleri cagirinca 
	
		
	
}
}
