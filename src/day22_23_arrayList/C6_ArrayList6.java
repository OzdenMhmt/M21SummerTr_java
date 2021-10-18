package day22_23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C6_ArrayList6 {

	public static void main(String[] args) {
// 200'e kadar olan fibonacci sayilarini bir list olarak yazdirin
//1,1,2,3,5,8,13,21,34
		List<Integer> fibonacci = new ArrayList<>();
		fibonacci.add(0);
		fibonacci.add(1);
		fibonacci.add(1);
		System.out.println(fibonacci);// [0, 1, 1]

		int sayi = 0;
		int index = 0;

		while (sayi < 200) {
			sayi = fibonacci.get(index) + fibonacci.get(index + 1);
			if (sayi < 200) {

				fibonacci.add(sayi);
				index++;
			}
		}
		System.out.println(fibonacci);
		

	}

}
