package day05_wrapperClass_concetination;

public class C1_WrapperClass {
	/*
	 * Character,Byte,Integer,Short,Float,Double primitive data turleri icin
	 * olusturulan wrapperclass’lardir.
	 */

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		String isim = "Mehmet";
		

		System.out.println(isim.charAt(2));
		// isim dedigimizde bircok method listeleniyor
		// cunku isim variable 'nin data turu String
		// non-primitive deger'in yaninda method'lar vardýr

		// "sayi." yazdýgýmýzda method gelmez
		// sayi sayi varia ble'nin data turu int ve primitivedir.
		// primitivelerin data turu sadece value sahiptir.methodlari yoktur.

		/*
		 *****************************
		 * Java primitive data turleri ile methodlari kullanabilmemiz icin Wrapper
		 * class’lari olusturmustur. her primitive data turu icin bir WRAPPER CLASS
		 * olusturmustur.
		 */
		Integer sayi2 = 10;
		System.out.println(sayi2.MAX_VALUE); // 2147483647
		System.out.println(sayi2.MIN_VALUE); // -2147483648

		Short sayi3 = 0;
		System.out.println(sayi3.MAX_VALUE); // 32767
		System.out.println(sayi3.MIN_VALUE); // -32768
		System.out.println(Short.MAX_VALUE); // 32767

		// Wrapper Class kullanimina bir orenek verelim.okul noyu bir arttýralým
		// String i int a cevirme.Ama String'in tamamý sayý olamasý lazým.
		String okulNo = "858";

		// eger string bir variable sadece sayilardan olusuyorsa,
		// bu string i intger a cevirebiliriz

		int okulNoSayiOlarak = Integer.parseInt(okulNo);
		System.out.println(++okulNoSayiOlarak);

		Character basHarf = 'a';
		System.out.println(basHarf.charValue()); // a

		System.out.println(Character.toUpperCase('a')); // A

		

		String c ="Hello";
		int d=2;
		int e=3;
	System.out.println(c+d+e);	//Hello23
	System.out.println(e+d+c);	//5Hello	
	System.out.println(c+(d+e)); //Hello5
	System.out.println(c+d*e);	//Hello6

	}

}
