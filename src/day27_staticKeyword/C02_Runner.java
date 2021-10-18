package day27_staticKeyword;

public class C02_Runner {

	@SuppressWarnings("static-access")// bu main method'da static access ile ilgili
										//isleysisi bozmayan kucuk bir hata var 
										//ve ben bunu onayliyorum-satir no29
	
	public static void main(String[] args) {
	
		
		//C01'deki variable'lara ulasmak istesem 
		//ilk once instance mi  statik mi diye bakmam gerekir.
		//ornegin sayi ve str instance variable'lardir,
		//dolayisiyla onlara obje uzerinden ulasabiliriz
		
		C01 obj1=new C01();
		System.out.println(obj1.str);//Yasasin eclipse
		
		obj1.str="Yasasin Faruk";
		
		System.out.println(obj1.str);//Yasasin Faruk
		
		C01 obj2=new C01();
		System.out.println(obj2.str); //Yasasin eclipse
		
		//sayi2 variable'i  static oldugu icin 
		// icin obje'ye ihtiyac DUYULMAZ
		System.out.println(C01.sayi2);//0
		
		C01 obj3=new C01();
		obj3.sayi2=27; //cte vermez,calisir
						//ancak altinis sari cizern ve satir numarsina unlem koyar
						//cunku java daha kisa ve emin bir yol varken nicin obje
						//uzerinden ulastin der
						//bu kodun calismasina engel degidlri onun icin Cte vermez
						//Fakat gereksiz bir islem oldugundan Java bizi uyarir
		System.out.println(obj3.sayi2);//27
		
		
		C01.sayi2=34; //static variable'lara class ismi.variable ismi yazilarak ulasilabilir
		
		System.out.println(C01.sayi2);//34 static variable'lar ulasabilen her obje
									// ve her class icin ortaktir.
		
		
		System.out.println(obj2.sayi2);//34
		System.out.println(obj1.sayi2);//34
	}

}
