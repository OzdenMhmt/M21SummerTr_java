package day02_variableScanner;

public class C01_Variablies {

	public static void main(String[] args) {
	
		String kelime = "Merhaba"; 
	//Satýrdaki kod sonunda mutlaka ; kullanýlmalýdýr
		System.out.println(kelime);
	//kelimenin variable olduðunu anlar ve deðerini yazdýrýr
	System.out.println("kelime");
	//kelime yazdýrýr
	
	int sayi=20;
	
	System.out.println(    sayi    );
	//öncesindeki ve sonrASINDAKÝ BOÞLUKLARIN ÖNEMÝ YOK
	// yazdýrýrken basina aciklama eklemek istersen
	//girilen sayý:20
	//eger degisken ve acýklamayi birlikte yazdýrmak istersek
	//"aciklama" + variable ismi
	System.out.println("çýkýlan sayý:" +sayi );
	
	boolean tatildeMi = true ;
	
	System.out.println(tatildeMi);
	//konsolda bu sene tatile gittiniz mi ? -true
	
	
	System.out.println("bu sene tatile gittiniz mi? = " +tatildeMi);
	
	/* isim ve soyisim için 2 variable oluþturun ve bunlarý
	 *isminiz:Mehmet
	 soyisminiz:Ozden
	 seklinde yazdirin
	 */
	
	String name ="Mehmet";
	String surname = "Ozden";
	
	System.out.println("isminiz : "+ name );
	System.out.println("soyisminiz : "+surname);
	
	// Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
	
	int sayi1= 10;
	byte sayi2 = 5;
	
	System.out.println(sayi1 + sayi2);
	
	//toplama iþleminin basina aciklama yazmak istersek
	// iki syýnýn toplami =15
	
	System.out.println("iki sayinin toplamý =" + (sayi1 + sayi2));
	// String ve sayisal iþlemleri birlikte yaptýrdýgimizda mat. islemi paranteze alin
//  bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazin
	
	int sayi3= 15;
	float sayi4 = 3.0f ;
	double sayi5= 3.14;
	
	System.out.println(sayi3 +sayi4+ sayi5);
	
	//toplam:21.14
	
	System.out.println("toplam :" + ( sayi3 +sayi4+ sayi5));
	
	// 5- char data turunde bir variable olusturun ve yazdirin
	char karakter='?';
	System.out.println(karakter);
	System.out.println("Girilen karakter :" + karakter);
	
	// 6- BÝR TAMSAYÝ, BÝR DE CHAR degisken olusturun ve bunlarin toplamini, yazdirin
	
	int sayi6=20;
	char harf ='M';
	
	System.out.println(sayi6+harf);  
	//20M
	// char data turundeki islemler mat islemlerinde kullanýlýrsa ASCII tablosu devreye girer
	//Java o karakter yerine ASCII tablosundaki degeri kullanýr.
	

	
	}

}
