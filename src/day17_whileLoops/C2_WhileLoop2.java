package day17_whileLoops;

public class C2_WhileLoop2 {

	public static void main(String[] args) {
//Soru 2 ) For loop ve while Loop kullanarak 
		//3 basamakli sayilardan 15, 20 ve 90’na tam
		//bolunebilen sayilari yazdirin. 

		for (int i = 100; i <= 999; i++) {
			if (i%15==0 && i%20==0 && i%90==0) {
				System.out.print(i+ " ");
			}
			
		}
		System.out.println("");
		
		int k=100;	
		while (k<1000) {
			if (k%15==0 && k%20==0 && k%90==0) {
				System.out.print(k+ " ");
			}
			k++;

		}
		}
	}

