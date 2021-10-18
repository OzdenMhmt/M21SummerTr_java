package day29_passByValue_ImmutableClass;

public class C3_ImmutableClasses1 {

	public static void main(String[] args) {

		int sayi = 10;

		for (int i = 0; i < 1000; i++) {
			i++;
			sayi++;

			// bu kodu calistirdigimizda bu satira kadar java kac obje uretir
			// bu soruyu cevaplamak icin degiskenin data turune bakmaliyiz.
			// sayi'nin data turu : ýnt
			// int mutable 

			String str = "A";

			for (int j = 0; j < 10000; j++) {
				str += "";
			}

			/*
			 * 18.satir ile 22.satir arasinda kac obje olusur\?
			 * i int oldugu icin sadece 1 tane varable olusturur
			 * str String yani immutable  oldugundan 10001 obje olusturur
			 */

		}
	}

}
