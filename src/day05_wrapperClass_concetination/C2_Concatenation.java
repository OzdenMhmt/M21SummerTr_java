package day05_wrapperClass_concetination;

public class C2_Concatenation {
//Concatenaion(String Datalari Birlestirme)
	/*
	 * Birden cok String’i + isareti ile topladiginizda Java bu String degiskenleri
	 * birlestirerek yeni bir String olusturur.
	 * 
	 * Not : Eger matematiksel bir islemin icinde String kullanilirsa, matematikteki
	 * oncelikler dikkate alinarak islem yapilir. Sira String ile toplamaya
	 * geldiginde toplama yerine Concatenation uygulanir
	 */

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World";
		int sayi1 = 3;
		int sayi2 = 4;

		// ***kesinlikle sayi ve harf yazmadan,sadece variable kullanarak***

		// Hello1 yazdirin
		System.out.println(str1 + (sayi2 - sayi1));

		// Hello 5 World

		System.out.println(str1 + " " + ++sayi2 + " " + str2);

		// Hello 34
		System.out.println(str1 + " " + sayi1 + --sayi2);

		// 34
		System.out.println(sayi1 + "" + sayi2);
		
		
		
	}

}
