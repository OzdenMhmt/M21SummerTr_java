package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions2 {
	/*
 	Eger handle edilecek exception'lar arasinda parent-child iliskisi varsa
 	bu durmda child exception icin catch blogu yazmasak da kodumuz calisir
 	Child exception'i silmenin 
 	pozitif yani : tek catch blogu ile tum exceptionlar handle edilebilir
 	negatif yonu : bir sorunla karsilastigimizda bunun dosya bulunamadigi icin mi
 					yoksa dosyaokunamadigi icin mi oldugu anlasilamaz
 */
	public static void main(String[] args) {
		try {
			FileInputStream obj1 =new FileInputStream("C:\\sers\\snynk\\eclipse-workspace\\java2021SummerTr\\src\\day41_exceptions\\Notlar");
			int a=0;
			
			while ((a=obj1.read())!=-1) {
				System.out.print((char)(a));
			}	
				
		
	
			
			}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
