package day13_methodCreation1;

import java.util.Scanner;

public class C2_MethodCreation02 {

	public static void main(String[] args) {
		// Kullanicidan 2 tamsayi isteyin
		//Bu sayilarin toplamalarini ve carpimlarini ,
		//iki ayri methodla hesaplayin ve yazdirin
	Scanner scan=new Scanner(System.in);
	System.out.println("2 tamsayi giriniz");
	
	int sayi1=scan.nextInt();
	int sayi2=scan.nextInt();
	
	// 1- ben methoda ne gönderecegim-- sayi1,sayi2 /5-6
	// 2- method ne yapacak --- sayilari toplayip yazdiracak
	// 3- method ne dondurecek-- yazdirma islemi yapacaksa
	//bana bi sey dondurmsene gerek yok
	
	// method olusturmanin kolay yolu
	// method ismini ve parametreleri yazin
	 //5 ve 6
	toplama(sayi1,sayi2);//11
	
	carpma(sayi1,sayi2);//30
	carpma(sayi1+3,sayi2*2);//96
	
	toplama(sayi1+3,sayi2+1); //15
	
	sayi1=20;
	sayi2=15;
	
	toplama(sayi1,sayi2);//35
	carpma(sayi1,sayi2);//300
	
	sayi2=40;
	toplama(sayi1,sayi2);//60
	carpma(sayi1,sayi2);//800
	
	//sonuc olarak uygulamanizda tekrar tekrar kullanmaniz
	//gereken kod bloklari icin her seferinde yeniden yazmak yerine,
	//bu blogu bir method'da yazip ihtiyacimiz oldugu 
	//her seferde cagirmak daha mantiklidir
	
	scan.close();
	}

	//bir method sadece konsolda bir þeyler yazdiracaksa return type 
	//olarak void yazilir
	//bu durumda return keyword'una ihtiyac olmaz
	//bu method bize bir sonuc dondurmez
	
	public static void carpma(int sayi1, int sayi2) {
		System.out.println("girilen sayilarin carpimi : "+ sayi1*sayi2);
		
	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("girilen sayilarin toplami : "+(sayi1+sayi2));
		
	}

	
}
