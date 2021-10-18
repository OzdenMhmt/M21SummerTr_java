package day43_exceptions;

public class Exceptions2 {
	public static void main(String[] args) {

		int arr[] = { 34, 35, 41, 63,21 };

		try {
			System.out.println(arr[6]);

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Hatali index girdiniz ");
		} finally {
			System.out.println("bu ask burda biter, ve ben ceker giderim");
		}

		System.out.println("kod bloke olmamis");
		// Finally blogu try-catch blogu ile veya sadece try blogu ile calisabilir.
		// Finnally blogu catch ile ongordugum bir sorun oldugunda calistigi gibi
		// ongoremedigim bir exception olustugunda da calisir....
	}
}