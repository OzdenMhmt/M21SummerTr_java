package day15_forLoop;

import java.util.Scanner;

public class C1_ForLoop01 {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklý bir sayý giriniz");
      int sayi=scan.nextInt();
      int m = sayi;
    
        int rakamlarToplami=0;
            
        for (sayi=m; m>0 ; m/=10) {
            
            int rakam=m%10;
            rakamlarToplami+=rakam;
            
            
        }
            System.out.println("sayýnýn rakamlar toplamý : " + rakamlarToplami+" girdiginiz sayi : "+ sayi);
            
        scan.close();
	
			
		
	
		
		
	}

}
