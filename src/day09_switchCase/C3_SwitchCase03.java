package day09_switchCase;

import java.util.Scanner;

public class C3_SwitchCase03 {

	public static void main(String[] args) {
		/*
        Soru5 : Kullanicidan gun ismini alip haftaici 
        veya hafta sonu yazdiralim
        */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("haftanin  gun ismi giriniz");
		String gunIsmi =scan.next().toLowerCase();
		
		switch(gunIsmi) {
		case "pazartesi":
		case "sali":
		case "carsamba":	
		case "cuma":
		case "persembe":
			System.out.println("girdiginiz gun haftaici");
			break;
		case "pazar":
		case "cumartesi":
			System.out.println("girdiginiz gun haftasonu");
			break;
		default :
			System.out.println("lutfen gecerli bir gun ismi giriniz");
		}
scan.close();

	}

}
