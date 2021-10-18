package day11_stringManipulation2;

public class StringManipulationIWork {

	public static void main(String[] args) {
		String str2="Sevdim seni mabuduma canan diye sevdim.Bir ben deðil alem sana." +" Hayran diye sevdim. ";
		String str3= "Mahþer de nebiler bile\r\n"
				+ "Senden medet ister";
		String str4="MAHÞER DE NEBÝLER BÝLE\r\n"
				+ "SENDEN MEDET ÝSTER";

		int sayi1=87;
		int sayi2=29;

		//1concatination
		System.out.println(str2+str3+sayi1+sayi2);
		System.out.println(str2.concat(str3));
		
		//2chatAt()
		System.out.println(str2.charAt(15));//u
		System.out.println(str3.length()); //42
		System.out.println(str3.charAt(41));//r
		
		//3-to uppercase, 4-to lowercase
		System.out.println(str2.toLowerCase());//sevdim seni mabuduma canan diye sevdim.bir ben deðil alem sana. hayran diye sevdim. 
		System.out.println(str3.toUpperCase()); //MAHÞER DE NEBÝLER BÝLE
												//SENDEN MEDET ÝSTER
		
		// 5-equals
		System.out.println(str2.equals(str3));//false
		System.out.println(str3.equals(str4)); //false
		str4.toLowerCase();
		str3.toLowerCase();
		System.out.println(str3.equals(str4)); //false
		String isim1="Mehmet Can";
		String isim2=isim1+"";
		System.out.println(isim1==isim2);//false
		System.out.println(isim1.equals(isim2));//true
		
		//6-equalsIgnoreCase
		System.out.println(str3.equalsIgnoreCase(str4));//true
		System.out.println(isim1.equalsIgnoreCase(isim2)); //true
		
		// 7-lenght()
		System.out.println(str2.length());//84
		System.out.println(str3.length()); //42
		System.out.println(isim1.length());//10
		System.out.println(str4.length());//42
		System.out.println(str2.length()-3);//81
		
		//8-indexof()
		System.out.println(str2.indexOf("a"));//13
		System.out.println(str2.indexOf("alem"));//53
		System.out.println(str3.indexOf("q")); // -1
		System.out.println(str3.indexOf("elalem")); // -1
		System.out.println(str4.indexOf("mahþer"));//-1
		System.out.println(str4.indexOf("MAHÞER"));//0
		System.out.println(str4.indexOf("AHÞER"));//1
		
		//9-lastindexof()
		System.out.println(str2.lastIndexOf("b"));//43
		System.out.println(str2.lastIndexOf("sevdim"));//76-son kullanilan sevdim
		System.out.println(str2.indexOf("sevdim"));//32 -ilk kullanilan sevdim
		System.out.println(str2.lastIndexOf("Hayran"));//64
		System.out.println(isim2.lastIndexOf('m')); //3
		System.out.println(isim2.lastIndexOf('n')); //9
		System.out.println(isim2.lastIndexOf(' ')); //6
		
		//10-contains
		System.out.println(str2.contains("ev")); //true
		System.out.println(str2.contains("mev")); //false
		System.out.println(str4.contains("MEDET"));//true
		System.out.println(str2.contains("")); //true
		System.out.println(str2.contains(" ")); //true
		System.out.println(str3.contains(isim2));//false
		
		//11-endsWith()
		System.out.println(str2.endsWith( "sevdim. " )); //true
		System.out.println(str3.endsWith(isim1)); //false
		System.out.println(str3.endsWith("Senden medet ister")); //true
		System.out.println(str3.endsWith(""));//true
		
		//12-startWith()
		System.out.println(isim1.startsWith("m"));//false
		System.out.println(isim1.startsWith("M"));//true
		System.out.println(str3.startsWith("Mahþer de"));//true
		System.out.println(str2.startsWith("e",1));//true
		
		//13-isEmpty
		System.out.println(str2.isEmpty());//false
		String str5="";
		System.out.println(str5.isEmpty());//true
		String str6=null;
		// System.out.println(str6.isEmpty());//rte verir
		System.out.println(str6); //null
		System.out.println(isim1.isEmpty()); //false
		
		//14-replace()
		System.out.println(str2.replace("a","**"));
		//Sevdim seni m**budum** c**n**n diye sevdim.Bir ben deðil **lem s**n**. H**yr**n diye sevdim. 
		System.out.println(str3.replace("er","yaman"));
		//Mahþyaman de nebilyaman bile
		//Senden medet istyaman
		System.out.println(str3.replace("nebiler","r"));
		//Mahþer de r bile
		//Senden medet ister
		
		
		//15-replaceAll
		String str7="Seni cilgin seni cilgin hadi oradan 58#7913*MLta";
		
		// System.out.println(str7.replaceAll("cilgin", '+')); char kulanilmaz.
		System.out.println(str7.replaceAll("\\s", "*"));
		//Seni*cilgin*seni*cilgin*hadi*oradan*58#7913*MLta
		System.out.println(str7.replaceAll("\\S", "*"));
		// **** ****** **** ****** **** ****** ************
		System.out.println(str7.replaceAll("\\w", "#"));
		//#### ###### #### ###### #### ###### #######*####
		System.out.println(str7.replaceAll("\\W", "?"));
		//Seni?cilgin?seni?cilgin?hadi?oradan?58?7913?MLta
		System.out.println(str7.replaceAll("\\d", "1"));
		//Seni cilgin seni cilgin hadi oradan 11#1111*MLta
		System.out.println(str7.replaceAll("\\D", "2"));
		//222222222222222222222222222222222222582791322222
		
		
		//16-replaceFirst-istenen karakterin ilkini degistirir
		System.out.println(str7.replaceFirst("cil", "333"));
		//Seni 333gin seni cilgin hadi oradan 58#7913*MLta
		System.out.println(str7.replaceFirst("#", "neden"));
		//Seni cilgin seni cilgin hadi oradan 58neden7913*MLta
		System.out.println(str7.replaceFirst("\\d", "AAAAA"));
		//Seni cilgin seni cilgin hadi oradan AAAAA8#7913*MLta
		
		
		//17-substring
		System.out.println(str7.substring(1));
		//eni cilgin seni cilgin hadi oradan 58#7913*MLta
		System.out.println(str7.substring(19,22));
		//lgi
		System.out.println(str7.length()); //48
		//System.out.println(str7.substring(25,4)); RTE verir
		
		//18-trim
		String str8="    java ogrenmek cok guzel ";
		System.out.println(str8);//    java ogrenmek cok guzel
		System.out.println(str8.length());//28
		System.out.println(str8.trim());//java ogrenmek cok guzel
		System.out.println(str8.trim().length());//23
		
		
		
	}

}
