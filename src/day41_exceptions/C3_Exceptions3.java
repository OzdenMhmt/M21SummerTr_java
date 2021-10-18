package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C3_Exceptions3 {
public static void main(String[] args) {
	
	try {
		
		FileInputStream fis =new FileInputStream("C:\\Users\\snynk\\eclipse-workspace\\java2021SummerTr\\src\\day41_exceptions\\File");
		int i=0;
		try {
			while ((i=fis.read())!=-1) {
				//int i degeri fis obj read metodu ile atandiginda -1 esit degilse 
				//while lopu calistir
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();// daha cok kullanilir cunku hatanin tum verisini verir
		//handle kolayligi saglar
	}
	System.out.println("devamkee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur");
}
}
