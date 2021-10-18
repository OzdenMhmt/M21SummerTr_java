package day29_passByValue_ImmutableClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C2_PassByValue2 {// arabayi degistirmeye calistik degismedi(yenileriyle)
								// onceki ornekte yolculari degistirdik, yolcular degisti.

	/*
	 * Soru4 : Bir list ve bir array olusturalim ve eleman olarak 10,11,12
	 * ekleyelim. Iki method olusturup list ve array’i degistirmeyi deneyelim 
	 */ 
	 //1.Method’da array’e yeni bir array assign edelim ve yeni halini yazdiralim 
	 //2. Method’da list’e yeni bir list assign edelim ve yeni halini yazdiralim
	 /* 
	 * - Method call’dan sonra main method’da yeniden yazdirip degisip
	 * degismediklerini kontrol edelim.
	 */

	public static void main(String[] args) {
		int arr[] = { 10, 11, 12 };
		System.out.println("ilk olusutrdugumuz array : " + Arrays.toString(arr));

		arrayiDegistir(arr);
		System.out.println("array'i degistir method' calistiktan sonra main method icinde : " + Arrays.toString(arr));
		// araba ornegi icindekiler degisebilir ama araY2i degistiremezseniz
		// hala uzunlugu 3-yeni array' yazmadi

		List<Integer> sayiList = new ArrayList<>();
		sayiList.add(10);
		sayiList.add(11);
		sayiList.add(12);
		System.out.println("ilk olusturdugmuz List : " + sayiList); // [10, 11, 12]

		listDegistir(sayiList);
		System.out.println("listDegistir methodu calistiktan sonra :" + sayiList);

	}

	private static void listDegistir(List<Integer> sayiList) {
		// bu methodda sayiList'e yeni bir deger atayalim
		sayiList = new ArrayList<>();
		sayiList.add(50);
		System.out.println("method icinde degisken list : " + sayiList);

	}

	private static void arrayiDegistir(int[] arr) {
		// bu methodda array'a yeni bir array asssign edelim.
		arr = new int[4];
		arr[0] = 15;
		arr[1] = 25;
		arr[2] = 35;
		arr[3] = 45;

		System.out.println("method icinde arr : " + Arrays.toString(arr));
	}

}
