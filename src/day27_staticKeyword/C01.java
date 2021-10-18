package day27_staticKeyword;

public class C01 {

	int sayi = 10;
	static int sayi2;

	String str = "Yasasin eclipse";

	public static void main(String[] args) {
		// instance variable'lara obje uzerinden ulasabilirim

		// obje olusturmak icin constructor kullanmaliyim
		// bu class'da construcktor var mi? var default constructor var
		C01 obj1 = new C01();
		System.out.println(obj1.sayi);
		//sagdaki C01(): class ismi ile ayni ama yaninda () oldugu icin SONSTRUCTOR'dir.
		//soldaki C01;class ismi ile ayni zamanda data turudur

		// obj1.sayi; CTE verir cunku ya tama yapmaliyiz veya yazdirmaliyiz

		System.out.println(obj1.sayi);// 10

		obj1.sayi = 44;
		//System.out.println(sayi); obje urettik diye instance'a direk ulasamyiz,mutlaka obje kullanmaliyiz

		System.out.println(obj1.sayi);//44
		
		C01 obj2=new C01();
		System.out.println(obj2.sayi);//10 her obje farkli, ilk atanan degeri alir.
		
		obj2.sayi=34;
		System.out.println(sayi2);
		//Java run time programdir
	}

}
