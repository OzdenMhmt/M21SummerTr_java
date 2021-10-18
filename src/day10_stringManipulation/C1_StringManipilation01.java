package day10_stringManipulation;

public class C1_StringManipilation01 {

	public static void main(String[] args) {

	String name1="Ali Can";
	String name2="Ali Can";
	String name3=name2+"";	//space yok
	String name4="Ali";
	String name5="Can";
	String name6=name4+" "+name5;
	
	System.out.println(name1.equals(name2)); //true
	System.out.println(name1.equals(name3)); //true
	System.out.println(name1.equals(name6)); //true
	
	//ilk 3 karsilastirma degerler ayni oldugu icin sonuc hep true oldu
	
	System.out.println(name1==name2); //true--ileride analatacam dedi hoca
	System.out.println(name1==name3); //false
	System.out.println(name1==name6); //false
	
	// farkli objeler ayný degeri aldiginda java refaranslara bakar
	// bu referanslar ayni ise true dondurur.farkli ise false dondurur
	
	
	//isinizi saglam kazýða baglamak istiyorsanýz,
	//stringde karsilastirma icin equals kullanmalisiniz
	
	String name7="ALÝ Can";
	String name8="Ali CAN";
	String name9="ali can";
	String name10="alican";
	
	System.out.println(name7.equalsIgnoreCase(name8));//true
	System.out.println(name7.equalsIgnoreCase(name9)); //true
	
	System.out.println(name7.equals(name9));//false
	System.out.println(name8.equalsIgnoreCase(name9));//true
	
	System.out.println(name9.equalsIgnoreCase(name10));//false
	//bosluk farklidir.kendi basina karakterdir.
	//ýgnore sadece buyukluk,kucukluk yonunden bakar bosluk farkliysa false döner.
	//equalsIgnoreCase buyuk kucuk harf ayrini kaldirarak
	//deger karsilastirma
	
	
	
	}

}
