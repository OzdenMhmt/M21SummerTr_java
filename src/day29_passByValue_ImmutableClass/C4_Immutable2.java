package day29_passByValue_ImmutableClass;

public class C4_Immutable2 {

	public static void main(String[] args) { 
		//konu:String Havuzu
		String A="Ali";
		String B="Ali";
		String C=B+"";//C'nin degeri ali olsada concenation var
					//concat olduugunda java risk almaz direk yeni obje olusturur
		String D=C;
		
		//equals method'u sadece icerige bakar.ýcerik hepsinde Ali oldugundan
		//equals iki satirda da true doner
		System.out.println(A.equals(C));//true
		System.out.println(A.equals(B));//true
		System.out.println(D.equals(C));//true
		
		//==  hem icerige hemde referans'a bakar
		//dolayisiyla A==C false verir
		//A ve B objesi farkli farkli objler oldugu halde
		//nicin A==B true dondurur ?
		
		System.out.println(A==C);//false
		System.out.println(A==B);//true
		System.out.println(D==C);//true
		
		//String'de yeni bir obje olusturmdan var olanlari kontrol eder
		// varsa yeni bir referans olusturur.ayni objeye atar
		
		String E=new String("Ali");
		//String non-primitive oldugundan new kelimesini kullanmak gerekir.
		//ama string cok kullanildigi icin String'e ozel olarak new kelimesi kullanmadan
		//yeni String olusturabiliriz String isim="Ali";gibi
		
		System.out.println("new ile olusturdugum E degiskeni :" +E);
		String F=new String("Ali");
		
		System.out.println(E.equals(F));//true
		System.out.println(E==F);//false
	}

}
