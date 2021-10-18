package day17_whileLoops;

import java.util.Scanner;

public class C3_WhileLoop {

	public static void main(String[] args) {
	//Soru 4) Kullanicidan baslangic ve bitis haflerini alin 
	//ve baslangig harfinden baslayip bitis harfinde biten tum harfleri 
	//buyuk harf olarak ekrana yazdirin. 
		//Kullanicinin hata yapmadigini farz edin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ilk harfi giriniz");
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lutfen son harfi giriniz");
		char sonHarf = scan.next().toUpperCase().charAt(0);
		
		char harf=ilkHarf;
		//bu atamayi kullanicidan aldigimzi degeri korumak icin yaptik
		//kullanicidan aldigimiz degeri ileride rahat kullanabilmeliyiz
		//kullanicidan aldigimiz degeri ileride tekra kullanabilmek
		//icin bu yuzden degismemesi lazim
		
		while (harf<=sonHarf) {
			System.out.print(harf+" ");
			harf+=1;
		}
		
	}

}
