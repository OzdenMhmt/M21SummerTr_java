package day31_varargsstringbuilder;

public class C3_Varargs {

	public static void main(String[] args) {
		// verilen int'lardan ilki haric tum sayilari toplayin ve 
		// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin

		toplama(15,27,555,66);//9720
		toplama(0,34,35,45);//0
		
	}

	public static void toplama(int sayi1,int...sayi) {
		int toplam=0;
		for (int each : sayi) {
			toplam+=each;
		}
		System.out.println(sayi1*toplam);
	}

}
