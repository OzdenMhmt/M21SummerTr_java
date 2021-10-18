package day03_datacasting_increment;

public class C4_DataCasting02 {

	public static void main(String[] args) {
		
	double sayi1=128.14;
	
	int sayi2=(int) sayi1;
	
	System.out.println("double degisken : " +sayi1);
	System.out.println("int degisken : " + sayi2);	
	
	//Java'da EXPLÝCÝT NARROWÝNG DATA CASTÝNG YAPÝLÝRKEN DATA KAYÝPLARÝ OLABÝLÝR
	
	byte sayi3=(byte) sayi2;	
	System.out.println("byte degisken : " +sayi3);
		
	//hatta data kucuk data turune uymasi icin degistirilebilir
	
	//Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin
	int sayi4=95;
	int sayi5=10;
	
	System.out.println("bölme sonucu : " +sayi4/sayi5);
	//Java matematik bilir
	
	
	double sayi6=2000;
	System.out.println(sayi6/sayi5);

	double sayi7=5;
	System.out.println(sayi4/sayi7);
	
	int numA=2;
	numA= numA +3;
	numA= numA +30;
numA+=3;

System.out.println("en son : " +numA);

int numB=10;
numB =numB*7;
numB*=3;

System.out.println("Num B: " +numB);	

numB--;
System.out.println(numB);


	}

}
