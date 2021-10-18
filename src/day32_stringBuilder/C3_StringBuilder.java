package day32_stringBuilder;

import java.util.Scanner;

public class C3_StringBuilder {

	public static void main(String[] args) {
		/*Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	       olup olmadýðýný kontrol eden (büyük/küçük harf duyarlýlýðý olmadan) bir Java programý yazýn.
	    (without case sensitivity)
	    Eg : input : I love Java
	    Output: "Reversed sentence : avaJ evol I .
	       It is not a palindrome"*/
		Scanner scan=new Scanner(System.in);
		
		String str=scan.nextLine();
		StringBuilder sb=new StringBuilder(str);
		
		String str2=sb.reverse().toString();
		
		
		
		if (str.equalsIgnoreCase(str2)) {
			System.out.println("ýt is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
	
	}

}
