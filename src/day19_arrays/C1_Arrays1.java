package day19_arrays;

import java.util.Arrays;

public class C1_Arrays1 {

	public static void main(String[] args) {
		short arr1[] = new short[5];
		System.out.println(arr1); // arr1 bir array, data turu non-primitive
									// short array'in degil icine koyacagamiz degerlerin data turudur
		// eger non_primitive bir datayi direk syso ile yazdirmaya calisirsaniz
		// eger non-prmitive bir datayi yazdirmaya calisirsaniz
		// java arr1'in referans bilgisini yazdirir

		arr1[0] = 9;
		arr1[1] = 10;
		arr1[2] = 11;
		/*
		 * Soru 1: Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan bir array olusturun
		 * ve bu array’i yazdirin
		 */

		// 1.yontem once olusturup, sonra istedigim indexlere deger atiyorum

		String isimler[] = new String[4];
		isimler[0] = "Ali";
		isimler[1] = "Veli";
		isimler[2] = "Ayse";
		isimler[3] = "Fatma";

		// 2.yontem hem olusturup hem tum indexlere deger atiyorum

		String isimler2[] = { "Ali", "Veli", "Ayse", "Fatma" };

		// isimler array'indeki veli yerine Hasan yazalim

		isimler[1] = "Hasan";
		// isimler[5]="Hakan";// java 5.index var mi yok mu bilmiyor.
		// syntax acisindan sorun olmadigi icin cte vermiyor
		// ama run ettigimizde 5.indexi bulamadigimiz icin RTE verir

		System.out.println(isimler.length);

		System.out.println(isimler[3]);// 3 deki degeri yazar-Fatma

		// array'in tum elemanlarini yazdirma
		// 1.yol loop kullanma

		for (int i = 0; i<isimler.length; i++) {
			System.out.print(isimler[i] + " ");

		}
		System.out.println("");

		// 2.yol Arrays class'indan yardim aliriz
		
		System.out.println(Arrays.toString(isimler));// [Ali, Hasan, Ayse, Fatma]
		// eger arrayi direk yazdirmak istersek Array.toString() method'un kullanmali
		// ve paramaetre olrak array'in ismini yazmaliyiz
		
		long arr3[]=new long[4];
		arr3[0]=1;
		arr3[1]=2;
		arr3[2]=3;
		arr3[3]=4;
		System.out.println(Arrays.toString(arr3));
		
		String arr4[]= {"mehmet","senay","sevcan","merve","emre"};
		arr4[4]="yunus";
		System.out.println(Arrays.toString(arr4));
		System.out.println(arr4.length);
		System.out.println(arr4[3]);
		
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i]+" ");
		}
		System.out.println("");
		System.out.println(Arrays.toString(arr4));
	}

}
