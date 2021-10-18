package day42_exceptions;

public class Exceptions3 {

	public static void main(String[] args) {
		// null olarak tanimlanmis bir obje ile uygun olmayan bir islem yapmaya
		// calistiginizda
		// Java NullPointerException verir
		// Unchecked exception'dir
		
		String str1 = " "; // space
		String str2 = ""; // hiclik
		String str3 = null; // str3 variable'nin hic bir degere esit
		// olmadigini belirten bir pointer(belirtec-isaretci)

		System.out.println(str1.length());// 1
		System.out.println(str2.length());// 0
		//System.out.println(str3.length());//java.lang.NullPointerException

		System.out.println(str3 + "bos"); // nullbos
		System.out.println(str3.concat("bos")); // NullPointerException-rte(unchecked hatasi verir)

	}

}
