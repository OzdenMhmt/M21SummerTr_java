package day36_inheritance;

public class Muhasebeci extends Personel{
	public int saatUcreti;
	public String statu;
	public int maas;
	
	public int maasHesapla() {
		maas=8*30*saatUcreti;
		return maas;
		
		
		

	}

}
