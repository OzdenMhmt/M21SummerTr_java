package day20_arrays;

import java.util.Arrays;

public class C6_Arrays_Split_Parcala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Java ogrenmek, IT alaninda yer edinmek demektir.";
		
		//split method'u bize bir array doner
		//donen array'i ya direk yazdirmaliyiz
		System.out.println(Arrays.toString(str.split(",")));
		
		
		//veya metho'dan donen String barindiran bir array oldugundan
		//bir array olusturup ona assign edebiliriz
		String bolunmusArray[]=str.split(",");
		System.out.println(bolunmusArray[1]);
		
		//a'dan itibaren boler
		String bolunmusArray2[]=str.split("a");
		System.out.println(Arrays.toString(bolunmusArray2));
		System.out.println(bolunmusArray2.length);//6
		
		//string'i karakterlere ayirir
		String bolunmusArray3[]=str.split("");
		System.out.println(Arrays.toString(bolunmusArray3));
		System.out.println(bolunmusArray3.length);//48
		
		//cumle kac kelimeden olusur
		String cumle="Java ogren, rahat yasa";
		String[] kelimeArrayi=cumle.split(" ");
		System.out.println(kelimeArrayi.length);//4
		
		//"Java ogren, rahat yasa" cumlesini array ile tersine cevirin-odev
	}

}
