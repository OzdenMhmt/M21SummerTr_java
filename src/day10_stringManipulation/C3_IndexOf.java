package day10_stringManipulation;

import java.util.Scanner;

public class C3_IndexOf {

	public static void main(String[] args) {
	String str="Calisirsaniz, Java ogrenmek cok kolay";
	
	System.out.println(str.indexOf("e")); //22-ilk e 22.indextedir
	System.out.println(str.indexOf(" "));//13 -ilk bosluk 13.indextedir
	System.out.println(str.indexOf("a")); //1
	System.out.println(str.indexOf("")); //0 -hiclik oldugu icin o veriyor
	System.out.println(str.indexOf("t")); //-1-olmayan karakterde java -1 doner
	System.out.println(str.indexOf("Java")); //14 kelime 14.indexte baslar
	System.out.println(str.indexOf('a',11));//15 11.satýr ve sonraki ilk a
	System.out.println(str.indexOf("j"));//-1 kucuk j olmadgi icin -1 verir
	
	
	/*
	 kullanicidan cumle isteyin
	 girdigi striNgte java varsa aferin yazdirin,
	 yoksa daha cok calisman lazim yazdirin
	 kucuk buyuk harF onemsiz olsun.
	 */
	Scanner scan = new Scanner(System.in);
	System.out.println("bir cumle giriniz");
	String cumle=scan.nextLine().toLowerCase();
	
	//cumle.indexOf("java")
	//cumlede java varsa index donecek,yoksa -1 donecek
	
	//1.yol
	if (cumle.indexOf("java")==-1) {
		System.out.println("daha cok calisman lazim");
	}else {
		System.out.println("Aferin");
	}
	
	//2.yol
	if (cumle.indexOf("java")!=-1) {
		System.out.println("Aferin");
	}else {
		System.out.println("daha cok calisman lazim");
	}
	//3.yol-switch
	switch (cumle.indexOf("java")) {
	case-1:
		System.out.println("daha cok calisman lazim");
		break;
		
	default:
		System.out.println("Aferin");
	
	//4.yol-ternary
	System.out.println(cumle.indexOf("java")!=-1? "Aferin" : "daha cok calisman lazim");
	}
	scan.close();
	}

}
