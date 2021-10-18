package day20_arrays;

import java.util.Arrays;

public class C4_Arrays4_binarySearch {

	public static void main(String[] args) {
	/*
	 *binarySearch( ) method’u belli bir elemanin bir array’de olup 
	 olmadigini kontrol etmek icin kullanilir.
	 
	Ancak, binarySearch( ) methodunu kullanmadan once mutlaka sort( )
	 methodu kullanilmalidir.sort olmadigi zaman dogru sonuc vermeyebilir
	 */
int[] numbers= {2,8,6,4};
Arrays.sort(numbers); //{2,4,6,8}

//olanlarda index'i verir
System.out.println(Arrays.binarySearch(numbers, 2));//0
//sonuc sayi veya sifirsa aradiginiz rakam var
System.out.println(Arrays.binarySearch(numbers, 4));//1

//olmayanlarda negatif deger verir,olsaydý nerde olurdu. ornegin 4 cevap= -4 olur

System.out.println(Arrays.binarySearch(numbers, 1));
// aradiginiz sayi  yoksa negatif sayi olarak doner=kacici siradayaa eksisi(indexi deil)-1, -0 olmayacagi icin

System.out.println(Arrays.binarySearch(numbers, 3)); //-2

System.out.println(Arrays.binarySearch(numbers, 9));//-5

int number2 []= {1,6,9,2,0,5,9,7,15,27,36};
Arrays.sort(number2);

System.out.println(Arrays.binarySearch(number2, 0));//0
System.out.println(Arrays.binarySearch(number2, 35));//0
}
}