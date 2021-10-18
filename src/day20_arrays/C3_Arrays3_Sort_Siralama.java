package day20_arrays;

import java.util.Arrays;

public class C3_Arrays3_Sort_Siralama {

	public static void main(String[] args) {
		
//verilen bir array'i buyukten kucuge sirlayan bir method yaziniz
		
		int arr[] = {3, 15,10, 11,9};
		
		arr=siralama(arr);
		System.out.println("siralanmis hali : "+Arrays.toString(arr));
		
		arr=arrTers(arr);
		
	//System.out.println(Arrays.toString(arrTers(arr)));//sonucu sadece yazdirmak istiyorsak
	System.out.println("Tersten siralanmis hali : "+Arrays.toString(arr));
	
	int arr2[]= {7,9,8,7,6,99,13};
	
	arr2=siralama2(arr2);
	System.out.println("siralanmis hali : "+Arrays.toString(arr2));
	
	arr2=tersYazim2(arr2);
	System.out.println("ters yazim : "+Arrays.toString(arr2));
}

	private static int[] tersYazim2(int[] arr2) {
		int temp[]=new int [arr2.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i]=arr2[arr2.length-1-i];
		}
		return temp;
		
		
	}

	public static int[] siralama2(int[] arr2) {
		Arrays.sort(arr2);
		return arr2;
		
		
	}

	public static int[] arrTers(int[] arr) {
		int[]temp=new int[arr.length];
		//eski array ile ayni uzunlukta yeni bir array olusturdum.
		//array'in tum degerleri 0 oldu bu degerleri dolduruyoruz
		
		for (int i = 0; i < temp.length; i++) {
			temp[i]=arr[arr.length-1-i];
		}
		return temp;
		
	}

	public static int[] siralama(int[] arr) {
		//oncellikle array'i kucukten buyuge sirlamaliyiz
		
		Arrays.sort(arr);
		return arr;
	}
}