package day16_nestedForLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C1_NestedForLoop1 {

	public static void main(String[] args) {
		/*
		 * Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama
		 * gore asagidaki sekli cizdirin
		 *
		 * * * * * * *
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir rakam giriniz");
		int rakam = scan.nextInt();

		// mesela kullanici 5 girmis olsun

		for (int satirNo = 1; satirNo <= rakam; satirNo++) {
			for (int i = 0; i < satirNo; i++) {
				System.out.print("* ");
			}
			System.out.println("");
			
			
			}
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=4; j++) {
				System.out.print("("+i+j+")");
			}
			System.out.println("");
		}
scan.close();
	}
}
