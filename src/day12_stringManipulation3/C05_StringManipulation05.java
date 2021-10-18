package day12_stringManipulation3;

public class C05_StringManipulation05 {

	public static void main(String[] args) {
		/*
		 * Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz String
		 * str1 = “$13.99” String str2 = “$10.55” ipucu : Double.parseDouble() methodunu
		 * kullanabilirsiniz.
		 */

		String str1 = "$13.99";
		String str2 = "$10.55";
		str1 = str1.replace("$", "");
		str2 = str2.replace("$", "");
		Double sayi1 = Double.parseDouble(str1);
		Double sayi2 = Double.parseDouble(str2);

		System.out.println("\n" + (sayi1 + sayi2) + "$");// 24.54$

		
	}

}
