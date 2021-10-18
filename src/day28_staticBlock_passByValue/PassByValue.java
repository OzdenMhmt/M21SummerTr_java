package day28_staticBlock_passByValue;

public class PassByValue {

	public static void main(String[] args) {
		
		int fiyat=100;
		indirimYap(fiyat); //fiyatta &10 indirim yapicam ve yeni fiyati dondurecem
		
		System.out.println("method call ile yazdirilan indirimli fiyat : "+indirimYap(fiyat));//90
		
		System.out.println("method calistikatan sonra fiyat :"+fiyat);//100
		int zamYuzdesi = 15;
		zamYap(zamYuzdesi);
	}

	private static void zamYap(int zamYuzdesi) {
		// javaya bir method olusturdugumuzda Java bizim main method'da kullandigimiz
		//variable isminde clone{kopya bir variable olsuturur.
		//bunun amaci kod takibini kolaylastirmaktir.
		//bu degsikenin ismini degistirsek de kodumuz problemsiz olarak calisir
		
	}

	public static int indirimYap(int fiyat) {
		fiyat=fiyat*90/100;
		System.out.println("methodda ki fiyat :"+fiyat);
		
		return fiyat;
		//methodun icindeki fiyati-ucret yaptik hata vermdei,
		//cunku ikiside local 2 variable var
		// java pass by value'dur.Localler arasinda gecis yapildiginda kendisini degil degerini gonderir
		//fiyat'in isimini methodda ucret yapmamiza ragmen calisti
		//cunku java fiyatin degerini gonderdi.deger islem gordu.
		
		
	}

}
