package day04_increment_matematiksel_islemler;

public class C2_PreIncrement_PostIncrement {

	public static void main(String[] args) {
		
		int sayi1=20;
		
		int sayi2=++sayi1; 
		/* preincrement
		 9.satirda 2 i�lem var
		1-sayi1 bir art�r�l�yor
		2-sayi2 olusturuluyor ve deger ataniyor
		*/
		
		System.out.println("pre-incremnat sayi1 : " +sayi1); //21
		System.out.println("pre-incremnat sayi2 : " +sayi2); //21
		
		sayi2=sayi1++;
		//post-increment
	
		System.out.println("post-incremnat sayi1 : " +sayi1);//22
		System.out.println("post-incremnat sayi2 : " +sayi2); //21
		
		
		int sayi3=10;
		
		System.out.println("pre increment : "+ ++sayi3); 
		//11, �nce artt�r, sonra yazd�r
		
		System.out.println("post increment : "+ sayi3++); 
		//11, �nce yazd�r,sonra art�r
		
		System.out.println("post increment'tan sonra sayi3 : " +sayi3); 
		//12, sadece yazd�r
		//java her zaman akl�nda kalan son degeri yazd�r�r(balik hafizali)
		
		
		
		
		
	}

}
