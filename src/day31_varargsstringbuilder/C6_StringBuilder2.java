package day31_varargsstringbuilder;

public class C6_StringBuilder2 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder();// bos bir sb1 creat ettik.
		// SB e eleman ekleme obj.appent(obj);
		sb1.append("faruk");// faruk
		System.out.println("sb1 ilk harfi :" + sb1);
		sb1.append(" efehan");
		System.out.println("sb1 eklenmis hali :" + sb1);// faruk efehan
		System.out.println("sb1 uzunluk : " + sb1.length()); // 12
		System.out.println("sb1 kapasitesi " + sb1.capacity());// 16
		System.out.println(sb1.append(" guzel insan"));
		System.out.println("sb1 uzunluk : " + sb1.length()); // 24
		System.out.println("sb1 kapasitesi " + sb1.capacity());// 34

		StringBuilder sb2 = new StringBuilder("Mehmet"); // icinde Mehmet degeri olan bir SB uretir
		System.out.println("sb2 : " + sb2);

		StringBuilder sb3 = new StringBuilder(10); // 10 karakter kapasitesi olan bir SB uretir
		System.out.println("sb3 : " + sb3);

		// capacity hafiza yonetimi icin cok onemli
		// kod yazilirken sabt uzunluk veya max.uzunluk belli ise
		// 3.method ile ile olusturarak HAFIZA KULLANIMINI optimize edebiliriz.

	}

}
