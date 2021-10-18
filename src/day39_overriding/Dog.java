package day39_overriding;

public class Dog extends Animal{
	
	@Override//Annotation -->mutlaka childe yazilir.
	//parent ve child metholarinda iliski kurar
	//overrindg zabita gibi calisir
	//asla signature dounamazsin..
	public void beslenme() {
		System.out.println("kemik ile beslenir..");
	}

	@Override
	public void tatli() {
		System.out.println("fistik sarma");
	}

	@Override
	public String icecek() {
		System.out.println("tursu suyu");
		return "yarasin";
	}

	@Override
	public int topla() {
		return 41+54;
	}

	@Override
	public Dog t() {
		
		return new Dog();
	}
	
}
