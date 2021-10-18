package day06_relationalOperators_ifstatements;

public class C1_RelationalOperators_Ben {

	public static void main(String[] args) {
		System.out.println(5 * 3 == 40); //false
	
		System.out.println(15 - 3 == 12); //true
		
		// Java == i gorunce bunun bir karsýlastýrma oldugunu bilir.
		// boolean oldugunu anlar

		// ==eþit eþittir
		boolean esitMi= 24/2==12; //true
		System.out.println(esitMi);
		
		
		// !=eþit degidir dimi
		boolean sonuc1= 5+2!=7; //false
		System.out.println(5*2!=15); //true
		boolean sonuc2= 5+2 >=7; //true
		
		// &&-and ve 2sinin dogru olmasi lazým
		boolean sonuc3=(5+2==7)&&(4+3!=5);//true
		System.out.println((5*2!=15)&&(5>7)); //false 
		
		
		// ||-or veya tekinin dogru olmasi yeterli- (ALTGR-)
		boolean sonuc4= (5+2 == 7) || (4+3 !=5) ; //false
		

		
	}

}
