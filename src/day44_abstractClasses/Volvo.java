package day44_abstractClasses;

public abstract class Volvo {//abss class

	
	public  abstract void kapi() ;//abs method
	public  abstract void motor();//abs meth
	
	public void klima() {//concrete metod
		System.out.println("sunroof ile geceleri mehtaba dalip yoldan cikma");
		
		
		//abstract int sayi; olamaz
		// bir class'i abstract yapmak icin class keyword'unden once 
		// abstract yazmak yeterlidir.
		
		// abstract bir class'in icinde variable olabilir mi ?
		// olabilir
		int fiyat;
		 
		 // variable'lar abstract olur mu ?
		 // olmaz...
		 // public abstract int sayi=10;
		 
		 // abstract class'in tum concrete child'lari abstract class'daki 
		 // tum dinamik ozellikleri yani methodlari
		 // override etmek zorundadir.

	}
}
