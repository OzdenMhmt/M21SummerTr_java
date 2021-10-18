package day09_switchCase;

import java.util.Locale;

public class C4_StringManipulation01 {

	public static void main(String[] args) {

		String isim = "Mehmet";
		String soyIsim = "Ozden";

		System.out.println(isim + " " + soyIsim); // Mehmet Ozden

		System.out.println(isim.concat(" ").concat(soyIsim)); // Mehmet Ozden

		System.out.println(isim.charAt(2)); // h
		System.out.println(isim.charAt(5)); // t

		/*
		 * System.out.println(isim.charAt(6)); burada syntax acisindan bir hata yok
		 
		 * olmayan index yazilirsa java error verir ancak Java calismaya basladiktan
		  sonra isim variable'na degeri atiyor e 6.index'in olmadigini ancak 17.satira
		  gelince farkediyor
		 
		 * Bu tur hatalari Java ancak Run ettigimizde farkettigi icin ,
		  bunlara Run Time Error RTE denir
		   
		 */

		/*
		*int sayi=isim; // biz kodu yazar yazmaz Java Kodu compile (derleme) eder
		Eger syntax hatasi varsa Java bunu hemen farkeder ve altini cizer
		
		*ve alti cizili bolumu duzeltmeden kodu calistiramayiz
		
		*compile time error denir CTE (CTE ve RTE)
		 */
	
	String str="Hz.Muhammed";
	System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
	
	
	}

}
