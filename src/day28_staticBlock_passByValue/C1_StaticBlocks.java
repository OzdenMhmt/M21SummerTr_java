package day28_staticBlock_passByValue;

public class C1_StaticBlocks {
	public static int age;
	static int sayi=10;
	
	static {//kod bloklari-static sayisi keyword'dur
		System.out.println("Static block 2 calisti");
		age=24;
		sayi=20;
	}
	static {
		System.out.println("Static block 1 calisti");
		age=23;
	}
	public C1_StaticBlocks() {
		System.out.println("Consructor calisti");
		System.out.println(++age);
	}

	public static void main(String[] args) {
		System.out.println("Main method calisti 1 : "+sayi);
		System.out.println(++age);
		C1_StaticBlocks obj =new C1_StaticBlocks();
		System.out.println("Main method calisti 2");
		
		//kullanilan class'larin yuzde 90'inda static block yoktur.
		
	}
	static {
		System.out.println("Static block 3 calisti");
		age=100;
	}
}
