package day15_forLoop;

import java.util.Scanner;

public class C8_FoorLoop7 {

	public static void main(String[] args) {
	//Soru 8 ) Interview Question 
	//Kullanicidan bir String isteyin 
	//ve Stringi tersine ceviren bir program yazin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String str=scan.nextLine();
		
		String terstenStr="";

	
		for (int i = 0; i < str.length(); i++) {
			terstenStr=str.substring(str.length()-i-1,str.length()-1-i+1);
		}
		
	}
		
	
	}
	

