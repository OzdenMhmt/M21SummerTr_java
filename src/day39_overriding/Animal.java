package day39_overriding;

public class Animal {
	
public void beslenme() {
	System.out.println("tum hayvanlar beslenir..");
}
public void tatli() {
	System.out.println("trilice..");
}
public String icecek() {
	System.out.println("gazoz");
	return"ohhh";
}
public int topla() {

	return 34+6;
}
public Animal t() {

	return new Animal();
}
}