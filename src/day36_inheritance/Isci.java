package day36_inheritance;

public class Isci extends Muhasebeci{

	public static void main(String[] args) {
	
		Isci isci1= new Isci();
		isci1.isim="Mehmet";
		isci1.soyisim="Alev";
		isci1.tel="12345678";
		isci1.adres="Konak";
		isci1.idAtama();
		isci1.saatUcreti=10;
		isci1.maas=isci1.maasHesapla();
		
		
		Isci isci2= new Isci();
		isci2.isim="Murat";
		isci2.soyisim="Altin";
		isci2.tel="12345678";
		isci2.adres="Buca";
		isci2.idAtama();
		isci2.saatUcreti=11;
		isci2.maas=isci2.maasHesapla();
		
		System.out.println(isci1.id+" "+isci1.maas);
		System.out.println(isci2.id+" "+isci2.maas);
	}

}
