package day42_exceptions;

public class Exceptions5 {
	
	public static void main(String[] args) {
		// Data turlerini casting yaparken uygun olmayan islem yaparsaniz
		// Java ClassCastException verir

		// Eger tamamen sayilardan olusmayan bir String'i int'a cevirmeye
		// calisirsaniz Java NumberFormatException verir

		int sayi=34;
		String str="1453";
		//String str1=sayi;//CTE--> checked exception ClassCast
		
		int okulNo=Integer.parseInt(str);
		
		System.out.println("okul no: "+okulNo);
				System.out.println(str+35);//145335
				System.out.println(okulNo+35);//1488

		String str1="14a3";
		
		//int strSayi=Integer.parseInt(str1);//NumberFormatException unchecked
		
		// un- r(un)checked
		
		Object sayi3=45;
		//String sayiStr=(String)sayi3;   // Explicit narrowing casting
										// ClassCastException
		//int a= (Integer) sayi3;
		//System.out.println(a);
	}
}
