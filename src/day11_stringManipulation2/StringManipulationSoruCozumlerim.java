package day11_stringManipulation2;

import java.util.Scanner;

public class StringManipulationSoruCozumlerim {

	public static void main(String[] args) {

/*Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” String’ini “Java
ogrenmek cok guzel.” sekline getirin.*/
	
		String str="Java ogrenmek123 Cok guzel@";
		str=str.replace("@", ".").replaceAll("\\d", "").replace("C", "c");
		System.out.println(str);
		
		System.out.println(str.replace("@", ".").replaceAll("\\d", "").replace("C", "c"));

		
/*Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
String str1 = “$13.99”
String str2 = “$10.55”
ipucu : Double.parseDouble() methodunu kullanabilirsiniz.*/
		
		String str1 = "$13.99";
		String str2 = "$10.55";
		str1=str1.replace("$", "");
		str2=str2.replace("$", "");
		double sayi1=Double.parseDouble(str1);
		double sayi2=Double.parseDouble(str2);
		
		System.out.println("\n"+(sayi1+sayi2)+"$");//24.54$
		
		
/*Soru 3) Kullanicidan isim isteyin. Eger
- isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
- isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
- ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("\nLutfen isim giriniz.");
		String isim1=scan.next();
		if (isim1.contains("a") && isim1.contains("Z")) {
			System.out.println("“Girdiginiz isim a ve Z harflerini iceriyor”");
		} else if (isim1.contains("a")) {
			System.out.println("“Girdiginiz isim a harfi iceriyor”");
		}else if (isim1.contains("Z")) {
			System.out.println("“Girdiginiz isim Z harfi iceriyor”");
		}else {
			System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
		}
		
		
//Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
		
		System.out.println("\nLutfen isim ve soyisim giriniz.");
		String isim=scan.next();
		String soyIsim=scan.next();
		
		System.out.println(isim.length());
		System.out.println(soyIsim.length());
		
		if (isim.length()>soyIsim.length()) {
			System.out.println("Ýsim, soyisimden daha uzundur");
		}else if (isim.length()<soyIsim.length()) {
			System.out.println("Soyisim, isimden daha uzundur");
		}else {
			System.out.println("Soyisim, isim uzunlugu esit");
		}
	
//Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
		
		System.out.println("\nLutfen dort harfli bir kelime giriniz.");
		String kelime=scan.next();
		System.out.println(""+kelime.charAt(3)+kelime.charAt(2)+kelime.charAt(1)+kelime.charAt(0));
		
scan.close();
	}

}
