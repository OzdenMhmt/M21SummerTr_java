package day05_wrapperClass_concetination;

public class C3_Concatenation02 {

	public static void main(String[] args) {
		int sayi = 7;
		char ilkHarf = 'a';
		String str = "Java";

		System.out.println(sayi + str + ilkHarf);
		// 7Javaa, bu islem concatenation dur

		System.out.println(sayi + ilkHarf + str);
		// 104Java,ASCII Tablosundan char a yý alýr.
		//bu islem de concatenation dur

		System.out.println(sayi+ilkHarf); //104
		System.out.println(sayi+""+ilkHarf); //7a
		
		/*
		 * Concatenaion (String Datalari Birlestirme) Soru 1 ) Asagida verilen
		 * variable’lari kullanarak istenen sonuclari yazdiran programlari yaziniz.
		 * Variables String str1= “Java”; String str2= “Guzel”; int sayi1=5; int sayi2=4
		 * Istenen Yazilar 1) Java Guzel 54 2) Java 5 Guzel 3) Java 94 4) Java 19 5) 54
		 * Guzel
		 */
	}

}
