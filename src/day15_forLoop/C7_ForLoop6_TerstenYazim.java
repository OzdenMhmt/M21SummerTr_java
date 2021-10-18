package day15_forLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C7_ForLoop6_TerstenYazim {

	public static void main(String[] args) {
		//Soru 7 ) Interview Question Kullanicidan bir String isteyin
		//ve Stringi tersten yazdirin. 

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String str=scan.nextLine();
		//1.yol
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.substring(str.length()-i-1,str.length()-1-i+1));
		}
		//2.yol
		System.out.println("");
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.substring(i,i+1));
		}
		scan.close();	
		}
	}


