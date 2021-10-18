package day07_ifElseStatement;

import java.util.Scanner;

public class C4_IfElse04 {

	public static void main(String[] args) {
/*Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin 
 eger uc kenar uzunlugu birbirine esit ise 
 ekrana “Eskenar ucgen” yazdirin. 
 Diger durumlarda ekrana“Eskenar degil” yazdirin.*/

Scanner scan=new Scanner(System.in);
	
System.out.println("Lutfen ucgenin kenarlarini yazin");
double a= scan.nextDouble();
double b= scan.nextDouble();
double c= scan.nextDouble();	
	
if (a==b && a==c && b==c) {
	System.out.println("Eskenar ucgen");
} else {
	System.out.println("Eskenar ucgen degil");
}
scan.close();
	}

}
