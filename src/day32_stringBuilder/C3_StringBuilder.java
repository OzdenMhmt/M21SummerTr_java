package day32_stringBuilder;

import java.util.Scanner;

public class C3_StringBuilder {

	public static void main(String[] args) {
		/*Bir c�mleyi parametre olarak kabul eden, StringBuilder kullanarak c�mleyi ters �eviren ve c�mlenin palindrom
	       olup olmad���n� kontrol eden (b�y�k/k���k harf duyarl�l��� olmadan) bir Java program� yaz�n.
	    (without case sensitivity)
	    Eg : input : I love Java
	    Output: "Reversed sentence : avaJ evol I .
	       It is not a palindrome"*/
		Scanner scan=new Scanner(System.in);
		
		String str=scan.nextLine();
		StringBuilder sb=new StringBuilder(str);
		
		String str2=sb.reverse().toString();
		
		
		
		if (str.equalsIgnoreCase(str2)) {
			System.out.println("�t is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
	
	}

}
