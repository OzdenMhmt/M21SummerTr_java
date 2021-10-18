package day33_accessModifier;

public class C2_AcMo2 {
	/*
	 * Eriþim alanlarý : 1- Class ýn içi 2- Paketin içi 3- Projenin içi (yani diðer
	 * paketler) Public : Projenin her tarafýndan eriþilebilir, yani diðer
	 * paketlerden bile. (Class, field, properties, metodlarda, constructor)
	 * default: Yani hiç bir þey yazýlmazsa, yani diðer adý friendly : sadece
	 * paketin içindekiler eriþebilir. (Class, field,properties metodlarda,
	 * constructor) private: Sadece içinde bulunduðu sýnýf tan
	 * eriþilebilir.(field,properties, metodlarda) 1) "private" class member'lar
	 * sadece icinde bulunduklari class'larda kullanilabilirler. Baska class'lardan
	 * "private" class memler'lari (field,properties, metodlarda,
	 * constructor)kullanmak mumkun degildir.
	 * 
	 * 2) Baska package'lerden object olusturursaniz object olusturulan class'i
	 * import etmeniz gerekir.
	 * 
	 * 3) Baska package'lerden default class memberlara ulasamazsiniz. Ayni
	 * package'de iseniz ulasabilirsiniz. "default" ile "package private" es
	 * anlamlidir.
	 * 
	 * 4) public class member'lara herkes her yerden ulasabilir(farkli java projesi
	 * disinda).
	 * 
	 * 5) "protected" class member'lara ayni package icindeyseniz ulasabilirsiniz.
	 * Farkli package'de iseniz iki durum var : a)Child class iseniz
	 * ulasabilirsiniz. b)Child class degil iseniz ulasamazsiniz.
	 * 
	 * 6) Class'larda da access modifier kullanilir. Ama sadece "public" ve
	 * "default" kullanilir. Class olustururken "private" veya "protected" access
	 * modifier kullanilmaz.
	 * 
	 */

	public static void main(String[] args) {
		C1_AcMo1 obj1 = new C1_AcMo1();
		System.out.println(obj1.defaultAge);// 15
		// System.out.println(obj1.privateAge); cte verir
		System.out.println(obj1.protectedAge);// 32
		System.out.println(obj1.publicAge);// 61
		C3_AcMo3 obj2 = new C3_AcMo3();
		System.out.println(obj2.defaultName);// murat
		System.out.println(C3_AcMo3.sayi);

	}

}
