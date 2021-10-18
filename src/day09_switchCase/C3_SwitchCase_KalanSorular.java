package day09_switchCase;

import java.util.Scanner;

public class C3_SwitchCase_KalanSorular {

	public static void main(String[] args) {
		/*

Soru2 : Kullanicidan kacinci ay oldugunu sorun ve ay ismini yazdirin

Soru4 : Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
Kullanici S girerse “Software”
D girerse “Developer”
E girerse “Engineer”
T girerse “In Testing” yazdirin


		 */

Scanner scan=new Scanner(System.in)	;
System.out.println("SDET kisaltmasindaki harflerden birini yaz");
char harf=scan.next().toLowerCase().charAt(0);

switch (harf) {
case 's':
	System.out.println("Software");
	break;
case 'd':
	System.out.println("Developer");
	break;
case 'e':
	System.out.println("Engineer");
	break;
case 't' :	
	System.out.println("In Testing");
	break;
default:
	System.out.println("'SDET' harflerinden birini giriniz");
}

System.out.println("\nkacinci ay oldugunu girin");
byte ay=scan.nextByte();		

switch (ay) {
case 1:
	System.out.println("the month you entered : January");
break;
case 2:
	System.out.println("the month you entered : February");
break;
case 3:
	System.out.println("the month you entered :  March");
break;
case 4:
	System.out.println("the month you entered : April");
break;
case 5:
	System.out.println("the month you entered : May");
break;
case 6:
	System.out.println("the month you entered : June");
break;
case 7:
	System.out.println("the month you entered :July");
break;
case 8:
	System.out.println("the month you entered : August");
break;

case 9:
	System.out.println("the month you entered : September");
break;
case 10:
	System.out.println("the month you entered : October");
break;
case 11:
	System.out.println("the month you entered : November");
break;
case 12:
	System.out.println("the month you entered December");
break;
default :
	System.out.println("\"kacinci ay oldugunu sayi olarak girin\"");
}

switch (ay) {
	case 12:
	case 1:
	case 2:
		System.out.println("\nSeasons: Winter");
	break;
	case 3:
	case 4:
	case 5:
		System.out.println("\nSeasons: Spring");
	break;
	case 6:
	case 7:
	case 8:
		System.out.println("\nSeasons: Summer");
	break;
	case 9:
	case 10:
	case 11:
		System.out.println("\nSeasons: Autumn");
	break;
	
	default :
		System.out.println("\"kacinci ay oldugunu sayi olarak girin\"");
	}
scan.close();
	}

}
