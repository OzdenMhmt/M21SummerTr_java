package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C3_Exceptions32 {
	
@SuppressWarnings("resource")
public static void main(String[] args) {
	try {
		FileInputStream obj1 =new FileInputStream("C:\\Users\\snynk\\eclipse-workspace\\java2021SummerTr\\src\\day41_exceptions\\Notlar");

		int a=0;
		
		try {
		while ((a=obj1.read())!=-1) {
			System.out.print((char)(a));
		}	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
