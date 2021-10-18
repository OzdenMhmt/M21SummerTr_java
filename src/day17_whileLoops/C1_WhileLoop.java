package day17_whileLoops;

public class C1_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 0;
		while (k < 5) {
			System.out.println(k);
			k++;
		}

//Soru 1 ) While loop kullanarak 3 den 13 e kadar 
//tum tek tamsayilari ekrana yazdiriniz.

		int i = 3;
		while (i<= 13) {
			System.out.print(i + " ");
			i += 2;
		}
		
		while (i <=13) {
			if (i%2==1) {
				System.out.print(i + " k");
			}
			i++;
		}
	}
}
