package day11_stringManipulation2;



public class C4_EndsWith {

	public static void main(String[] args) {
// Verilen String’in istenen karakter(ler) ile bitip bitmedigini kontrol eder.
// Istenen karakter(ler) ile bitiyorsa TRUE, yoksa FALSE dondurur

		String str="Calisirsaniz, Java ogrenmek cok kolay";
		
		System.out.println(str.endsWith("y")); //true
		System.out.println(str.endsWith("t")); //false
		System.out.println(str.endsWith("olay")); //true
	
		
		System.out.println(str.startsWith("C")); //true
		System.out.println(str.startsWith("Calis")); //true
		System.out.println(str.startsWith("s",4)); //true
		System.out.println(str.startsWith("Java",14)); //true
		
		System.out.println(str.isEmpty()); //false
		
		String str2="";
		System.out.println(str2.isEmpty()); //true
		
		// String str3=null;
		// System.out.println(str3.isEmpty());// rte hatasi verir
		
		//13- replace()
		//Verilen String’deki istenen karakter(ler)i istenen yeni karakter(ler) ile degistirir.
		
		System.out.println(str.replace("a", "x")); //Cxlisirsxniz, Jxvx ogrenmek cok kolxy
		System.out.println(str.replace("Java", "x")); //Calisirsaniz, x ogrenmek cok kolay
		System.out.println(str.replace("a", "xxx")); //Cxxxlisirsxxxniz, Jxxxvxxx ogrenmek cok kolxxxy
		System.out.println(str.replace("a", "")); //Clisirsniz, Jv ogrenmek cok koly
		System.out.println(str.replace('a', 'x')); //Cxlisirsxniz, Jxvx ogrenmek cok kolxy
		//NOT : replace() methodu char icin de kullanilabilir
		
		String kkNo="1234 5412 3652 4785";
		System.out.println(kkNo.replace(" ", ""));
		System.out.println(kkNo);
		System.out.println(kkNo.replaceAll("\\s", "")); //space olanlari degistirir-bosluklari kaldirir
		System.out.println(kkNo.replaceAll("\\S", "*")); //space olmayanlari degistirir**** **** **** ****
		System.out.println(kkNo.replaceAll("\\w", "-")); //harf ve rakamlar olanlari degistir---- ---- ---- ----
		System.out.println(kkNo.replaceAll("\\W", "#")); //harf ve rakamlar olmayanlari degistir 1234#5412#3652#4785
		System.out.println(kkNo.replaceAll("\\d", "0")); //digit(rakam) olanlari degistirir-0000 0000 0000 0000
		System.out.println(kkNo.replaceAll("\\D", "?")); //rakam olmayanlarý degistirir yerine- 1234?5412?3652?4785
		//syso icinde yapilan manipulationlar asil String'i degistirmez
		// an ve or sadece mantiksal karsilastirmalarda kullanilir.
		/*
\\s : bosluk (space)
\\S : bosluk disindaki tum karakterler
\\w : harfler ve rakamlar (a-z , A-Z, 0-9)
\\W : harfler ve rakamlar disindaki tum karakterler
\\d : rakamlar (0-9)
\\D : rakamlar disindaki tum karakterler
		 */
	
	
		
	}

}
