package day22_23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C1_ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<>();

		List<String> hayvan = new ArrayList<String>();
		// En cok bu kullanilir

		hayvan.add("kedi");// [kedi]
		hayvan.add("yilan");// [kedi,yilan]

		hayvan.add(0, "sinek");
		System.out.println(hayvan);
		

		List<String> isimler = new ArrayList<>();
		isimler.add("Trabzon");
		isimler.add("Samsun");
		isimler.add(0,"Rize");
		System.out.println(isimler);
		
		isimler.add(1,"Ankara");
		
		List<String>yeniList=new ArrayList<>();
		yeniList.add("Firat");
		System.out.println(yeniList);
		
		// yeniList'in sonuna isimler listesini eklemek istersek;
		yeniList.addAll(isimler);
		System.out.println(yeniList); //[Firat, Rize, Ankara, Trabzon, Samsun]
		
		//bir de int elementlerin ýldugu liste olusturalim
		List<Integer>sayilar=new ArrayList<>();
		sayilar.add(5);
		//yeniList.addAll(sayilar); cte verir, in'i stringe cevir der
		
	}

}
