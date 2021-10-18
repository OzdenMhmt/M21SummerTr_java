package day38_inheritance;


public class Cat extends Mammal{
	public Cat() {
		super();
		System.out.println("p.siz constructor Cat");
	}
	public Cat(String s) {
		this();
		System.out.println(super.c);
		System.out.println("p.li constructor Cat");
	}
	public void mC() {
		System.out.println("cat");
		
	}
	public void mD() {
		System.out.println("cadi");
		
	}
	public int c=9;//parenti ile ayni	
	public int d=5;
	
	
	
	
	
	
}
	
		