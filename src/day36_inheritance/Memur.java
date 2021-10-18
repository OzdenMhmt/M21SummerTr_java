package day36_inheritance;

public class Memur extends Muhasebeci {

	public static void main(String[] args) {
	Memur	memur1=new Memur();
	memur1.isim="Ali";
	memur1.soyisim="Can";
	memur1.adres="Inciralti";
	memur1.tel="05445487854";
	memur1.idAtama();
	memur1.statu="chef";
	memur1.saatUcreti=20;
	memur1.maas=memur1.maasHesapla();
	
	Memur	memur2=new Memur();
	memur2.isim="Mehmet";
	memur2.soyisim="Ozden";
	memur2.adres="Bostanli";
	memur2.tel="05528685355";
	memur2.idAtama();
	memur2.saatUcreti=15;
	memur2.maas=memur2.maasHesapla();
	
	
	System.out.println(memur1.id+" "+memur1.maas);
	System.out.println(memur2.id+" "+memur2.maas);
	}

}
