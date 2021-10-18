package day22_23_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C3_List3 {

	public static void main(String[] args) {
		List<String> hayvan = new ArrayList<>();
		hayvan.add("kedi"); // [kedi]
		hayvan.add("yilan"); // [kedi, yilan]
		hayvan.set(1,"tavsan");
		System.out.println(hayvan); //[kedi, tavsan] 
		hayvan.set(1, "aslan");
		System.out.println(hayvan);//[kedi, aslan]
		
		List<String>isimler=new ArrayList<>();
		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");
		
		isimler.set(1, "Fatma");
		System.out.println(isimler);//[Ali, Fatma, Zeki]
		
		System.out.println(isimler.set(2, "Mehmet"));//Zeki- var dedi yerinde
		
		System.out.println(isimler.get(1));// Fatma
		
		Collections.sort(hayvan);//kucukten buyuge dogru siralar [aslan, kedi]
		System.out.println(hayvan);
		
		

	}

}
