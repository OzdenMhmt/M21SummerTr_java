package day27_staticKeyword;

public class C03_StaticKeyword {
	/*
	 * bir method veya variable'i static yapmanin avantaji:
	 * Static variable ve method'lara ulasamk istedigimizde classIsmi 
	 * yazmaniz yeterli olur
	 * 
	 * Ornegin array'lerde kullandigimiz
	 *  Arrays.toString() method'u static olarak
	 *  java developerlari tarafindan hazirlanmis oldugu icin
	 *  Arrays.toString() yazarak method'u rahatlikla kullanabiliyoruz
	 *  
	 *  Ancak variable'lari static yapmak biraz riskli
	 *  Mesela bir okul uygulamasinda okul ismini static variable olarak
	 *  olusturarak avantaj olarak heryerden rahatlikla okul ismine ulasabiliriz
	 *  
	 *  ama ogrenci objelerinden veya ogretmen objelerinden biri uzerinden biri uzerinden
	 *  okul adi degistirilirse
	 *  tum ogrenciler ve ogretmenler icin okul adi
	 *   kalici olarak degisimis olur
	 *  ve bu da bir uygulama icin istenmeyen bir durumdur.
	 */
	
	static int sayi=15;
	String str="Java";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sayi=20;
		//str="statik olan main methoddan instanca' direk ulasamazsin";
		 staticMethod();
		 //staticOlmayanMEthod();//main method static oldugu icin static olmayan method'u cagiramaz
		 
		
		System.out.println(sayi);
		System.out.println(C01.sayi2);//0
	}
public static void staticMethod() {
	System.out.println("Static variable'lar gokteki Ay gibidir");
	sayi=30;
	//Str="Burada ulasilamz";
}
public void staticOlmayanMEthod() {
	System.out.println("staticOlmayanMEthod calisti");
	staticMethod();//static method'lar her yerden cagrilabilir
	sayi=25;//static variable'lara her yerden ulusilabilir.
	str="static olmayan method'dan static olmayan variable'a ulasabilirim";
	
}
}
