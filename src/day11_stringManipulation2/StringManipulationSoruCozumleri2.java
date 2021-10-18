package day11_stringManipulation2;

import java.util.Scanner;

public class StringManipulationSoruCozumleri2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
		basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir
		sifre girin” yazdirin
		- Ilk harf buyuk harf olmali
		- Son harf kucuk harf olmali
		- Sifre bosluk icermemeli
		- Sifre uzunlugu en az 8 karakter olmali*/
				
				Scanner scan=new Scanner(System.in);
				System.out.println("\nLutfen bir sifre giriniz.");
				String sifre=scan.nextLine();
				
				
				if ((sifre.charAt(0)>='A' && sifre.charAt(0)<='Z') //1.sart
						&& (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z') //2.sart
								&& sifre.contains(" ")==false  && sifre.length()>=8  //3.ve 4. sart
								  ) {
					
					System.out.println("Sifre basari ile tanimlandi");
				}else {
					
					System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
				}
				
				
		/*Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
		yazdirin
		isim-soyisim : M***** B*******
		kart no : **** **** **** 1234
		*/
				
		System.out.println("\nLutfen isminizi giriniz.");	
		String isim=scan.nextLine().toUpperCase();
		System.out.println("\nLutfen soyIsminizi giriniz.");
		String soyIsim=scan.nextLine().toUpperCase();
		System.out.println("\nLutfen kredi karti numarasini 16 haneli olacak sekilde  giriniz.");
		String kkNo=scan.next();
		
		char isimIlkHarf=isim.charAt(0);
		char soyIsimIlkHarf= soyIsim.charAt(0);
		System.out.println(kkNo.length());
		
		
		kkNo.replaceAll("", kkNo);
		System.out.println("isim-soyisim : "+isimIlkHarf+isim.substring(1,isim.length()).replaceAll("\\w", "*")+" "
		+soyIsimIlkHarf+soyIsim.substring(1,soyIsim.length()).replaceAll("\\w","*"));
		
		System.out.println("kart no : "+kkNo.substring(0,4).replaceAll("\\d","*")+" "+kkNo.substring(4,8).replaceAll("\\d","*")
				+" "+kkNo.substring(8,12).replaceAll("\\d", "*")+" "+kkNo.substring(12,16));
		
		
		// Hocanin cozumu 2yol
		String isimDuzenlenmis= isim.substring(0,1).toUpperCase() +
								isim.substring(1).replaceAll("\\w", "*");
		
		String soyisimDuzenlenmis= soyIsim.substring(0,1).toUpperCase() +
									soyIsim.substring(1).replaceAll("\\S", "*");
		
		String kkNoDuzenlenmis= "**** **** ****"+kkNo.substring(12);
		
		System.out.println("isim-soyisim : " +isimDuzenlenmis +" " +soyisimDuzenlenmis 
				+"\\nkart no : " +kkNoDuzenlenmis);
		
		
		
		/*
isim-soyisim : M***** O****
kart no : **** **** **** 1234
		 */
	scan.close();
	}

}
