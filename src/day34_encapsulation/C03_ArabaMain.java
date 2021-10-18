package day34_encapsulation;

public class C03_ArabaMain {

	public static void main(String[] args) {
		C04_Araba volvo=new C04_Araba("sc90","beyaz",-2400,-2020);
		C04_Araba audi=new C04_Araba("Q7","bej",-3000,-2021);
		C04_Araba honda=new C04_Araba();
		honda.model="accord";
		honda.renk="siyah";
		honda.setYil(1999);
		honda.setMotor(1400);
		System.out.println(honda.getYil());//1999
		System.out.println(honda.getMotor());//1400
		
		System.out.println(volvo.getMotor());//3000
		System.out.println(audi.getYil());//2021
		
		
		
	}
	
}
/*
C04_Araba volvo=new C04_Araba("sc90","beyaz",3000,2020);
C04_Araba audi=new C04_Araba("Q7","bej",3000,2021);
C04_Araba honda=new C04_Araba();
honda.model="accord";
honda.renk="siyah";
honda.setYil(1999);
*/