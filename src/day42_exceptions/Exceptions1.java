package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*Icice try-catch yerine
		1 tane try ve multiple catch blogu kullanabiliriz
		Ancak bu durumda yazdigimiz exceptionlar arasinda Parent-Child iliskisi varsa
		Once child class'i yazmaliyiz
		Aksi takdirde(yani once parent yazilirsa) child'a is kalmaz
		Java erisilemez catch-blogu diyerek CTE verir*/
		
		try {
			FileInputStream obj1 =new FileInputStream("C:\\Users\\snynk\\eclipse-workspace\\java2021SummerTr\\src\\day41_exceptions\\Notlar");
			int a=0;
			
			while ((a=obj1.read())!=-1) {
				System.out.print((char)(a));
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		
			
		}
		//FileNotFoundException 
		//IOException 
		//Exception
}

}
