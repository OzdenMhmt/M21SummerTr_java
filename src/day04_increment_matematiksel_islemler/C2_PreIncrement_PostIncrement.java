package day04_increment_matematiksel_islemler;

public class C2_PreIncrement_PostIncrement {

	public static void main(String[] args) {
		
		int sayi1=20;
		
		int sayi2=++sayi1; 
		/* preincrement
		 9.satirda 2 iþlem var
		1-sayi1 bir artýrýlýyor
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
		//11, önce arttýr, sonra yazdýr
		
		System.out.println("post increment : "+ sayi3++); 
		//11, önce yazdýr,sonra artýr
		
		System.out.println("post increment'tan sonra sayi3 : " +sayi3); 
		//12, sadece yazdýr
		//java her zaman aklýnda kalan son degeri yazdýrýr(balik hafizali)
		
		
		
		
		
	}

}
