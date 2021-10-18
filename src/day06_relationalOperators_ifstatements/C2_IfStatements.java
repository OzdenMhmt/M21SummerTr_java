package day06_relationalOperators_ifstatements;

public class C2_IfStatements {

	public static void main(String[] args) {

		int a = 2;
		int b = 3;

		if (a > b) {
			System.out.println("a b'den buyuk");
		} // false

		if (a == b) {
			System.out.println("sayilar esit");
		} // false

		if (a > b || a + b < 10) {
			System.out.println("yasasin Java");
		} // true

		// sartin sonucu true ise if body calisir
		// false ise if body calismaz
		// body calisa da calismasa da body'den sonraki satira gider

		// sadece yasasin Java yazdirir

		if (a + b < 0 || a * b < 20) {
			System.out.println("bitti bu iþ");
		}

	
		
	}

}
