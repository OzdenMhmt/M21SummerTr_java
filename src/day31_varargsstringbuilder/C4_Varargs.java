package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C4_Varargs {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 7, 9 };
		arrTopla(arr);
		System.out.println(arrTopla(arr));
		varargsTopla(1, 3, 5, 7, 9);//25
		System.out.println(varargsTopla(1, 3, 5, 7, 9));//25
		
		System.out.println(varargsTopla(arr));//25
		// varargs array olarak calisir ve argument olarak array yollanabilir
		
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		//System.out.println(varargsTopla(list));
		// toplama(list); varargs esnek oldugu icin list'e benzese de list degildir
		
		// kullanicidan deger alarak varargs calsitirmak istiyorsak
		// girilen degerleri bir array'e kaydetmeliyiz
		// bunun icin kullanicidan aldiginiz degerleri esnek oldugu icin bir list'e koyariz
		// sonra list'i array'e ceviririz.
	}

	// varargs elemanlari toplayan method
	private static int varargsTopla(int... var) {
		int topla = 0;
		for (int each : var) {
			topla += each;
			
		}
		return topla;
	}

	// array elemanlari toplayan method
	public static int arrTopla(int[] arr) {
		int topla = 0;
		for (int each : arr) {
			topla += each;
		}

		return topla;

	}

}
