package day12_stringManipulation3;

import java.util.Scanner;

public class C04_StringManipulation04 {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten
		// yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("\nLutfen dort harfli bir kelime giriniz.");
		String kelime = scan.next();
		
		System.out.println("" + kelime.charAt(3) + kelime.charAt(2) + kelime.charAt(1) + kelime.charAt(0));
 
		//Hocanin cozumu
	
		if (kelime.length() !=4) {
			System.out.println("\nLutfen 4 harfli bir kelime giriniz.");
		} else {
			System.out.println(kelime.substring(3,4)+kelime.substring(2,3) 
			+kelime.substring(1,2) +kelime.substring(0,1));
		scan.close();
		}
	}

}
