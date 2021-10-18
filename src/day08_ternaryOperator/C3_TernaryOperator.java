package day08_ternaryOperator;

public class C3_TernaryOperator {

	public static void main(String[] args) {

		int y=112;
		System.out.println((y>5)? ("inek"):("koyun"));
		
		System.out.println((y<91)?9:11);
		
		int sayi=75;
		String sonuc=sayi%2==0 ? "sayi cift" : "sayi tek";
		System.out.println(sonuc);
	System.out.println(sayi>100 ? "sayi 100den büyük" : 10);
	
	//direk yazdirdigimiz zaman sonuclarin 2 si ayni cinsten olmak zorunda deil
	
	// String sonuc1=sayi>100 ? "sayi 100 den büyük" :10;
	// farkli data turu sonuclar icin atama yapamayiz.
	//calýsmasý icin(string oldugu icin '10'un týrnak icnde olmasi lazim.
	
	
	int a=1;
	int b=1;
	
	int c= a<10 ? a++ : b++;
	System.out.println(a+","+ b++ + c++);
	}

}
