package day19_arrays;

import java.util.Arrays;

public class C2_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[5];

		System.out.println(Arrays.toString(arr));

//ben bir kez olsuturdugum in sonradan uzunlugunu degistirebilir miyim

		// arr[5]=5; //rte verir4

		// array2in lenght2i sonradan degistirilemez
		// array'i kullanisisiz yapanda bu ozelligidir

		arr[2] = 1;
		System.out.println(Arrays.toString(arr));// [0, 0, 1, 0, 0]

		arr = new int[6];
		// bu atama oncekini oldurur,sfir ve yeni bir array olusturur
		// cýktý da 1 sayisini goremeyiz,1 tama iptal oldu
		System.out.println(Arrays.toString(arr));// [0, 0, 0, 0, 0, 0]
		
		//sonuc: array2in uzunlugu degismez
	}
}