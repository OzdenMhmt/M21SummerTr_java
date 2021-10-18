package day38_inheritance;



public class Mammal extends Animal{
	public Mammal() {
		this('A');
			System.out.println("parametresiz cons.");
		}
		public Mammal(char c) {
			super(34); //parentten p'li cons call
			System.out.println("char parametreli cons.");
		}

		
		
	
	public void mA() {
		System.out.println("mammal");
	}
	public void mC() {
		System.out.println("cat"+"animal");
	}
	public int c=7;
	public int m=4;//parenti ile ayni
	

}
	
